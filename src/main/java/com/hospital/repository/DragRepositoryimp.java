/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.repository;

import java.util.ArrayList;
import java.util.List;
import model.Doctors;
import model.Drags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Faysal
 */
@Repository
public class DragRepositoryimp implements DragRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    ArrayList dragsList;
    
    @Override
    public List<Drags> getList() {
        List<Drags> list = new ArrayList();
        
        String sql = "SELECT * FROM Drags";
        list=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Drags.class));
        
        return list;
    }

    @Override
    public Drags getSingleUser(Long id) {
        Drags drag = null;
        
          String sql = "SELECT * FROM Drags where id = '"+id+"'";
        drag=(Drags)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Drags.class));
        return drag;

    }

    @Override
    public boolean addData(Drags drag) {
       boolean successfullyInserted = false;
       String Name=drag.getName();
        System.out.println(Name);
        String sql = "insert into Drags (name) values('" + drag.getName() +"' ) ";
        jdbcTemplate.update(sql);
        
       successfullyInserted = true;
       
        return successfullyInserted;
    
    }
    @Override
    public void deleteData(Long id) {

        String deleteQuery = "delete from doctors where id = ?";
        jdbcTemplate.update(deleteQuery, id);
        
    }

    @Override
    public boolean updateData(Drags drag) {

        boolean rowUpdated = false;
        String sql = "update doctors set name = ?,UserId= ?, Password =?";
        jdbcTemplate.update(sql, drag.getName());
        rowUpdated = true;
       
            return rowUpdated;
    }

}

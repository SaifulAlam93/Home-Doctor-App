/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.repository;

import java.util.ArrayList;
import java.util.List;
import model.Doctors;
import model.Dosage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Faysal
 */
@Repository
public class DoseRepositoryimp implements DoseRepository {

     @Autowired
    private JdbcTemplate jdbcTemplate;
    ArrayList doseList;
    
    
    
    
    @Override
    public List<Dosage> getList() {
        List<Dosage> list = new ArrayList();
        
      String sql = "SELECT * FROM Dosage";
        list=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Dosage.class));  
        
        return list;
    }

    @Override
    public Dosage getSingleUser(Long id) {
        Dosage dose = new Dosage();
        
        
        String sql = "SELECT * FROM Dosage where id = '"+id+"'";
        dose=(Dosage)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Dosage.class));
        return dose;
    }

    @Override
    public boolean addData(Dosage dose) {
         boolean successfullyInserted = false;
        String sql = "insert into Dosage (morning,doseM,afternoon,doseA,night,doseN) values('" + dose.getMorning() + "','" + dose.getAfternoon()+ "','" + dose.getNight()+ "','" + dose.getDoseM()+ "','" + dose.getDoseA()+ "','"  + dose.getDoseN() +"' ) ";
        jdbcTemplate.update(sql);
        
       successfullyInserted = true;
        
        
        return successfullyInserted;
        
        
    }

    @Override
    public void deleteData(Long id) {
        String deleteQuery = "delete from Dosage where id = ?";
        jdbcTemplate.update(deleteQuery, id);
       
    }

    @Override
    public boolean updateData(Dosage dose) {
        boolean rowUpdated = false;
        String sql = "update Dosage set name = ?,UserId= ?, Password =?";
        jdbcTemplate.update(sql, dose.getMorning(), dose.getAfternoon(), dose.getNight(),dose.getDoseM(), dose.getDoseA(), dose.getDoseN());
        rowUpdated = true;
        
            return rowUpdated;
     
        
    }

}

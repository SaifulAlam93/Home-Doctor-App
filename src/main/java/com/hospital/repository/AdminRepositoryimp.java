/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.repository;

import java.util.ArrayList;
import java.util.List;
import model.Admin;
import model.PatientDitails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Faysal
 */
@Repository
public class AdminRepositoryimp implements AdminRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
 ArrayList adminList;
 
 
    @Override
    public List<Admin> getList() {
        List<Admin> list = new ArrayList();
        
        
        String sql = "SELECT * FROM Admin";
        list=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Admin.class));
        return list;
    }

    @Override
    public Admin getSingleUser(Long id) {
        Admin admin = null;
        
        String sql = "SELECT * FROM Admin where id = '"+id+"'";
        admin=(Admin)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Admin.class));
       
        return admin;
    }

    @Override
    public boolean addData(Admin admin) {

       boolean successfullyInserted = false;
        String sql = "insert into Admin (name,Password) values('" + admin.getName() + "','" + admin.getPassword() +"' ) ";
        jdbcTemplate.update(sql);
        
       successfullyInserted = true;
        
        
        return successfullyInserted;
        
    }
    
    @Override
    public void deleteData(Long id) {
        
        
        String deleteQuery = "delete from admin where id = ?";
        jdbcTemplate.update(deleteQuery, id);
        
    }

    @Override
    public boolean updateData(Admin admin) {
       boolean rowUpdated = false;
        String sql = "update admin set name = ?, Password =?";
        jdbcTemplate.update(sql, admin.getName(), admin.getPassword());
        rowUpdated = true;
        
            return rowUpdated;
    }     
    
public List<PatientDitails> getAllPList() {
        List<PatientDitails> list = new ArrayList();

        String sql = "SELECT patient.id,patient.name, patient.gender, Doctors.name as doctors_name,drags.name as drags_Name,Dosage.morning,Dosage.doseM,Dosage.afternoon,Dosage.doseA,Dosage.night,Dosage.doseN \n"
                + "FROM patient\n"
                + "JOIN Doctors ON Doctors.Id = patient.doctorId \n"
                + "JOIN drags ON drags.Id = patient.dragsId \n"
                + "JOIN Dosage  ON Dosage.Id = patient.dosageId \n"
                + "ORDER BY patient.id;";
        list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(PatientDitails.class));
        return list;
    }
    
    
}

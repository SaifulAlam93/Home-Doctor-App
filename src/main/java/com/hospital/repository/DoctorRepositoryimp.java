/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.repository;

import java.util.ArrayList;
import java.util.List;
import model.Doctors;
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
public class DoctorRepositoryimp implements DoctorRepository {

    
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    ArrayList doctorList;
    
    
    
    @Override
    public List<Doctors> getList() {
        List<Doctors> list = new ArrayList();
        
        String sql = "SELECT * FROM doctors";
        list=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Doctors.class));
        return list;
        
    }

    @Override
    public boolean addData(Doctors doctor) {
        boolean successfullyInserted = false;
        String sql = "insert into doctors (name,UserId,Password) values('" + doctor.getName() + "','" + doctor.getUserid()+ "','" + doctor.getPassword() +"' ) ";
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
    public boolean updateData(Doctors doctor) {
        boolean rowUpdated = false;
        String sql = "update doctors set name = ?,UserId= ?, Password =?";
        jdbcTemplate.update(sql, doctor.getName(), doctor.getUserid(), doctor.getPassword());
        rowUpdated = true;
       
            return rowUpdated;      
    }
  
    @Override
    public Doctors getSingleUser(Long id) {
        Doctors doctor = null;
        String sql = "SELECT * FROM doctors where id = '"+id+"'";
        doctor=(Doctors)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Doctors.class));
        return doctor;
        
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

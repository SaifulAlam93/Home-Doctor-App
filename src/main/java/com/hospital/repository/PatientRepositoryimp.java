/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.repository;

import java.util.ArrayList;
import java.util.List;
import model.PatientDitails;
import model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Faysal
 */
@Repository
public class PatientRepositoryimp implements PatientRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    ArrayList doctorList;

    @Override
    public List<PatientDitails> getList() {
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

    @Override
    public Patients getSingleUser(Long id) {
        Patients patients = null;
        String sql = "SELECT * FROM Patients where id = '" + id + "'";
        patients = (Patients) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Patients.class));
        return patients;

    }

    @Override
    public boolean addData(Patients patient) {
        boolean successfullyInserted = false;
        String sql = "insert into Patients (name,gender,doctorId,dragsId,dosageId,userName,password) values('" + patient.getName() + "','" + patient.getPassword() + "','" + patient.getGender() + "','" + patient.getUserName() + "','" + patient.getDoctorId() + "','" + patient.getDosageId() + "','" + patient.getDragsId() + "' ) ";
        jdbcTemplate.update(sql);
        successfullyInserted = true;

        return successfullyInserted;

    }

    @Override
    public void deleteData(Long id) {

        String deleteQuery = "delete from Patients where id = ?";
        jdbcTemplate.update(deleteQuery, id);

    }

    @Override
    public boolean updateData(Patients patient) {
        boolean rowUpdated = false;
        String sql = "update Patients set name = ?,gender= ?,doctorId= ?,dragsId= ?,dosageId= ?,userName= ?, password =?";
        jdbcTemplate.update(sql, patient.getName(), patient.getGender(), patient.getDoctorId(), patient.getDragsId(), patient.getDosageId(), patient.getUserName(), patient.getPassword());
        rowUpdated = true;

        return rowUpdated;
    }

}

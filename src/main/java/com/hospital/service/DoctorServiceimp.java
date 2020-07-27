/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.service;

import com.hospital.repository.DoctorRepositoryimp;
import java.util.List;
import model.Doctors;
import model.PatientDitails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gmsif
 */
@Service
public class DoctorServiceimp implements DoctorService{

    @Autowired        
    DoctorRepositoryimp doctorRepositoryimp;
    
    
    @Override
    public List<Doctors> getList() {

List<Doctors> list =  doctorRepositoryimp.getList();
    return list;


    }

    
    public List<PatientDitails> getAllPList() {
     return doctorRepositoryimp.getAllPList();
    }
    
    
    @Override
    public Doctors getSingleUser(Long id) {
    Doctors doctors=doctorRepositoryimp.getSingleUser(id);
    return doctors;
    }

    @Override
    public boolean addData(Doctors doctor) {
boolean status = doctorRepositoryimp.addData(doctor);
        return status;

    }

    @Override
    public void deleteData(Long id) {
doctorRepositoryimp.deleteData(id);  
    }

    @Override
    public boolean updateData(Doctors doctor) {


    boolean status = doctorRepositoryimp.updateData(doctor);
    return status;  
 
 }
    
}

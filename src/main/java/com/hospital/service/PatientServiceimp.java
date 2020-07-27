/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.service;

import com.hospital.repository.PatientRepositoryimp;
import java.util.List;
import model.PatientDitails;
import model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gmsif
 */
@Service
public class PatientServiceimp implements PatientService{

     @Autowired  
     PatientRepositoryimp patientRepositoryimp;
    
    
    @Override
    public List<PatientDitails> getList() {

    return patientRepositoryimp.getList();
    }

    @Override
    public Patients getSingleUser(Long id) {
Patients patients=patientRepositoryimp.getSingleUser(id);
    return patients;
   
    }

    @Override
    public boolean addData(Patients patient) {
boolean status = patientRepositoryimp.addData(patient);
        return status;
    }

    @Override
    public void deleteData(Long id) {
        patientRepositoryimp.deleteData(id);
    }

    @Override
    public boolean updateData(Patients patient) {
boolean status = patientRepositoryimp.updateData(patient);
    return status;
    }
    
}

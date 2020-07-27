/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.repository;

import java.util.List;
import model.PatientDitails;
import model.Patients;

/**
 *
 * @author Faysal
 */
public interface PatientRepository {
    
    public List<PatientDitails> getList();
    public Patients getSingleUser(Long id);
    public boolean addData(Patients patient);
    public void deleteData(Long id);
    public boolean updateData(Patients patient);
}

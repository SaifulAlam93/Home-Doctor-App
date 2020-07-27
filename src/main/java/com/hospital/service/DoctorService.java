/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.service;

import java.util.List;
import model.Doctors;

/**
 *
 * @author Faysal
 */
public interface DoctorService {
   
    public List<Doctors> getList();
    public Doctors getSingleUser(Long id);
    public boolean addData(Doctors doctor);
    public void deleteData(Long id);
    public boolean updateData(Doctors doctor);
}

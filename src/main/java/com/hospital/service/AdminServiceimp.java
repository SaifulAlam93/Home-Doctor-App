/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.service;

import com.hospital.repository.AdminRepositoryimp;
import java.util.List;
import model.Admin;
import model.PatientDitails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Faysal
 */
@Service
public class AdminServiceimp implements AdminService{
    
    @Autowired        
    AdminRepositoryimp adminRepositoryimp;

    @Override
    public List<Admin> getList() {
     List<Admin> list =  adminRepositoryimp.getList();
    return list;
    }

    public List<PatientDitails> getAllPList() {
     return adminRepositoryimp.getAllPList();
    }
    
    
    
    @Override
    public Admin getSingleUser(Long id) {
    Admin admin=adminRepositoryimp.getSingleUser(id);
    return admin;

    }

    @Override
    public boolean addData(Admin admin) {
   boolean status = adminRepositoryimp.addData(admin);
        return status;

    }

    @Override
    public void deleteData(Long id) {
        adminRepositoryimp.deleteData(id);
    }

    @Override
    public boolean updateData(Admin admin) {

    boolean status = adminRepositoryimp.updateData(admin);
    return status;
    }

    
}

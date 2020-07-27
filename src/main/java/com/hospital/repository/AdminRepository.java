/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.repository;

import java.util.List;
import model.Admin;

/**
 *
 * @author Faysal
 */
public interface AdminRepository {
    
    public List<Admin> getList();
    public Admin getSingleUser(Long id);
    public boolean addData(Admin admin);
    public void deleteData(Long id);
    public boolean updateData(Admin admin);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.service;

import com.hospital.repository.*;
import java.util.List;
import model.Dosage;


public interface DoseService {
    public List<Dosage> getList();
    public Dosage getSingleUser(Long id);
    public boolean addData(Dosage dose);
    public void deleteData(Long id);
    public boolean updateData(Dosage dose);
}

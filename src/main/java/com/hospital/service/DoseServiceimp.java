/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.service;

import com.hospital.repository.DoseRepositoryimp;
import java.util.List;
import model.Dosage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gmsif
 */
@Service
public class DoseServiceimp implements DoseService{

    
     @Autowired        
    DoseRepositoryimp doseRepositoryimp;
    
    
    @Override
    public List<Dosage> getList() {
    List<Dosage> list =  doseRepositoryimp.getList();
    return list;
    }

    @Override
    public Dosage getSingleUser(Long id) {
    Dosage dosage=doseRepositoryimp.getSingleUser(id);
    return dosage;
    }

    @Override
    public boolean addData(Dosage dose) {
boolean status = doseRepositoryimp.addData(dose);
        return status;

    }

    @Override
    public void deleteData(Long id) {

doseRepositoryimp.deleteData(id);
    }

    @Override
    public boolean updateData(Dosage dose) {
boolean status = doseRepositoryimp.updateData(dose);
    return status;
    }
    
}

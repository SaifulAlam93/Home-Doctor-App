/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.service;

import com.hospital.repository.DragRepositoryimp;
import java.util.List;
import model.Drags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gmsif
 */
@Service
public class DragServiceimp implements DragService{

    
    
    @Autowired    
    DragRepositoryimp dragRepositoryimp;
    
    
    @Override
    public List<Drags> getList() {

    List<Drags> list =  dragRepositoryimp.getList();
    return list;
    }

    @Override
    public Drags getSingleUser(Long id) {
 Drags drags=dragRepositoryimp.getSingleUser(id);
    return drags;

    }

    @Override
    public boolean addData(Drags drag) {
    boolean status = dragRepositoryimp.addData(drag);
        return status;
    }

    @Override
    public void deleteData(Long id) {
dragRepositoryimp.deleteData(id);    }

    @Override
    public boolean updateData(Drags drag) {
  boolean status = dragRepositoryimp.updateData(drag);
    return status;   
    }
    
}

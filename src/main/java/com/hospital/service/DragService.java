/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.service;

import com.hospital.repository.*;
import java.util.List;
import model.Drags;

/**
 *
 * @author Faysal
 */
public interface DragService {
    public List<Drags> getList();
    public Drags getSingleUser(Long id);
    public boolean addData(Drags drag);
    public void deleteData(Long id);
    public boolean updateData(Drags drag);
}

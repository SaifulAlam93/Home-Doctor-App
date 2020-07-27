/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Faysal
 */
public class Patients {
    private long id,doctorId,dragsId,dosageId;
    private String Name,gender,userName,password;

    public Patients() {
    }

    public Patients(long doctorId, long dragsId, long dosageId, String Name, String gender, String userName, String password) {
        this.doctorId = doctorId;
        this.dragsId = dragsId;
        this.dosageId = dosageId;
        this.Name = Name;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
    }

    public Patients(long id, long doctorId, long dragsId, long dosageId, String Name, String gender, String userName, String password) {
        this.id = id;
        this.doctorId = doctorId;
        this.dragsId = dragsId;
        this.dosageId = dosageId;
        this.Name = Name;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public long getDragsId() {
        return dragsId;
    }

    public void setDragsId(long dragsId) {
        this.dragsId = dragsId;
    }

    public long getDosageId() {
        return dosageId;
    }

    public void setDosageId(long dosageId) {
        this.dosageId = dosageId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

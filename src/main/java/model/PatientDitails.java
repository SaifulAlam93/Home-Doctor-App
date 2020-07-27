/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gmsif
 */
public class PatientDitails {
    private int morning,afternoon,night;
    private String name,gender,doctors_name,drags_Name,doseM,doseA,doseN;
private long id;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMorning() {
        return morning;
    }

    public void setMorning(int morning) {
        this.morning = morning;
    }

    public int getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(int afternoon) {
        this.afternoon = afternoon;
    }

    public int getNight() {
        return night;
    }

    public void setNight(int night) {
        this.night = night;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDoctors_name() {
        return doctors_name;
    }

    public void setDoctors_name(String doctors_name) {
        this.doctors_name = doctors_name;
    }

    public String getDrags_Name() {
        return drags_Name;
    }

    public void setDrags_Name(String drags_Name) {
        this.drags_Name = drags_Name;
    }

    public String getDoseM() {
        return doseM;
    }

    public void setDoseM(String doseM) {
        this.doseM = doseM;
    }

    public String getDoseA() {
        return doseA;
    }

    public void setDoseA(String doseA) {
        this.doseA = doseA;
    }

    public String getDoseN() {
        return doseN;
    }

    public void setDoseN(String doseN) {
        this.doseN = doseN;
    }
    
}

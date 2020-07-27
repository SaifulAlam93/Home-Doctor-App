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
public class Dosage {
    private int morning,afternoon,night;
    private String doseM,doseA,doseN;
    private   long id;
    public Dosage() {
    }

    public Dosage(long id, int morning, int afternoon, int night, String doseM, String doseA, String doseN) {
        this.id = id;
        this.morning = morning;
        this.afternoon = afternoon;
        this.night = night;
        this.doseM = doseM;
        this.doseA = doseA;
        this.doseN = doseN;
    }

    public Dosage(int morning, int afternoon, int night, String doseM, String doseA, String doseN) {
        this.morning = morning;
        this.afternoon = afternoon;
        this.night = night;
        this.doseM = doseM;
        this.doseA = doseA;
        this.doseN = doseN;
    }

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

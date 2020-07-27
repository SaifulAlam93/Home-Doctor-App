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
public class Drags {
    
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    private String name;

    public Drags(String name) {
        this.name = name;
    }

    public Drags(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Drags() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

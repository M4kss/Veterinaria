/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.grupo6.veterinaria;

import java.sql.Date;

/**
 *
 * @author Nevermore
 */
public class Individuo implements Indexable {
    protected int id;
    protected String nombre;
    protected Date fenac;
    
    public Individuo() {
    }

    /**
     * @return the id
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fenac
     */
    public Date getFenac() {
        return fenac;
    }

    /**
     * @param fenac the fenac to set
     */
    public void setFenac(Date fenac) {
        this.fenac = fenac;
    }
}

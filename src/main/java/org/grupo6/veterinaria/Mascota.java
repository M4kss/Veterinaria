/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.grupo6.veterinaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nevermore
 */
public class Mascota extends Individuo {

    protected int propietarioId;
    protected String especie;
    protected String raza;
    protected String color;
    protected final List<Tratamiento> tratamientos;

    public Mascota() {
        tratamientos = new ArrayList<>();
    }
        
    /**
     * @return the propietarioId
     */
    public int getPropietarioId() {
        return propietarioId;
    }

    /**
     * @param propietarioId the propietarioId to set
     */
    public void setPropietarioId(int propietarioId) {
        this.propietarioId = propietarioId;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the tratamientos
     */
    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }

}

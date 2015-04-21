/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.grupo6.veterinaria.horario;

import org.grupo6.veterinaria.Indexable;
import org.joda.time.DateTime;

/**
 *
 * @author Nevermore
 */
public class Cita implements Indexable {
    private int id;
    private DateTime inicio;
    private DateTime fin;
    private int veterinarioId;
    
    public Cita(DateTime inicio, DateTime fin, int veterinarioId) {
        this.inicio = inicio;
        this.fin = fin;
        this.veterinarioId = veterinarioId;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the inicio
     */
    public DateTime getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(DateTime inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public DateTime getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(DateTime fin) {
        this.fin = fin;
    }

    /**
     * @return the veterinarioId
     */
    public int getVeterinarioId() {
        return veterinarioId;
    }

    /**
     * @param veterinarioId the veterinarioId to set
     */
    public void setVeterinarioId(int veterinarioId) {
        this.veterinarioId = veterinarioId;
    }
    
    
}

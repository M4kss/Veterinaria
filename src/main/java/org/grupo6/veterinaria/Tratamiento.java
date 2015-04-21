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
public class Tratamiento implements Indexable {

    protected int id;
    protected int mascotaId;
    protected int veterinarioId;
    protected Date fecha;
    protected double costo;
    protected String tipoTratamiento;
    protected String notas;
    
    public Tratamiento() {
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
     * @return the mascotaId
     */
    public int getMascotaId() {
        return mascotaId;
    }

    /**
     * @param mascotaId the mascotaId to set
     */
    public void setMascotaId(int mascotaId) {
        this.mascotaId = mascotaId;
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

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the notas
     */
    public String getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(String notas) {
        this.notas = notas;
    }
    
}

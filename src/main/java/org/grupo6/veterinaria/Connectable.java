/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.grupo6.veterinaria;

/**
 *
 * @author Nevermore
 */
public interface Connectable {
    
    public boolean connect();
    public void disconnect();
    public Individuo getIndividuo(int id);
}

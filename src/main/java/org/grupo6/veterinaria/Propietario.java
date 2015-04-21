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
public class Propietario extends Persona {
    
    protected final List<Mascota> mascotas;
    
    public Propietario() {
        this.mascotas = new ArrayList<>();
    }
}

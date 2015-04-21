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
public class Veterinario extends Persona {
    
    protected final List<Tratamiento> tratamientos;
    
    public Veterinario() {
        this.tratamientos = new ArrayList<>();
    }
}

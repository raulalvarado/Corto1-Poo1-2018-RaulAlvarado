/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Equipos {
    
    private String nombreEquipo;
    private ArrayList<Jugadores> listEqJug;

    public Equipos(String nombreEquipo, ArrayList<Jugadores> listEqJug) {
        this.nombreEquipo = nombreEquipo;
        this.listEqJug = new ArrayList<>();
    }

    public Equipos() {
    }

    public ArrayList<Jugadores> getListEqJug() {
        return listEqJug;
    }

    public void setListEqJug(ArrayList<Jugadores> listEqJug) {
        this.listEqJug = listEqJug;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String toString() {
        return this.nombreEquipo;
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
}

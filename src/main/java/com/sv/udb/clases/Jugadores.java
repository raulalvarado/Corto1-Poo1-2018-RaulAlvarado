/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author Estudiante
 */
public class Jugadores {
    
    private String Nombre;
    private double Edad;
    private double Estatura;
    private double Peso;

    public Jugadores() {
    }

    public Jugadores(String Nombre, double Edad, double Estatura, double Peso) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.Peso = Peso;
    }
    
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    public double getPeso() {
        return Peso;
        
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return this.Nombre;
    }
    
    
}

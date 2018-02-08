/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author Raul Alvarado
 */
public class Jugadores {
    
   private String Nombre;
    private double Edad;
    private double Estatura;
    private double Peso;

    
    
    public Jugadores() {
    }
     /**
     *
     * @param Nombre
     * @param Edad
     * @param Estatura
     * @param Peso
     */

    public Jugadores(String Nombre, double Edad, double Estatura, double Peso) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.Peso = Peso;
    }
    
    
    

    /**
     *
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

     /**
     *
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     *
     * @return
     */
    public double getEdad() {
        return Edad;
    }

     /**
     *
     * @param Edad
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     *
     * @return
     */
    public double getEstatura() {
        return Estatura;
    }

     /**
     *
     * @param Estatura
     */
    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    /**
     *
     * @return
     */
    public double getPeso() {
        return Peso;
        
    }

     /**
     *
     * @param Peso
     */
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.Nombre;
    }
    
    
}

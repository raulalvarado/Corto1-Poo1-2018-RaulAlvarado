/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;
import java.util.ArrayList;
import com.sv.udb.clases.Jugadores;

/**
 *
 * @author Raul Alvarado
 */
public class ClaseJugadores {
    
    ArrayList <Jugadores> listJug;

      /**
     *constructor
     * Inicializa el ArrayList listJug
     */
    public ClaseJugadores() {
        this.listJug= new ArrayList<>();
    }
    
    /**
     *
     * @param name
     * @param age
     * @param height
     * @param weight
     */
    public void agregar(String name , double age, double height, double weight)
    {
        this.listJug.add(new Jugadores(name, age, height, weight));
    }
    
      /**
     *@return los datos en la lista segun el caso seleccionado.
     * El primer caso compara los valores en la lista para determinar la edad menor.
     * El segundo caso compara los valores en la lista para determinar la estatura mayor.
     * El tercer caso compara los valores en la lista para determinar el peso mayor.
     */
    public ArrayList<Jugadores> getJugadores(int tipo)
    {
        ArrayList<Jugadores> resultJ = new ArrayList<>();
                    Jugadores copyJ2;
                    Jugadores copyJ1;
                    Jugadores copyJ3;
        
        switch(tipo)
        {
            case 1:
                    
                    double Mayor=1000000000;
                    for(Jugadores jugador: listJug)
                    {
                        if(jugador.getEdad()<= Mayor)
                        {
                            copyJ1=jugador;
                            Mayor=jugador.getEdad();
                            resultJ.add(copyJ1);
                        }
                    }
                break;
                
            case 2:
                    double Mayor2=0;
                    for(Jugadores jugador: listJug)
                    {
                        if(jugador.getEstatura()>Mayor2)
                        {
                            copyJ2=jugador;
                            Mayor2=jugador.getEstatura();
                            resultJ.add(copyJ2);
                        }
                    }
                break;
                
            case 3:

                    double Mayor3=0;
                    for(Jugadores jugador: listJug)
                    {
                        if(jugador.getPeso()>Mayor3)
                        {
                            copyJ3=jugador;
                            Mayor3=jugador.getPeso();
                            resultJ.add(copyJ3);
                        }
                    }
                break;
                
        }
        
        
        
        return resultJ;
    }
    
    
    
    
    
}

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
 * @author Estudiante
 */
public class ClaseJugadores {
    
    ArrayList <Jugadores> listJug;

    public ClaseJugadores() {
        this.listJug= new ArrayList<>();
    }
    
    public void agregar(String name , int age, double height, double weight)
    {
        this.listJug.add(new Jugadores(name, age, height, weight));
    }
    
    public ArrayList<Jugadores> getJugadores(int tipo)
    {
        ArrayList<Jugadores> resultJ = new ArrayList<>();
        ArrayList<Jugadores> copyJ = (ArrayList<Jugadores>) listJug.clone();
                    Jugadores copyJ2=null;
                    Jugadores copyJ1=null;
                    Jugadores copyJ3=null;
        
        switch(tipo)
        {
            case 1:
//                do
//                {
                    
                    int Mayor=0;
                    for(Jugadores jugador: listJug)
                    {
                        if(jugador.getEdad()<= Mayor)
                        {
                            copyJ1=jugador;
                            Mayor=jugador.getEdad();
                            resultJ.add(copyJ1);
                        }
                    }
//                }
//                while(!copyJ.isEmpty());
                break;
                
            case 2:
//                 do
//                {
                    double Mayor2=0;
                    for(Jugadores jugador: listJug)
                    {
                        if(jugador.getEstatura()>=Mayor2)
                        {
                            copyJ2=jugador;
                            Mayor2=jugador.getEstatura();
                            resultJ.add(copyJ2);
                        }
//                        copyJ.remove(copyJ2);
                    }
//                }
//                while(!copyJ.isEmpty());
                break;
                
            case 3:
//                 do
//                {
                    
                    double Mayor3=0;
                    for(Jugadores jugador: listJug)
                    {
                        if(jugador.getPeso()>=Mayor3)
                        {
                            copyJ3=jugador;
                            Mayor3=jugador.getPeso();
                            resultJ.add(copyJ3);
                        }
                    }
//                }
//                while(!copyJ.isEmpty());
                break;
                
        }
        
        
        
        return resultJ;
    }
    
    
    
    
    
}

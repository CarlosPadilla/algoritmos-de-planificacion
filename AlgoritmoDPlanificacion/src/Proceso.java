/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
class Proceso {
    private String nombre;
    private int time;
    private char priority;
    public Proceso(String nombre, int time, char priority){
        this.nombre = nombre;
        this.time = time;
        this.priority = priority;
    }
    public Proceso(String nombre, int time){
        this.nombre = nombre;
        this.time = time;
    }
     @Override
    public String toString(){
        return "hola " + this.nombre + " tiempo: " + this.time;

    }
     public String getNombre(){
        return this.nombre;

    }
     public String getTiempo(){
        return Integer.toString(this.time);

    }
     public String obtenerPrioridad(){
        return String.valueOf(this.priority);

    }
     
     public boolean ejecutable(){
         return --this.time > 0;
     }
     public boolean eliminable(){
         return !(this.time > 0);
     }
     
}

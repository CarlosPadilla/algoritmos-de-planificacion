/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Alejandra
 * @author carlos
 */
public class CPU {
    private Proceso[] cola; 
    private Proceso[] enEjecucion; 
    private vista VMenu;
    public int tamaño;

//    colasmultiples
    public CPU(vista visual, int tamaño){
        this.cola = new Proceso[tamaño];
        this.VMenu = visual;
    }
//    roundRobin
    public CPU(){
        
    }
    public void Ejecutar(){

    }
    public void imprimir(){

    }
    public void recorrer(){

    }
    public void nuevoProceso(){

    }
}

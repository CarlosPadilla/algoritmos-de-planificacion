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
    // algoritmo
    // 1 = FCFS
    // 2 = Round Robim
    // 3 = colas multiples
    private int algoritmo;
    private Proceso[] cola; 
    private Proceso enEjecucion; 
    private ejecucion VMenu;
    public int tamaño;

    public CPU(ejecucion visual, int algoritmo, int tamaño){
        this.algoritmo = algoritmo;
        this.cola = new Proceso[tamaño];
        this.VMenu = visual;
    }

    public void Ejecutar(){

    }
    public void imprimir(){
        for (Proceso proceso : this.cola) {
            if (proceso != null) {
                System.out.println(proceso.toString());
            }
        }

    }
    public void recorrer(){

    }
    /**
     *
     * @param nombre
     * @param tiempo
     * @param prioridad
     */
    public void nuevoProceso(String nombre, int tiempo, char prioridad){
        boolean escrito = false;
        int posicion = 0;
        while (!escrito && posicion < this.tamaño) {
            if(this.cola[posicion] == null){
                if(prioridad == ' '){
                    this.cola[posicion] = new Proceso(nombre, tiempo);
                    escrito = true;
                }else{
                    this.cola[posicion] = new Proceso(nombre, tiempo, prioridad);
                    escrito = true;
                }
            }
            posicion++;
        }
    }
}

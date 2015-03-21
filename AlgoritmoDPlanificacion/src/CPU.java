
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 * @author Alejandra
 * @author carlos
 */
public class CPU extends Thread {
    // algoritmo
    // 1 = FCFS
    // 2 = Round Robim
    // 3 = colas multiples
    private int algoritmo;
    private Proceso[] cola; 
    private Proceso enEjecucion; 
    private ejecucion VMenu;
    public int tamaño;
    private int quantumsPredefinidos = 5;

    public CPU(ejecucion visual, int algoritmo, int tamaño){
        this.algoritmo = algoritmo;
        this.tamaño = tamaño;
        this.cola = new Proceso[tamaño];
        this.VMenu = visual;
        this.limpiarVista();
    }
    @Override
    public void run(){
        try {
            this.traerAEjecucion();
        } catch (InterruptedException ex) {
            System.out.println("error" + CPU.class.getName() + ex);
        }
    }
        public void traerAEjecucion() throws InterruptedException{
        this.recorrer();
        if (this.algoritmo == 2) {
            this.esIncompleto();
        }
        if (this.cola[0] != null && !this.cola[0].eliminable() ) {
            this.enEjecucion = this.cola[0];
            this.cola[0] = null;
            this.recorrer();
            this.Ejecutar();
        }
        this.imprimir();
    }

    public void Ejecutar() throws InterruptedException{
        switch(this.algoritmo) {
            case 1:{
                while (this.enEjecucion != null && this.enEjecucion.ejecutable()) {
                    Thread.sleep(1000);
                    this.imprimir();
                }
                this.traerAEjecucion();
                break;
            }
            case 2:{
                while (this.enEjecucion != null && !this.enEjecucion.ejecutable() && this.tiempoRR()) {
                    Thread.sleep(1000);
                    this.imprimir();
                }
                this.quantumsPredefinidos = 5;
                this.traerAEjecucion();
                break;
            }
            case 3:{
                break;
            }
        }
    }
    
    public void limpiarVista(){
        for (int pocision = 0; pocision < this.tamaño; pocision++) {
                this.VMenu.nombres[pocision].setText(" ");
                this.VMenu.prioridades[pocision].setText(" ");
                this.VMenu.quantums[pocision].setText(" ");
        }
        this.VMenu.MostrarDatosEnEjecucion(" "," "," ");
    }
    public void imprimir(){
        this.limpiarVista();
        int pocision = 0;
        for (Proceso proceso : this.cola) {
            if (proceso != null) {
                System.out.println(proceso.toString());
                this.VMenu.nombres[pocision].setText(proceso.getNombre());
                this.VMenu.prioridades[pocision].setText(proceso.obtenerPrioridad());
                this.VMenu.quantums[pocision].setText(proceso.getTiempo());
                pocision ++;
            }
        }
        if (this.enEjecucion != null) {
            this.VMenu.MostrarDatosEnEjecucion(this.enEjecucion.getNombre(),this.enEjecucion.getTiempo(),this.enEjecucion.obtenerPrioridad());
        }else{
            this.VMenu.MostrarDatosEnEjecucion(" "," "," ");
        }

    }
    public void esIncompleto(){
        boolean escrito = false;
         if ( this.enEjecucion != null && !this.enEjecucion.eliminable()) {
            int posicion = 0;
            while (!escrito && posicion < this.tamaño) {
                if(this.cola[posicion] == null){
                        this.cola[posicion] = this.enEjecucion;
                        this.enEjecucion = null;
                        escrito = true;
                }
                posicion++;
            }
        }
    }
        
    public void recorrer(){
        Proceso[] aux = new Proceso[this.tamaño]; 
         for (Proceso proceso : this.cola) {
            boolean escrito = false;
            int posicion = 0;
            while (!escrito && posicion < this.tamaño && proceso != null && !proceso.eliminable()) {
                if(aux[posicion] == null){
                        aux[posicion] = proceso;
                        escrito = true;
                }
                posicion++;
            }
        }
         this.cola = aux;
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
                if(this.algoritmo!= 3){
                    this.cola[posicion] = new Proceso(nombre, tiempo);
                    escrito = true;
                }else{
                    this.cola[posicion] = new Proceso(nombre, tiempo, prioridad);
                    escrito = true;
                }
            }
            posicion++;
        }
        if (!escrito) {
            JOptionPane.showMessageDialog(VMenu, "ya no hay mas espacio");
        }
    }

    public boolean activar() {
        return this.algoritmo == 3;
    }

    private boolean tiempoRR() {
        return --this.quantumsPredefinidos >= 5;
    }
}

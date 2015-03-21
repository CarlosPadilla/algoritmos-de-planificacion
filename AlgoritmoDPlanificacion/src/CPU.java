
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

    public CPU(ejecucion visual, int algoritmo, int tamaño){
        this.algoritmo = algoritmo;
        this.tamaño = tamaño;
        this.cola = new Proceso[tamaño];
        this.VMenu = visual;
    }
    @Override
    public void run(){
        try {
            Ejecutar();
        } catch (InterruptedException ex) {
            System.out.println("error" + CPU.class.getName());
            Logger.getLogger(CPU.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Ejecutar() throws InterruptedException{
        
        for (Proceso proceso : this.cola) {
            while (proceso != null && proceso.ejecutable()) {
                Thread.sleep(1000);
                recorrer();
                this.imprimir();
            }
        }
    }
    public void imprimir(){
        for (Proceso proceso : this.cola) {
            if (proceso != null) {
                System.out.println(proceso.toString());
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
            JOptionPane.showMessageDialog(VMenu, "ya no hay mas espacio", "procesos", 5);
        }
    }

    public boolean activar() {
        return this.algoritmo == 3;
    }
}

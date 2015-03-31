
import javax.swing.JLabel;
import javax.swing.JOptionPane;





/**
 *
 * @author ALEJANDRA KSTELLANOS
 */
public class ejecucion extends javax.swing.JFrame {

   public CPU datos;
   private int algoritmo;
   public javax.swing.JFrame ventanasDescripcion;
   public vista menuPrincipal;
   public int TAMAÑO_PREDEFINIDO = 4;
   public String[] titulos = {"FCFS","Round Robin","Multiples Colas"};
   public javax.swing.JLabel[] nombres;
   public javax.swing.JLabel[] quantums;
   public javax.swing.JLabel[] prioridades;
   
    public ejecucion(int algoritmo, javax.swing.JFrame ventanasDescripcion, vista menuPrincipal) {
        initComponents();
        this.nombres = new javax.swing.JLabel[this.TAMAÑO_PREDEFINIDO];
        this.quantums = new javax.swing.JLabel[this.TAMAÑO_PREDEFINIDO];
        this.prioridades = new javax.swing.JLabel[this.TAMAÑO_PREDEFINIDO];
        this.nombres[0] = this.proceso_1;
        this.nombres[1] = this.proceso_2;
        this.nombres[2] = this.proceso_3;
        this.nombres[3] = this.proceso_4;
        this.quantums[0] = this.quantum_1;
        this.quantums[1] = this.quantum_2;
        this.quantums[2] = this.quantum_3;
        this.quantums[3] = this.quantum_4;
        this.prioridades[0] = this.prioridad_1;
        this.prioridades[1] = this.prioridad_2;
        this.prioridades[2] = this.prioridad_3;
        this.prioridades[3] = this.prioridad_4;
        
        this.datos = new CPU(this, algoritmo, this.TAMAÑO_PREDEFINIDO);
        this.algoritmo = algoritmo;
        
        this.menuPrincipal = menuPrincipal;
        this.menuPrincipal.setVisible(false);
        this.ventanasDescripcion = ventanasDescripcion;
        
        this.algoritmoAEjecutar.setText(this.titulos[algoritmo-1]);
    }
    public void setVisible(boolean vista){
        boolean activar = this.datos.activar();
        for (JLabel labelPrioridad : this.prioridades) {
            labelPrioridad.setVisible(activar);
        }
        this.exPrioridad.setVisible(activar);
        this.ejecucionPrioridad.setVisible(activar);
        this.prioridadLabel.setVisible(activar);
        super.setVisible(vista);
        
    }
    public void MostrarDatosEnEjecucion(String nombre,String tiempo,String prioridad){
        this.exNombre.setText(nombre);
        this.exTiempo.setText(tiempo);
        this.exPrioridad.setText(prioridad);
        
    }
    public void regresar() {
        this.menuPrincipal.setVisible(true);
        this.ventanasDescripcion.dispose();
        this.dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        prioridadLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        prioridad_2 = new javax.swing.JLabel();
        panelEx = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ejecucionNombre = new javax.swing.JLabel();
        ejecucionTiempo = new javax.swing.JLabel();
        exNombre = new javax.swing.JLabel();
        exTiempo = new javax.swing.JLabel();
        ejecucionPrioridad = new javax.swing.JLabel();
        exPrioridad = new javax.swing.JLabel();
        prioridad_1 = new javax.swing.JLabel();
        prioridad_3 = new javax.swing.JLabel();
        prioridad_4 = new javax.swing.JLabel();
        proceso_4 = new javax.swing.JLabel();
        quantum_4 = new javax.swing.JLabel();
        Ejecutar = new javax.swing.JButton();
        proceso_1 = new javax.swing.JLabel();
        proceso_3 = new javax.swing.JLabel();
        proceso_2 = new javax.swing.JLabel();
        quantum_2 = new javax.swing.JLabel();
        quantum_3 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        quantum_1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        algoritmoAEjecutar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("proceso\n");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("kjkmjkndjkoe      ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 183, 0, 10));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("kjkmjkndjkoe      ");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 16));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 183, 0, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("kjkmjkndjkoe      ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setMaximumSize(new java.awt.Dimension(100, 16));
        jLabel7.setMinimumSize(new java.awt.Dimension(100, 16));
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 16));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 205, 0, -1));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Proceso");
        jLayeredPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 187, -1, -1));

        prioridadLabel.setText("Prioridad");
        jLayeredPane1.add(prioridadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 236, -1, -1));

        jLabel11.setText("Quantum");
        jLayeredPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 209, -1, -1));

        prioridad_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioridad_2.setText("valor     ");
        prioridad_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prioridad_2.setMaximumSize(new java.awt.Dimension(100, 16));
        prioridad_2.setMinimumSize(new java.awt.Dimension(100, 16));
        prioridad_2.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(prioridad_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 235, 50, -1));

        panelEx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEx.setLayout(new java.awt.GridBagLayout());

        jLabel12.setText("En ejecución");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 11, 0, 0);
        panelEx.add(jLabel12, gridBagConstraints);

        ejecucionNombre.setText("Proceso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 11, 0, 0);
        panelEx.add(ejecucionNombre, gridBagConstraints);

        ejecucionTiempo.setText("Quantum");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 0, 0);
        panelEx.add(ejecucionTiempo, gridBagConstraints);

        exNombre.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 11);
        panelEx.add(exNombre, gridBagConstraints);

        exTiempo.setText("!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 11);
        panelEx.add(exTiempo, gridBagConstraints);

        ejecucionPrioridad.setText("Prioridad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 38, 0);
        panelEx.add(ejecucionPrioridad, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 38, 11);
        panelEx.add(exPrioridad, gridBagConstraints);

        jLayeredPane1.add(panelEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 11, -1, -1));

        prioridad_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioridad_1.setText("valor     ");
        prioridad_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prioridad_1.setMaximumSize(new java.awt.Dimension(100, 16));
        prioridad_1.setMinimumSize(new java.awt.Dimension(100, 16));
        prioridad_1.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(prioridad_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 235, 50, -1));

        prioridad_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioridad_3.setText("valor     ");
        prioridad_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prioridad_3.setMaximumSize(new java.awt.Dimension(100, 16));
        prioridad_3.setMinimumSize(new java.awt.Dimension(100, 16));
        prioridad_3.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(prioridad_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 235, 50, -1));

        prioridad_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prioridad_4.setText("valor     ");
        prioridad_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prioridad_4.setMaximumSize(new java.awt.Dimension(100, 16));
        prioridad_4.setMinimumSize(new java.awt.Dimension(100, 16));
        prioridad_4.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(prioridad_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 50, -1));

        proceso_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceso_4.setText("valor     ");
        proceso_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        proceso_4.setMaximumSize(new java.awt.Dimension(100, 16));
        proceso_4.setMinimumSize(new java.awt.Dimension(100, 16));
        proceso_4.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(proceso_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 186, 50, -1));

        quantum_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantum_4.setText("valor     ");
        quantum_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantum_4.setMaximumSize(new java.awt.Dimension(100, 16));
        quantum_4.setMinimumSize(new java.awt.Dimension(100, 16));
        quantum_4.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(quantum_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 50, -1));

        Ejecutar.setText("Ejecutar");
        Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Ejecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 110, -1));

        proceso_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceso_1.setText("valor");
        proceso_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        proceso_1.setMaximumSize(new java.awt.Dimension(100, 16));
        proceso_1.setMinimumSize(new java.awt.Dimension(100, 16));
        proceso_1.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(proceso_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 186, 50, -1));

        proceso_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceso_3.setText("valor     ");
        proceso_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        proceso_3.setMaximumSize(new java.awt.Dimension(100, 16));
        proceso_3.setMinimumSize(new java.awt.Dimension(100, 16));
        proceso_3.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(proceso_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 186, 50, -1));

        proceso_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceso_2.setText("valor     ");
        proceso_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        proceso_2.setMaximumSize(new java.awt.Dimension(100, 16));
        proceso_2.setMinimumSize(new java.awt.Dimension(100, 16));
        proceso_2.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(proceso_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 186, 50, -1));

        quantum_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantum_2.setText("valor     ");
        quantum_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantum_2.setMaximumSize(new java.awt.Dimension(100, 16));
        quantum_2.setMinimumSize(new java.awt.Dimension(100, 16));
        quantum_2.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(quantum_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 208, 50, -1));

        quantum_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantum_3.setText("valor     ");
        quantum_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantum_3.setMaximumSize(new java.awt.Dimension(100, 16));
        quantum_3.setMinimumSize(new java.awt.Dimension(100, 16));
        quantum_3.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(quantum_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 208, 50, -1));

        Cerrar.setText("Salir");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 73, 30));

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 41, 80, -1));

        quantum_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantum_1.setText("valor     ");
        quantum_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantum_1.setMaximumSize(new java.awt.Dimension(100, 16));
        quantum_1.setMinimumSize(new java.awt.Dimension(100, 16));
        quantum_1.setPreferredSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(quantum_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 208, 50, -1));

        jButton1.setText("Regresar <--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Algoritmo:");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 100, 20));

        algoritmoAEjecutar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        algoritmoAEjecutar.setText("alg");
        jLayeredPane1.add(algoritmoAEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 150, -1));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 430, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
    new vista2(this.datos).setVisible(true);
        datos.imprimir();
    }//GEN-LAST:event_AgregarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
   
        System.exit(0); 
    }//GEN-LAST:event_CerrarActionPerformed

    private void EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarActionPerformed
        this.Ejecutar.setEnabled(false);
        this.datos.start();
        this.datos = new CPU(this, this.algoritmo, this.TAMAÑO_PREDEFINIDO);
       
    }//GEN-LAST:event_EjecutarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.regresar();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Ejecutar;
    private javax.swing.JLabel algoritmoAEjecutar;
    private javax.swing.JLabel ejecucionNombre;
    private javax.swing.JLabel ejecucionPrioridad;
    private javax.swing.JLabel ejecucionTiempo;
    private javax.swing.JLabel exNombre;
    private javax.swing.JLabel exPrioridad;
    private javax.swing.JLabel exTiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel panelEx;
    private javax.swing.JLabel prioridadLabel;
    private javax.swing.JLabel prioridad_1;
    private javax.swing.JLabel prioridad_2;
    private javax.swing.JLabel prioridad_3;
    private javax.swing.JLabel prioridad_4;
    private javax.swing.JLabel proceso_1;
    private javax.swing.JLabel proceso_2;
    private javax.swing.JLabel proceso_3;
    private javax.swing.JLabel proceso_4;
    private javax.swing.JLabel quantum_1;
    private javax.swing.JLabel quantum_2;
    private javax.swing.JLabel quantum_3;
    private javax.swing.JLabel quantum_4;
    // End of variables declaration//GEN-END:variables

}

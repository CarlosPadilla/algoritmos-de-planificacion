
import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRA KSTELLANOS
 */
public class vista extends javax.swing.JFrame {
    private int FCFS = 1;
    private int ROUND_ROBIN = 2;
    private int MULTIPLES_COLAS = 3;
    public vista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        fcfs = new javax.swing.JButton();
        roundRobin = new javax.swing.JButton();
        multiplesColas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Descripción");
        setIconImages(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Algoritmos de Planificación");

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Elige una opción");
        jLabel2.setBounds(10, 10, 120, 17);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fcfs.setText("FCFS");
        fcfs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fcfsMouseClicked(evt);
            }
        });
        fcfs.setBounds(10, 170, 113, 34);
        jLayeredPane2.add(fcfs, javax.swing.JLayeredPane.DEFAULT_LAYER);

        roundRobin.setText("Round Robin");
        roundRobin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundRobinMouseClicked(evt);
            }
        });
        roundRobin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundRobinActionPerformed(evt);
            }
        });
        roundRobin.setBounds(10, 60, 113, 31);
        jLayeredPane2.add(roundRobin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        multiplesColas.setText("Múltiples colas");
        multiplesColas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplesColasMouseClicked(evt);
            }
        });
        multiplesColas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplesColasActionPerformed(evt);
            }
        });
        multiplesColas.setBounds(10, 110, 113, 31);
        jLayeredPane2.add(multiplesColas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(0, 0, 230, 320);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/images.jpg"))); // NOI18N
        jLabel3.setBounds(90, 0, 180, 290);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multiplesColasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplesColasActionPerformed

    }//GEN-LAST:event_multiplesColasActionPerformed

    private void roundRobinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundRobinMouseClicked
    round_robin vista = new round_robin(); 
    vista.setVisible(true);
    new ejecucion(this.ROUND_ROBIN).setVisible(true);
    
    }//GEN-LAST:event_roundRobinMouseClicked

    private void roundRobinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundRobinActionPerformed
    }//GEN-LAST:event_roundRobinActionPerformed

    private void multiplesColasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplesColasMouseClicked
        multiplesColas vista = new multiplesColas();
        vista.setVisible(true);
        new ejecucion(this.MULTIPLES_COLAS).setVisible(true);
    }//GEN-LAST:event_multiplesColasMouseClicked

    private void fcfsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fcfsMouseClicked
        fcfs vista = new fcfs();
        vista.setVisible(true);
        new ejecucion(this.FCFS).setVisible(true);
    }//GEN-LAST:event_fcfsMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fcfs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton multiplesColas;
    private javax.swing.JButton roundRobin;
    // End of variables declaration//GEN-END:variables
}

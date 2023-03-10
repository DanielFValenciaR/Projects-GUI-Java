/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ventanas;

/**
 *
 * @author danio
 */
public class VentanaGanador extends javax.swing.JDialog {
    private String usuario;
    
    public VentanaGanador(java.awt.Frame parent, boolean modal, String usuario) {
        super(parent, modal);
        this.usuario = usuario;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        botonJugarDeNuevo = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        etiquetaGif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaNombre.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaNombre.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNombre.setOpaque(true);
        etiquetaNombre.setText("¬°Felicitaciones " + usuario + "!");
        Panel.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        botonJugarDeNuevo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        botonJugarDeNuevo.setText("Jugar de Nuevo");
        botonJugarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarDeNuevoActionPerformed(evt);
            }
        });
        Panel.add(botonJugarDeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        botonSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        Panel.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        etiquetaGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/final-ganador.gif"))); // NOI18N
        Panel.add(etiquetaGif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonJugarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarDeNuevoActionPerformed
        dispose();
    }//GEN-LAST:event_botonJugarDeNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaGanador dialog = new VentanaGanador(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton botonJugarDeNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel etiquetaGif;
    private javax.swing.JLabel etiquetaNombre;
    // End of variables declaration//GEN-END:variables
}

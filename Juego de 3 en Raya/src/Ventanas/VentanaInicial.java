package Ventanas;

/**
 *
 * @author danio
 */
public class VentanaInicial extends javax.swing.JFrame {
    private String usuario1;
    private String usuario2;

    public VentanaInicial() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        etiquetaTresEnRaya = new javax.swing.JLabel();
        etiquetaNombre1 = new javax.swing.JLabel();
        etiquetaNombre2 = new javax.swing.JLabel();
        cajaNombre1 = new javax.swing.JTextField();
        cajaNombre2 = new javax.swing.JTextField();
        gifTriqui = new javax.swing.JLabel();
        gifTriqui2 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        botonComenzarJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaTresEnRaya.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        etiquetaTresEnRaya.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTresEnRaya.setText("Tres en Raya");

        etiquetaNombre1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        etiquetaNombre1.setText("Digite el nombre del usuario1:");
        etiquetaNombre1.setToolTipText("");

        etiquetaNombre2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        etiquetaNombre2.setText("Digite el nombre del usuario2:");

        cajaNombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajaNombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        gifTriqui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/triqui.gif"))); // NOI18N

        gifTriqui2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/triqui2.gif"))); // NOI18N

        botonGuardar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        etiquetaMuestra1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        etiquetaMuestra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etiquetaMuestra2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        etiquetaMuestra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botonComenzarJuego.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        botonComenzarJuego.setText("Comenzar el Juego");
        botonComenzarJuego.setVisible(false);
        botonComenzarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaTresEnRaya, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etiquetaNombre1)
                .addGap(28, 28, 28)
                .addComponent(cajaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etiquetaNombre2)
                .addGap(28, 28, 28)
                .addComponent(cajaNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(botonGuardar))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(gifTriqui2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaMuestra1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaMuestra2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(botonComenzarJuego)))
                .addGap(49, 49, 49)
                .addComponent(gifTriqui))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(etiquetaTresEnRaya)
                .addGap(47, 47, 47)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNombre1)
                    .addComponent(cajaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNombre2)
                    .addComponent(cajaNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(botonGuardar)
                .addGap(16, 16, 16)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gifTriqui2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(etiquetaMuestra1)
                        .addGap(29, 29, 29)
                        .addComponent(etiquetaMuestra2)
                        .addGap(29, 29, 29)
                        .addComponent(botonComenzarJuego))
                    .addComponent(gifTriqui))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        usuario1 = cajaNombre1.getText();
        usuario2 = cajaNombre2.getText();

        botonGuardar.setVisible(false);
        etiquetaMuestra1.setText("<html><b>Usuario1: </b>" + usuario1 + "/ <b>Ficha:</b> X</html>");
        etiquetaMuestra2.setText("<html><b>Usuario2: </b>" + usuario2 + "/ <b>Ficha:</b> O</html>"); 
        botonComenzarJuego.setVisible(true);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonComenzarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarJuegoActionPerformed
        VentanaPrincipal triqui = new VentanaPrincipal(usuario1, usuario2);
        triqui.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonComenzarJuegoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton botonComenzarJuego;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaNombre1;
    private javax.swing.JTextField cajaNombre2;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombre2;
    private javax.swing.JLabel etiquetaTresEnRaya;
    private javax.swing.JLabel gifTriqui;
    private javax.swing.JLabel gifTriqui2;
    // End of variables declaration//GEN-END:variables
}

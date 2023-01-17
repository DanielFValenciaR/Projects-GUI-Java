/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author danio
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private boolean casillas[][] = new boolean[3][3];
    private String turno = "usuario1";
    private int matriz[][] = new int[3][3];
    private int casillasEmpate = 0;
    private String usuario1, usuario2;
    private int vecesGano1 = 0, vecesGano2 = 0, vecesEmpate = 0;

    public VentanaPrincipal(String usuario1, String usuario2) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
    }

    private void llenarCasillas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = true;
            }
        }
    }

    private void llenarMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    private void dibujarX(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/x.png")));
    }

    private void dibujarO(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonSuperiorIzquierdo = new javax.swing.JButton();
        botonSuperiorMedio = new javax.swing.JButton();
        botonSuperiorDerecho = new javax.swing.JButton();
        botonMedioIzquierda = new javax.swing.JButton();
        botonMedio = new javax.swing.JButton();
        botonMedioDerecha = new javax.swing.JButton();
        botonInferiorIzquierda = new javax.swing.JButton();
        botonInferiorMedio = new javax.swing.JButton();
        botonInferiorDerecho = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzarNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRIQUI");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

        panel.setLayout(new java.awt.GridLayout(3, 3));

        botonSuperiorIzquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSuperiorIzquierdoActionPerformed(evt);
            }
        });
        panel.add(botonSuperiorIzquierdo);

        botonSuperiorMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSuperiorMedioActionPerformed(evt);
            }
        });
        panel.add(botonSuperiorMedio);

        botonSuperiorDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSuperiorDerechoActionPerformed(evt);
            }
        });
        panel.add(botonSuperiorDerecho);

        botonMedioIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedioIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonMedioIzquierda);

        botonMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedioActionPerformed(evt);
            }
        });
        panel.add(botonMedio);

        botonMedioDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedioDerechaActionPerformed(evt);
            }
        });
        panel.add(botonMedioDerecha);

        botonInferiorIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInferiorIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonInferiorIzquierda);

        botonInferiorMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInferiorMedioActionPerformed(evt);
            }
        });
        panel.add(botonInferiorMedio);

        botonInferiorDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInferiorDerechoActionPerformed(evt);
            }
        });
        panel.add(botonInferiorDerecho);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        comenzarNuevo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comenzarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/again.png"))); // NOI18N
        comenzarNuevo.setText("Comenzar de nuevo");
        comenzarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(comenzarNuevo);

        mostrarResultados.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tabla.png"))); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        mostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(mostrarResultados);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.jpg"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonSuperiorIzquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSuperiorIzquierdoActionPerformed
        if (casillas[0][0] == true) { //Verificando si aun no se le ha dado click sobre el boton
            if (turno.equals("usuario1")) { //Verificamos el turno
                dibujarX(botonSuperiorIzquierdo);
                matriz[0][0] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonSuperiorIzquierdo);
                matriz[0][0] = 2;
                turno = "usuario1";
            }
            casillas[0][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonSuperiorIzquierdoActionPerformed

    private void botonSuperiorMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSuperiorMedioActionPerformed
        if (casillas[0][1] == true) { //Verificando si aun no se le ha dado click sobre el boton
            if (turno.equals("usuario1")) { //Verificamos el turno
                dibujarX(botonSuperiorMedio);
                matriz[0][1] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonSuperiorMedio);
                matriz[0][1] = 2;
                turno = "usuario1";
            }
            casillas[0][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonSuperiorMedioActionPerformed

    private void botonSuperiorDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSuperiorDerechoActionPerformed
        if (casillas[0][2] == true) { //Verificando si aun no se le ha dado click sobre el boton
            if (turno.equals("usuario1")) { //Verificamos el turno
                dibujarX(botonSuperiorDerecho);
                matriz[0][2] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonSuperiorDerecho);
                matriz[0][2] = 2;
                turno = "usuario1";
            }
            casillas[0][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonSuperiorDerechoActionPerformed

    private void botonMedioIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedioIzquierdaActionPerformed
        if (casillas[1][0] == true) { //Verificando si aun no se le ha dado click sobre el boton
            if (turno.equals("usuario1")) { //Verificamos el turno
                dibujarX(botonMedioIzquierda);
                matriz[1][0] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonMedioIzquierda);
                matriz[1][0] = 2;
                turno = "usuario1";
            }
            casillas[1][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonMedioIzquierdaActionPerformed

    private void botonMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedioActionPerformed
        if (casillas[1][1] == true) { //Verificando si aun no se le ha dado click sobre el boton
            if (turno.equals("usuario1")) { //Verificamos el turno
                dibujarX(botonMedio);
                matriz[1][1] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonMedio);
                matriz[1][1] = 2;
                turno = "usuario1";
            }
            casillas[1][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonMedioActionPerformed

    private void botonMedioDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedioDerechaActionPerformed
        if (casillas[1][2] == true) { //Verificando si aun no se le ha dado click sobre el boton
            if (turno.equals("usuario1")) { //Verificamos el turno
                dibujarX(botonMedioDerecha);
                matriz[1][2] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonMedioDerecha);
                matriz[1][2] = 2;
                turno = "usuario1";
            }
            casillas[1][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonMedioDerechaActionPerformed

    private void botonInferiorIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInferiorIzquierdaActionPerformed
        if (casillas[2][0] == true) { //Verificando si aun no se le ha dado click sobre el boton
            if (turno.equals("usuario1")) { //Verificamos el turno
                dibujarX(botonInferiorIzquierda);
                matriz[2][0] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonInferiorIzquierda);
                matriz[2][0] = 2;
                turno = "usuario1";
            }
            casillas[2][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonInferiorIzquierdaActionPerformed

    private void botonInferiorMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInferiorMedioActionPerformed
        if (casillas[2][1] == true) { //Verificando si aun no se le ha dado click sobre el boton
            if (turno.equals("usuario1")) { //Verificamos el turno
                dibujarX(botonInferiorMedio);
                matriz[2][1] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonInferiorMedio);
                matriz[2][1] = 2;
                turno = "usuario1";
            }
            casillas[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonInferiorMedioActionPerformed

    private void botonInferiorDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInferiorDerechoActionPerformed
        if (casillas[2][2] == true) { //Verificando si aun no se le ha dado click sobre el boton
            if (turno.equals("usuario1")) { //Verificamos el turno
                dibujarX(botonInferiorDerecho);
                matriz[2][2] = 1;
                turno = "usuario2";
            } else { //Turno del usuario 2
                dibujarO(botonInferiorDerecho);
                matriz[2][2] = 2;
                turno = "usuario1";
            }
            casillas[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonInferiorDerechoActionPerformed

    private void mostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultadosActionPerformed
        VentanaMostrarResultados ventanaM = new VentanaMostrarResultados(this, true, usuario1, usuario2, vecesGano1, vecesGano2, vecesEmpate);
        ventanaM.setVisible(true);
    }//GEN-LAST:event_mostrarResultadosActionPerformed

    private void comenzarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarNuevoActionPerformed
        vecesGano1 = 0; vecesGano2 = 0; vecesEmpate = 0;
        reiniciarJuego();
    }//GEN-LAST:event_comenzarNuevoActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://es.wikipedia.org/wiki/Tres_en_l%C3%ADnea"));
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked

    private void comprobarGanador() {
        boolean ganadorUsuario1 = false;
        boolean ganadorUsuario2 = false;

        //Comprobamos si el ganador es el usuario1
        ganadorUsuario1 = comprobar(1);

        //Comprobamos si el ganador es el usuario2
        ganadorUsuario2 = comprobar(2);

        if (ganadorUsuario1 == true) {
            VentanaGanador ventanaG = new VentanaGanador(this, true, usuario1);
            ventanaG.setVisible(true);
            vecesGano1++;
            reiniciarJuego();
            
        } else if (ganadorUsuario2 == true) {
            VentanaGanador ventanaG = new VentanaGanador(this, true, usuario2);
            ventanaG.setVisible(true);
            vecesGano2++;
            reiniciarJuego();
            
        } else{ //tal vez el tablero esta lleno, entonces hay un empate
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] != 0) { //Puede haber un numero 1 o 2
                        casillasEmpate++;
                    }
                }
            }
            if (casillasEmpate == 9) {
                VentanaEmpate ventanaE = new VentanaEmpate(this, true);
                ventanaE.setVisible(true);
                vecesEmpate++;
                reiniciarJuego();
            }else{
                casillasEmpate = 0;
            }
        }
        /*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
         */
    }

    private boolean comprobar(int numero) {
        boolean ganador = false;

        if (matriz[0][0] == numero && matriz[0][1] == numero && matriz[0][2] == numero) {
            ganador = true;
        }else if (matriz[1][0] == numero && matriz[1][1] == numero && matriz[1][2] == numero) {
            ganador = true;
        }else if (matriz[2][0] == numero && matriz[2][1] == numero && matriz[2][2] == numero) {
            ganador = true;
        }else if (matriz[0][0] == numero && matriz[1][0] == numero && matriz[2][0] == numero) {
            ganador = true;
        }else if (matriz[0][1] == numero && matriz[1][1] == numero && matriz[2][1] == numero) {
            ganador = true;
        }else if (matriz[0][2] == numero && matriz[1][2] == numero && matriz[2][2] == numero) {
            ganador = true;
        }else if (matriz[0][0] == numero && matriz[1][1] == numero && matriz[2][2] == numero) {
            ganador = true;
        }else if (matriz[0][2] == numero && matriz[1][1] == numero && matriz[2][0] == numero) {
            ganador = true;
        }
        return ganador;
    }
    
    private void reiniciarJuego(){
        llenarCasillas();
        llenarMatriz();
        
        //Le quitamos las imagenes a los botones
        botonSuperiorIzquierdo.setIcon(null);
        botonSuperiorDerecho.setIcon(null);
        botonSuperiorMedio.setIcon(null);
        botonMedioIzquierda.setIcon(null);
        botonMedio.setIcon(null);
        botonMedioDerecha.setIcon(null);
        botonInferiorIzquierda.setIcon(null);
        botonInferiorMedio.setIcon(null);
        botonInferiorDerecho.setIcon(null);
        
        //Vamos a preguntarle al usuario quien juega primero
        quienJuegaPrimero();
    }
    
    private void quienJuegaPrimero(){
        VentanaEscogerTurno ventanaET = new VentanaEscogerTurno(this, true, usuario1, usuario2);
        ventanaET.setVisible(true);
        turno = ventanaET.getTurno();
    } 

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonInferiorDerecho;
    private javax.swing.JButton botonInferiorIzquierda;
    private javax.swing.JButton botonInferiorMedio;
    private javax.swing.JButton botonMedio;
    private javax.swing.JButton botonMedioDerecha;
    private javax.swing.JButton botonMedioIzquierda;
    private javax.swing.JButton botonSuperiorDerecho;
    private javax.swing.JButton botonSuperiorIzquierdo;
    private javax.swing.JButton botonSuperiorMedio;
    private javax.swing.JMenuItem comenzarNuevo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}

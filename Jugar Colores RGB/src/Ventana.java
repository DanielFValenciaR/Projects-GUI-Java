import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel etiqueta, nota;
    private JButton boton1, boton2, boton3;
    private int pulsado = 0;
    private int contadorR = 0, contadorG = 0, contadorB = 0;
    //private Color color;

    public Ventana() {
        this.setSize(700, 450);
        this.setTitle("Ejercicio 3");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarBotones();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        eventoMouseWheelListener();
    }

    private void colocarEtiqueta() {
        etiqueta = new JLabel();
        etiqueta.setBounds(0, 30, 700, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setText("Color (Rojo, Verde, Azul)");
        etiqueta.setFont(new FontUIResource("arial", Font.BOLD, 25));
        panel.add(etiqueta);

        nota = new JLabel();
        nota.setBounds(0, 60, 700, 40);
        nota.setHorizontalAlignment(SwingConstants.CENTER);
        nota.setText("NOTA: Oprima el color y luego gire la rueda del mouse");
        //nota.setFont(new FontUIResource("arial", Font.BOLD, 25));
        panel.add(nota);

    }

    private void colocarBotones() {
        /*
            pulsado = 1 -> boton1
            pulsado = 2 -> boton2
            pulsado = 3 -> boton3
        */

        boton1 = new JButton();
        boton1.setBounds(60, 250, 150, 50);
        boton1.setText("Rojo");
        boton1.setFont(new FontUIResource("cooper black", 0, 20));
        boton1.setForeground(Color.RED);
        panel.add(boton1);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 1;
            }
        });

        boton2 = new JButton();
        boton2.setBounds(260, 250, 150, 50);
        boton2.setText("Verde");
        boton2.setFont(new FontUIResource("cooper black", 0, 20));
        boton2.setForeground(Color.GREEN);
        panel.add(boton2);

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 2;
            }
        });

        boton3 = new JButton();
        boton3.setBounds(460, 250, 150, 50);
        boton3.setText("Azul");
        boton3.setFont(new FontUIResource("cooper black", 0, 20));
        boton3.setForeground(Color.BLUE);
        panel.add(boton3);

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado = 3;
            }
        });
    }

    private void eventoMouseWheelListener() {
        MouseWheelListener eventoRueda = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (pulsado != 0) { //Si se ha pulsado algun boton
                    if (pulsado == 1) { //Se ha pulsado el boton1
                        contadorR += e.getWheelRotation()*(-1);
                        if (contadorR < 0) {
                            contadorR = 0;
                        }
                        if (contadorR > 255) {
                            contadorR = 255;
                        }
                    }
                    else if (pulsado == 2) { //Se ha pulsado el boton2
                        contadorG += e.getWheelRotation()*(-1);
                        if (contadorG < 0) {
                            contadorG = 0;
                        }
                        if (contadorG > 255) {
                            contadorG = 255;
                        }
                    }
                    else{ //Se ha pulsado el boton3
                        contadorB += e.getWheelRotation()*(-1);
                        if (contadorB < 0) {
                            contadorB = 0;
                        }
                        if (contadorB > 255) {
                            contadorB = 255;
                        }
                    }
                }
                etiqueta.setText("Color (Rojo = " + contadorR + ", Verde = " + contadorG + ", Azul = " + contadorB + ")");
                panel.setBackground(new Color(contadorR, contadorG, contadorB));
            }
            
        };
        panel.addMouseWheelListener(eventoRueda);
    }    
}

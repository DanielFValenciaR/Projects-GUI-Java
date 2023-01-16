package Ejercicio2;

import java.awt.Image;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.plaf.FontUIResource;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel etiqueta, imagen;
    private JRadioButton rb1, rb2, rb3, rb4;

    public Ventana() {
        this.setSize(800, 500);
        this.setTitle("Ejercicio 2");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarRadioBotones();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarEtiqueta() {
        etiqueta = new JLabel();
        etiqueta.setBounds(30, 20, 400, 40);
        etiqueta.setText("Escoja su deporte favorito");
        etiqueta.setFont(new FontUIResource("cooper black", 0, 25));
        panel.add(etiqueta);
    }

    private void colocarRadioBotones() {
        rb1 = new JRadioButton();
        rb1.setBounds(30, 100, 180, 60);
        rb1.setText("Fútbol");
        rb1.setFont(new FontUIResource("arial", 2, 30));
        panel.add(rb1);

        rb2 = new JRadioButton();
        rb2.setBounds(30, 180, 180, 60);
        rb2.setText("Baloncesto");
        rb2.setFont(new FontUIResource("arial", 2, 30));
        panel.add(rb2);

        rb3 = new JRadioButton();
        rb3.setBounds(30, 260, 180, 60);
        rb3.setText("Tenis");
        rb3.setFont(new FontUIResource("arial", 2, 30));
        panel.add(rb3);

        rb4 = new JRadioButton();
        rb4.setBounds(30, 340, 180, 60);
        rb4.setText("Natación");
        rb4.setFont(new FontUIResource("arial", 2, 30));
        panel.add(rb4);

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(rb1);
        grupoRadioBotones.add(rb2);
        grupoRadioBotones.add(rb3);
        grupoRadioBotones.add(rb4);

        eventoActionListener();
    }

    private void eventoActionListener() {
        imagen = new JLabel();
        imagen.setBounds(300, 120, 400, 250);
        panel.add(imagen);

        ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/Imagenes/Futbol.jpg"));
        ImageIcon imagenBaloncesto = new ImageIcon(getClass().getResource("/Imagenes/Baloncesto.jpg"));
        ImageIcon imagenTenis = new ImageIcon(getClass().getResource("/Imagenes/Tenis.jpg"));
        ImageIcon imagenNatacion = new ImageIcon(getClass().getResource("/Imagenes/Natacion.jpg"));

        ActionListener oyenteAccion1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagen.getWidth(),
                        imagen.getHeight(), Image.SCALE_SMOOTH)));
            }

        };
        rb1.addActionListener(oyenteAccion1);

        ActionListener oyenteAccion2 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenBaloncesto.getImage().getScaledInstance(imagen.getWidth(),
                        imagen.getHeight(), Image.SCALE_SMOOTH)));
            }

        };
        rb2.addActionListener(oyenteAccion2);

        ActionListener oyenteAccion3 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenTenis.getImage().getScaledInstance(imagen.getWidth(),
                        imagen.getHeight(), Image.SCALE_SMOOTH)));
            }

        };
        rb3.addActionListener(oyenteAccion3);

        ActionListener oyenteAccion4 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(imagen.getWidth(),
                        imagen.getHeight(), Image.SCALE_SMOOTH)));
            }

        };
        rb4.addActionListener(oyenteAccion4);
    }
}

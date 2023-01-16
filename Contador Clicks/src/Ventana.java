import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;

//CONTADOR DE CLICKS

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int contador = 0;

    public Ventana() {
        this.setSize(500, 500);
        this.setTitle("Ejercicio 1");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        iniciarComponentes();
    }

    public void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
    }

    private void colocarPanel() {
        panel = new JPanel();
        // panel.setBackground(Color.BLUE);
        panel.setLayout(null);// Desactivamos el diseño del panel
        this.getContentPane().add(panel);
    }

    private void colocarEtiqueta() {
        etiqueta = new JLabel();
        etiqueta.setText("Pulse el botón");
        etiqueta.setFont(new FontUIResource("cooper black", Font.ITALIC, 25));
        etiqueta.setBounds(0, 70, 500, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
    }

    private void colocarBoton() {
        boton = new JButton();
        boton.setText("¡PULSE AQUÍ!");
        boton.setFont(new FontUIResource("cooper black", 0, 19));
        boton.setBounds(130, 200, 250, 50);
        panel.add(boton);

        eventoActionListener();
    }

    private void eventoActionListener() {
        ActionListener oyenteAccion = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                if (contador == 1) {
                    etiqueta.setText("Botón presionado 1 vez");
                } else {
                    etiqueta.setText("Botón presionado " + contador + " veces");
                }
            }
        };
        boton.addActionListener(oyenteAccion);
    }
}

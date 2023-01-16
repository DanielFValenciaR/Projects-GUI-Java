import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel etiqueta, etiqueta2, etiqueta3, etiqueta4, etiqueta5, etiqueta6, etiqueta7;
    private JButton boton;
    private JTextField caja, caja2, caja3, caja4, caja5;
    private JComboBox<Persona> listaDesplegable;
    private DefaultTableModel modeloTabla;

    public Ventana() {
        this.setSize(500, 550);
        this.setTitle("Ejercicio 4");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarComboBox();
        colocarBoton();
        colocarTabla();
        colocarCajasTexto();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarEtiqueta() {
        etiqueta = new JLabel();
        etiqueta.setBounds(20, 15, 50, 20);
        etiqueta.setText("Persona");
        panel.add(etiqueta);

        etiqueta2 = new JLabel();
        etiqueta2.setBounds(20, 270, 150, 30);
        etiqueta2.setText("Datos de la Persona");
        etiqueta2.setFont(new FontUIResource("tahoma", 1, 15));
        panel.add(etiqueta2);

        etiqueta3 = new JLabel();
        etiqueta3.setBounds(20, 300, 100, 30);
        etiqueta3.setText("Nombre");
        //etiqueta3.setFont(new FontUIResource("tahoma", 1, 15));
        panel.add(etiqueta3);

        etiqueta4 = new JLabel();
        etiqueta4.setBounds(250, 300, 100, 30);
        etiqueta4.setText("Apellidos");
        panel.add(etiqueta4);

        etiqueta5 = new JLabel();
        etiqueta5.setBounds(20, 370, 100, 30);
        etiqueta5.setText("Email");
        panel.add(etiqueta5);

        etiqueta6 = new JLabel();
        etiqueta6.setBounds(250, 370, 100, 30);
        etiqueta6.setText("Celular");
        panel.add(etiqueta6);

        etiqueta7 = new JLabel();
        etiqueta7.setBounds(20, 440, 100, 30);
        etiqueta7.setText("Dirección");
        panel.add(etiqueta7);
    }

    private void colocarComboBox() {
        DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona>();
        listaDesplegable = new JComboBox<>(modelo);

        modelo.addElement(new Persona("Daniel", "Valencia", "dani@hotmail.com", "311754925", "Cr27 #48-76"));
        modelo.addElement(new Persona("Alejandro", "Taborda", "tabo@gmail.com", "313703159", "Calle28 #24-37"));
        modelo.addElement(new Persona("Luis", "Sanchez", "sanche@hotmail.com", "301974327", "Cr13 #15-20"));
        modelo.addElement(new Persona("Paolo", "Vasquez", "paolz@hotmail.com", "311816439", "Calle34 #33-54"));
        modelo.addElement(new Persona("Marina", "Peters", "maripete@gmail.com", "315971452", "Cr5 #20-14"));
        modelo.addElement(new Persona("Luisa", "Correa", "lui@hotmail.com", "302154789", "Calle31 #22-48"));

        listaDesplegable.setBounds(20, 40, 220, 40);
        panel.add(listaDesplegable);
    }

    private void colocarBoton() {
        boton = new JButton();
        boton.setBounds(260, 40, 210, 40);
        boton.setText("Insertar Persona");
        panel.add(boton);

        eventoActionListener();
    }

    private void colocarTabla() {
        modeloTabla = new DefaultTableModel();
        //Agragamos columnas 
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Email");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Dirección");
        
        JTable tabla = new JTable(modeloTabla);
        tabla.setBounds(20, 100, 450, 150);
        panel.add(tabla);

        ListSelectionListener oyenteSeleccion = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    int filaSeleccionada = tabla.getSelectedRow();

                    String nombre = (String)modeloTabla.getValueAt(filaSeleccionada, 0);
                    String appelido = (String)modeloTabla.getValueAt(filaSeleccionada, 1);
                    String email = (String)modeloTabla.getValueAt(filaSeleccionada, 2);
                    String celular = (String)modeloTabla.getValueAt(filaSeleccionada,3);
                    String direccion = (String)modeloTabla.getValueAt(filaSeleccionada, 4);

                    caja.setText(nombre);
                    caja2.setText(appelido);
                    caja3.setText(email);
                    caja4.setText(celular);
                    caja5.setText(direccion);
                }
            }
            
        };
        tabla.getSelectionModel().addListSelectionListener(oyenteSeleccion);

        JScrollPane barraDesplazamiento = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraDesplazamiento.setBounds(tabla.getX(), tabla.getY(), tabla.getWidth(), tabla.getHeight());
        panel.add(barraDesplazamiento);
    }

    private void colocarCajasTexto() {
        caja = new JTextField();
        caja.setBounds(20, 330, 210, 20);
        panel.add(caja);

        caja2 = new JTextField();
        caja2.setBounds(250, 330, 220, 20);
        panel.add(caja2);

        caja3 = new JTextField();
        caja3.setBounds(20, 400, 210, 20);
        panel.add(caja3);

        caja4 = new JTextField();
        caja4.setBounds(250, 400, 220, 20);
        panel.add(caja4);

        caja5 = new JTextField();
        caja5.setBounds(20, 470, 450, 20);
        panel.add(caja5);
    }

    private void eventoActionListener() {
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Persona p = (Persona)listaDesplegable.getSelectedItem();

                String nombres = p.getNombres();
                String apellidos = p.getApellidos();
                String email = p.getEmail();
                String celular = p.getCelular();
                String dirección = p.getDireccion();

                String personas[] = {nombres, apellidos, email, celular, dirección};

                //Agregamos filas
                modeloTabla.addRow(personas);
            }
        });
    }
}
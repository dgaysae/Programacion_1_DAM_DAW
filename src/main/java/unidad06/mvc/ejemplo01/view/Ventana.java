package unidad06.mvc.ejemplo01.view;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author diego
 */
public class Ventana extends JFrame {
    private JLabel lbEtiqueta;
    private JTextField tfTexto;
    private JButton btBoton, btBoton2;
    private CampoTexto ctNombre;
    
    public Ventana(String title) {
        setTitle(title);
        initVentana();
    }

    public JLabel getEtiqueta() {
        return lbEtiqueta;
    }

    public JTextField getCajaTexto() {
        return tfTexto;
    }

    public JButton getBoton1() {
        return btBoton;
    }

    public JButton getBoton2() {
        return btBoton2;
    }

    private void initVentana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new FlowLayout());
        
        setControles();
    }    
    
    private void setControles() {
        lbEtiqueta = new JLabel("Nombre:");
        tfTexto = new JTextField(15);
        btBoton = new JButton("Aceptar");
        
        btBoton2 = new JButton("Aceptar otra vez");

        ctNombre = new CampoTexto("Nombre: ", 15);
        ctNombre.setText("Anselmo Sánchez Pérez");


        VerticalPanel verticalPanel = new VerticalPanel(lbEtiqueta, tfTexto);
        verticalPanel.setBorder("Panel con título y borde:");
        add(verticalPanel);

        verticalPanel = new VerticalPanel(btBoton, btBoton2);
        verticalPanel.setMargins();
        add(verticalPanel);

        verticalPanel = new VerticalPanel(ctNombre);
        verticalPanel.setMargins();
        add(verticalPanel);

    }
}

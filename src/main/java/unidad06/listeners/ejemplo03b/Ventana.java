package unidad06.listeners.ejemplo03b;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author diego
 */
public class Ventana extends JFrame {
    JLabel lbEtiqueta;
    JTextField tfTexto;
    JButton btBoton, btBoton2;
    
    public Ventana(String title) {
        setTitle(title);
        initVentana();

        setVisible(true);
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
        btBoton.setName("aceptar");
        btBoton.addActionListener(new EventosVentana(btBoton));
        
        btBoton2 = new JButton("Aceptar otra vez");
        btBoton2.setName("aceptar2");
        btBoton2.addActionListener(new EventosVentana(btBoton2));
        
        add(lbEtiqueta);
        add(tfTexto);
        add(btBoton);
        add(btBoton2);
    }
}

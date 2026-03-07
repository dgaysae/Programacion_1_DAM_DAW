package unidad06.listeners.ejemplo01;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author diego
 */
public class Ventana extends JFrame {
    
    JButton btAceptar;
    
    public Ventana(String title) {
        initVentana(title);
        btAceptar = new JButton("Aceptar");
        
        add(btAceptar);
        btAceptar.addActionListener(new EventoBoton());
        
        
        setVisible(true);
    }

    private void initVentana(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new FlowLayout());
    }
}

package unidad06.listeners.ejemplo02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        btAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Estoy pulsando el botón");
            }
        });

        setVisible(true);
    }

    public Ventana(String title, int width, int height) {
        initVentana(title, width, height);

        setVisible(true);
    }

    private void initVentana(String title) {
        initVentana(title, 400, 400);
    }

    private void initVentana(String title, int width, int height) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLayout(new FlowLayout());
    }

}

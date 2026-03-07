package unidad06.listeners.ejemplo03b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * De esta forma no podemos acceder a los controles de la ventana, por lo que
 * no se puede actuar con/sobre ellos.
 * @author diego
 */
public class EventosVentana implements ActionListener {
    JButton boton;

    public EventosVentana(JButton btBoton) {
        this.boton = btBoton;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() instanceof JButton) {
            JButton botonPulsado = (JButton) ae.getSource();
            if (botonPulsado.getName().equals("aceptar")) {
                System.out.println("aceptar");
            }
            else if (botonPulsado.getName().equals("aceptar2")) {
                System.out.println("aceptar2");
            }
        }        
    }
}

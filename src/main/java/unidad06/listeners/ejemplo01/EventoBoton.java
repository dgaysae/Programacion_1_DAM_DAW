package unidad06.listeners.ejemplo01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author diego
 */
public class EventoBoton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Has pulsado el botón");
    }
    
}

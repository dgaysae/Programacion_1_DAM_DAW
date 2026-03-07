package unidad06.mvc.ejemplo02.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author diego
 */
public class EventsViewPersonas implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getActionCommand().equals("acExit")) {
            System.exit(0);
        }
        
    }
    
}

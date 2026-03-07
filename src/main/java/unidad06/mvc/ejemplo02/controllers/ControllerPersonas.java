package unidad06.mvc.ejemplo02.controllers;

import unidad06.mvc.ejemplo02.views.ViewPersonas;

/**
 * 
 * @author diego
 */
public class ControllerPersonas {
    
    ViewPersonas view;
    
    public ControllerPersonas() {
        view = new ViewPersonas("Ejemplo 2.- MVC");
        view.setVisible(true);
        
        setViewEvents();
    }

    private void setViewEvents() {
        view.getMenuItemSalir().addActionListener(new EventsViewPersonas());
    }
    
    
}

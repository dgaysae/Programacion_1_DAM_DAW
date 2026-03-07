package unidad06.mvc.ejemplo01.controller;

import unidad06.mvc.ejemplo01.view.Ventana;

/**
 * 
 * @author diego
 */
public class Controller {
    Ventana ventana;
    // Faltaría un objeto como Modelo para los datos
    
    public Controller() {
        ventana = new Ventana("Ventana1 MVC");
        ventana.getEtiqueta().setText("Controller rules!");
        ventana.setVisible(true);
    }
}

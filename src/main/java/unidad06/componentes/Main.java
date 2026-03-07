package unidad06.componentes;

import javax.swing.JFrame;

/**
 * Ejemplo de ventana.
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Mi primera ventana");
        JFrame ventana1 = new JFrame("Ventana1 1");
        JFrame ventana2 = new JFrame("Ventana1 2");
        
        ventana.setBounds(100, 100, 400, 400);
        ventana1.setBounds(100, 100, 400, 400);
        ventana2.setBounds(100, 100, 400, 400);
        
        // Cierra TODA la aplicación
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Cierra la ventana
        ventana1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Oculta la ventana
        ventana2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        ventana.setVisible(true);
        ventana1.setVisible(true);
        ventana2.setVisible(true);
        
    }
}

package unidad06.layouts;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Los layouts se aplican a contenedores (JFrame, JPanel, etc.) y determinan la disposición en la que
 * los objetos se van a distribuir en dicho contenedor.
 * En este caso tenemos el BorderLayout, que divide el contenedor en cinco regiones: norte, sur, este, oeste y centro.
 * @author diego
 */
public class Main01 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana1 de BorderLayout");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBounds(10, 10, 400, 400);

        // Aplicamos el LayoutManager del BorderLayout a la ventana:
        ventana.setLayout(new BorderLayout());
        
        JLabel jlEtiqueta1 = new JLabel("Etiqueta 1");
        JButton jbBoton1 = new JButton("Aceptar");
        JButton jbBoton2 = new JButton("Centro");
        JButton jbBoton3 = new JButton("Izquierdo");
        JButton jbBoton4 = new JButton("Derecho");
        
        // Indicamos dónde incluir cada control:
        ventana.add(jbBoton1, BorderLayout.PAGE_START);
        ventana.add(jbBoton2, BorderLayout.CENTER);
        ventana.add(jbBoton3, BorderLayout.LINE_START);
        ventana.add(jbBoton4, BorderLayout.LINE_END);
        ventana.add(jlEtiqueta1, BorderLayout.PAGE_END);

        /*
        Obviamente, el BorderLayout no está pensado para incluir un sólo control en cada zona.
        Lo mejor es usar paneles, que contienen otros elementos, para situarlos en cada área.
        */
        
        ventana.setVisible(true);
    }
}

package unidad06.layouts;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * El FlowLayout distribuye los componentes en filas, de izquierda a derecha, y pasa a la siguiente fila
 * cuando no hay más espacio. Los componentes además aparecen centrados.
 * @author diego
 */
public class Main02 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de FlowLayout");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBounds(10, 10, 400, 400);
        ventana.setLayout(new FlowLayout());
        
        JButton btBoton1 = new JButton("Botón 1");
        JButton btBoton2 = new JButton("Botón 2");
        JButton btBoton3 = new JButton("Botón 3");
        JButton btBoton4 = new JButton("Botón 4");
        JButton btBoton5 = new JButton("Botón 5");
        JButton btBoton6 = new JButton("Botón 6");
        JButton btBoton7 = new JButton("Botón 7");
        JButton btBoton8 = new JButton("Botón 8");
        
        ventana.add(btBoton1);
        ventana.add(btBoton2);
        ventana.add(btBoton3);
        ventana.add(btBoton4);
        ventana.add(btBoton5);
        ventana.add(btBoton6);
        ventana.add(btBoton7);
        ventana.add(btBoton8);
        
        ventana.setVisible(true);
    }
}

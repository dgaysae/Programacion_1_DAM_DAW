package unidad06.layouts;

import javax.swing.*;
import java.awt.*;

/**
 * El GridLayout divide el contenedor en una cuadrícula de filas y columnas.
 * @author diego
 */
public class Main04 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de GridLayout");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);
        int filas = 2;
        int columnas = 3;

        ventana.setLayout(new GridLayout(filas, columnas));

        for (int i = 1; i <= (filas * columnas); i++) {
            ventana.add(new JButton("Botón " + i));
        }

        ventana.setVisible(true);
    }
}

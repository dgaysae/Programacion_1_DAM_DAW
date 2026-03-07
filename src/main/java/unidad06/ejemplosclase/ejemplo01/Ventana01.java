package unidad06.ejemplosclase.ejemplo01;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Vamos a crear una ventana mediante código.
 * La ventana es un objeto JFrame.
 *
 * @author diego
 */
public class Ventana01 {
    public static void main(String[] args) {
        JFrame ventana1 = new JFrame();
        ventana1.setTitle("Ventana1 1");

        /*
        Cuando se cierra la ventana, la aplicación finaliza y desocupa
        la memoria principal.
         */
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
        Los elementos en la ventana se dispondrán en el mismo orden en el que
        leemos y/o escribimos: de izquierda a derecha y, cuando no quepan más
        en la línea, pasan a la línea siguiente.
         */
        ventana1.setLayout(new FlowLayout(FlowLayout.LEFT));
//        ventana1.setResizable(false);
        ventana1.setSize(300, 300);

        // Creamos una etiqueta:
        JLabel lbEtiqueta1 = new JLabel("Etiqueta: ");

        // Creamos un campo de texto:
        JTextField tfTexto1 = new JTextField("hola", 10);

        // Creamos un botón:
        JButton btnEjemplo = new JButton("Aceptar");

        //btnEjemplo.setBounds(100, 10, 100, 25);

        /*
        Para ver los componentes creados hemos de añadirlos a la ventana.
        En caso contrario son objetos que ocupan memoria pero por sí solos
        no se muestran ya que deben estar dentro de un contenedor.
         */
        ventana1.add(lbEtiqueta1);
        ventana1.add(tfTexto1);
        ventana1.add(btnEjemplo);

        // La ventana, por defecto, no está visible. Así que la mostramos:
        ventana1.setVisible(true);
    }
}

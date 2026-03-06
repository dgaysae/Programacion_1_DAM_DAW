package unidad06.clasesanonimas.ejemplo01;

import javax.swing.*;

/**
 * Las clases anónimas sirven para instanciar un objeto sin necesidad de crear una clase en un fichero .java.
 * Es decir, instanciamos un objeto que implemente una interfaz (porque no puede instanciar ninguna clase).
 * <br/>
 * Se suele utilizar cuando:
 * <ul>
 *     <li>Necesitamos sobrescribir el comportamiento de una clase existente para un solo uso.</li>
 *     <li>Queremos implementar una interfaz rápidamente sin crear un archivo .java</li>
 * </ul>
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Anselmo", "mo", "12345678A", "C/ Buena Vista, 33, 04123, Almería");
        /*
        Supongamos que queremos hacer dos sistemas para mostrar mensajes:
        1. Por consola.
        2. Con un aviso por ventana.
        Pero no queremos hacer una clase para cada uno de ellos, ya que sólo
        los vamos a usar aquí, en este mismo código.

        Primero creamos una interfaz para que nos oblique a implementar un método
        en las clases anónimas que utilicemos. La interfaz ShowMessage.
        Luego instanciamos objetos a partir de una clase anónima.
         */
        ShowMessage mensajeConsola = new ShowMessage() {
            @Override
            public void show(String mensaje) {
                System.out.println(mensaje);
            }
        };

        ShowMessage mensajeVentana = new ShowMessage() {
            @Override
            public void show(String mensaje) {
                JOptionPane.showMessageDialog(null, mensaje, "Información",  JOptionPane.INFORMATION_MESSAGE);
            }
        };

        mensajeConsola.show("Hola, caracola!");
        mensajeVentana.show("Hola, caracola!");

        mensajeConsola.show("-----------------------------------");
        mensajeConsola.show(p.toString());
        mensajeVentana.show(p.toString());
    }
}

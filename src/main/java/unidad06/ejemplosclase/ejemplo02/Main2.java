package unidad06.ejemplosclase.ejemplo02;

import java.awt.*;

/**
 * Este ejemplo es una versión mejorada de la anterior.
 *
 * Esto se hace cuando vamos a usar el mismo componente en más de una
 * ocasión en la misma u otras ventanas de otras aplicaciones.
 *
 * @author diego
 */
public class Main2 {
    public static void main(String[] args) {
        new Ventana2(new FlowLayout());
    }
}

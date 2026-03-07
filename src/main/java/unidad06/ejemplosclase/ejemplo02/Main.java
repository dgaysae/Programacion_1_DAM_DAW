package unidad06.ejemplosclase.ejemplo02;

import java.awt.*;

/**
 * Este ejemplo muestra cómo hacer nuestros propios propios campos.
 * En este caso es el {@link CampoEdad}, una variante de JTextField
 * que hemos implementado para que admita sólo valores numéricos entre
 * un rango concreto.
 *
 * Esto se hace cuando vamos a usar el mismo componente en más de una
 * ocasión en la misma u otras ventanas de otras aplicaciones.
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        new Ventana02(new FlowLayout());
    }
}

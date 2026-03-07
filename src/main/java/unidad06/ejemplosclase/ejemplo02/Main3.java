package unidad06.ejemplosclase.ejemplo02;

import java.awt.*;

/**
 * Este ejemplo muestra cómo hacer nuestros propios propios campos.
 * <br/>
 * En este caso es el {@link CampoEdad}, una variante de JTextField que hemos implementado para que sólo admita
 * valores numéricos entre un rango concreto.
 * <br/>
 * Esto se hace cuando vamos a usar el mismo componente en más de una ocasión en la misma u otras ventanas
 * de otras aplicaciones.
 *
 * @author diego
 */
public class Main3 {
    public static void main(String[] args) {
        new Ventana3(new FlowLayout());
    }
}

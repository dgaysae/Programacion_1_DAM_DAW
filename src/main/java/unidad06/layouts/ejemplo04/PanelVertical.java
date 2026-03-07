package unidad06.layouts.ejemplo04;

import javax.swing.*;
import java.awt.*;

/**
 * Podemos crear nuestras propias versiones de los distintos contenedores.
 * En este caso implementamos una clase que nos permitirá crear paneles verticales donde incluir
 * cualquier componente que queramos.
 * Observa que volvemos a usar las funciones variadicas, en este caso en el constructor.
 * También añadimos un espacio vacío de 5 píxeles de alto entre los componentes.
 * @author diego
 */
public class PanelVertical extends JPanel {
    
    public PanelVertical(
            JComponent... componentes
    ) {    
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        for (JComponent componente : componentes) {
            this.add(componente);
            this.add(Box.createRigidArea(new Dimension(0, 5)));
        }        
    }
    
}

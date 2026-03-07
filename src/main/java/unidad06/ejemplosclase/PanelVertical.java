package unidad06.ejemplosclase;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 * <p>
 *     Como ya hemos hecho antes con otros componentes, ahora toca personalizar un panel.
 * </p>
 *     En este caso creamos nuestro propio panel que admite:
 * <ul>
 *     <li>Un flag que diga si queremos que tenga un borde delimitador.</li>
 *     <li>Un número indefinido de componentes, los que queramos: botones, etiquetas, etc.</li>
 * </ul>
 * Este panel distribuirá dichos componentes verticalmente.
 *
 * @author diego
 */
public class PanelVertical extends JPanel {
    
    public PanelVertical(boolean border, JComponent... componentes) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        if (border) {
            setBorder(BorderFactory.createEtchedBorder());
        }
        
        for (JComponent componente : componentes) {
            add(componente);
        }
    }
    
    public PanelVertical(JComponent... componentes) {
        this(false, componentes);
    } 
}

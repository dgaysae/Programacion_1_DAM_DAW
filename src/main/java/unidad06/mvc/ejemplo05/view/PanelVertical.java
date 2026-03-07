package unidad06.mvc.ejemplo05.view;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
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

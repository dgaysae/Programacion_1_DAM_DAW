package unidad06.ejemplosclase;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
public class PanelHorizontal extends JPanel {
    
    public PanelHorizontal(boolean border, JComponent... componentes) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        
        if (border) {
            setBorder(BorderFactory.createEtchedBorder());
        }
        
        for (JComponent componente : componentes) {
            add(componente);
        }
    }
    
    public PanelHorizontal(JComponent... componentes) {
        this(false, componentes);
    }
}

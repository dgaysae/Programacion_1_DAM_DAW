package unidad06.ejemplosclase;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author diego
 */
public class PanelFlow extends JPanel {

    private JLabel lb;
    private JTextField tf;
    
    public PanelFlow(
            String labelText,
            int textColumns,
            Color color,
            String borderTitle) {
        this.setLayout(new FlowLayout());
        
        lb = new JLabel(labelText);
        tf = new JTextField(textColumns);
        
        add(lb);
        add(tf);
        
        setBackground(color);
        setBorder(BorderFactory.createTitledBorder(borderTitle));
    }
    
    public void add(JComponent... componentes) {
        for(JComponent componente: componentes) {
            add(componente);
        }
    }
    
    /**
     * @return the lb
     */
    public JLabel getLb() {
        return lb;
    }

    /**
     * @return the tf
     */
    public JTextField getTf() {
        return tf;
    }
}

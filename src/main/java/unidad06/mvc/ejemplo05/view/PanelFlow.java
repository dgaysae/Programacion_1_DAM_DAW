package unidad06.mvc.ejemplo05.view;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
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
        if (borderTitle != null && !borderTitle.isBlank()) {
            setBorder(BorderFactory.createTitledBorder(borderTitle));
        }
    }
    
    public PanelFlow(
            String labelText,
            int textColumns,
            Color color) {
        this(labelText, textColumns, color, null);
    }
    
    public void add(JComponent... componentes) {
        for(JComponent componente: componentes) {
            add(componente);
        }
    }
    
    /**
     * @return the tf
     */
    public String getValue() {
        return tf.getText();
    }
    
    public void setValue(String value) {
        tf.setText(value);
    }
    
    public void remove() {
        setValue("");
    }
}

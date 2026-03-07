package unidad06.mvc.ejemplo02.views;

import javax.swing.*;
import java.awt.*;

public class VerticalPanel extends JPanel {
    public VerticalPanel(JComponent... components) {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        for (JComponent component : components) {
            this.add(component);
            component.setSize(new Dimension(this.getWidth(), -1));
            this.add(Box.createRigidArea(new Dimension(0, 5)));
        }

    }
}

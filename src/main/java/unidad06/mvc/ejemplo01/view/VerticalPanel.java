package unidad06.mvc.ejemplo01.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
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

    public void setMargins() {
        setBorder(new EmptyBorder(10, 20, 10, 20));
    }

    public void setBorder(String title) {
        setBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createEtchedBorder(), title
                )
        );
    }
}

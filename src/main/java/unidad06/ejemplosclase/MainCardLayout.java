package unidad06.ejemplosclase;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
public class MainCardLayout {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo de CardLayout");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        JPanel panel1 = new JPanel();
        JLabel jlVista1 = new JLabel("Vista 1");
        JButton btBoton1 = new JButton("Ir a Vista 2");
        panel1.add(jlVista1);
        panel1.add(btBoton1);

        JPanel panel2 = new JPanel();
        JLabel jlVista2 = new JLabel("Vista 2");
        JButton btBoton2 = new JButton("Ir a Vista 1");
        panel2.add(jlVista2);
        panel2.add(btBoton2);

        cardPanel.add(panel1, "1");
        cardPanel.add(panel2, "2");
        btBoton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "2");
            }
        });

        btBoton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "1");
            }
        });

        // Configurar botones para cambiar de vista
//        ((JButton) panel1.getComponent(1)).addActionListener(e -> cardLayout.show(cardPanel, "2"));
//        ((JButton) panel2.getComponent(1)).addActionListener(e -> cardLayout.show(cardPanel, "1"));
        ventana.add(cardPanel);
        ventana.setVisible(true);

    }
}

package unidad06.componentes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * Ejemplo de combobox
 * @author diego
 */
public class Main04ComboBox implements ActionListener {
    JFrame ventana;
    JComboBox listaDesplegable01;
    JComboBox listaDesplegable02;
    
    public Main04ComboBox() {
        ventana = new JFrame("Ejemplo de JTabbedPane");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 300);
        ventana.setLayout(new FlowLayout());
        
        listaDesplegable01 = new JComboBox(
                new String[]{"Opción 1", "Opción 2", "Opción 3"}
        );
        listaDesplegable01.setActionCommand("acCombo");
        listaDesplegable01.addActionListener(this);
        
        listaDesplegable02 = new JComboBox(EnumMain04.values());

        ventana.add(listaDesplegable01);
        ventana.add(listaDesplegable02);

        ventana.setVisible(true);
    }
    
    public static void main(String[] args) {
        Main04ComboBox miPrograma = new Main04ComboBox();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        if (ae.getActionCommand().equals("acCombo")) {
        if (ae.getSource() == listaDesplegable01) {
            JComboBox combo = (JComboBox) ae.getSource();
            System.out.println("Item seleccionado: " + combo.getSelectedItem());
            System.out.println("Item seleccionado: " + combo.getSelectedIndex());
        }
    }
}

package unidad06.ejemplosclase.ejemplo03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 * En este ejemplo creamos un combo box a partir del enum {@link DiaSemana}
 * @author diego
 */
public class Ventana03 extends JFrame {

    private JComboBox<DiaSemana> cbOpciones =
            new JComboBox<>(DiaSemana.values());
    
    private JCheckBox cbCheck01 = new JCheckBox("Esto es un check");
    private JCheckBox cbCheck02 = new JCheckBox("Este otro");
    
    private JRadioButton rbRadio01 = new JRadioButton("Opción 1");
    private JRadioButton rbRadio02 = new JRadioButton("Opción 2");
    
    public Ventana03() {
        initWindow();
        
        setComponents();
        
        setEvents();
        
        setVisible(true);
    }

    private void setEvents() {
        cbOpciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(
                        "Opción seleccionada: "
                                + cbOpciones.getSelectedItem());
                System.out.println("Es la opción: "
                        + cbOpciones.getSelectedIndex());
            }
        });
        
        cbCheck01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("cbCheck01 pulsado? "
                        + cbCheck01.isSelected());
            }
        });
        
        cbCheck02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("cbCheck02 pulsado? "
                        + cbCheck02.isSelected());
                
            }
        });
    }

    private void setComponents() {
        add(cbOpciones);
        add(cbCheck01);
        add(cbCheck02);
        add(rbRadio01);
        add(rbRadio02);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbRadio01);
        grupo.add(rbRadio02);
    }

    private void initWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new FlowLayout());
    }
}

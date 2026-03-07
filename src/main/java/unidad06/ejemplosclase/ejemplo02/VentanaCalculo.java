package unidad06.ejemplosclase.ejemplo02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author diego
 */
public class VentanaCalculo extends JFrame {
    JTextField tfNumero1 = new JTextField(5);
    JTextField tfNumero2 = new JTextField(5);
    JButton btnSuma = new JButton("+");
    JButton btnResta = new JButton("-");
    JButton btnProducto = new JButton("*");
    JButton btnDivision = new JButton("/");
    JLabel lbResultado = new JLabel();
    
    public VentanaCalculo() {
        initWindow();
        
        addComponents();
        
        setVisible(true);
    }

    private void initWindow() {
        setTitle("Calculadora simple");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(200, 200);
        setLayout(new FlowLayout());
    }

    private void addComponents() {
        add(btnSuma);
        add(btnResta);
        add(btnProducto);
        add(btnDivision);
        add(tfNumero2);
        add(tfNumero1);
        add(lbResultado);
        
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(tfNumero1.getText());
                int numero2 = Integer.parseInt(tfNumero2.getText());
                
                int suma = numero1 + numero2;
                
                lbResultado.setText(Integer.toString(suma));
            }
        });
    }
}

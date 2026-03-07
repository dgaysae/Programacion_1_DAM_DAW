package unidad06.listeners.ejemplo03;

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
public class Ventana extends JFrame implements ActionListener {
    JLabel lbEtiqueta;
    JTextField tfTexto;
    JButton btBoton, btBoton2;
    
    public Ventana(String title) {
        setTitle(title);
        initVentana();

        setVisible(true);
    }

    private void initVentana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new FlowLayout());
        
        setControles();
    }

    private void setControles() {
        lbEtiqueta = new JLabel("Nombre:");
        tfTexto = new JTextField(15);
        btBoton = new JButton("Aceptar");
        btBoton.addActionListener(this);
        
        btBoton2 = new JButton("Aceptar otra vez");
        btBoton2.addActionListener(this);
        
        add(lbEtiqueta);
        add(tfTexto);
        add(btBoton);
        add(btBoton2);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btBoton) {
            System.out.println("El campo de texto contiene: " + tfTexto.getText());
        }
        else if (ae.getSource() == btBoton2) {
            System.out.println("Se ha pulsado el botón dos");
            tfTexto.setText("");
        }
    }
}

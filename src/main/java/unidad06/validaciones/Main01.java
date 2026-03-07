package unidad06.validaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Cuando queremos usar una misma validación en distintos campos e incluso en distintas
 * ventanas.
 * 
 * @author diego
 */
public class Main01 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Validación");
        ventana.setBounds(100, 100, 400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());
        
        JLabel etiqueta2 = new JLabel("Nombre: ");
        JTextField tfNombre = new JTextField(20);
        JButton boton1 = new JButton("Aceptar");

        ventana.add(etiqueta2);
        ventana.add(tfNombre);
        ventana.add(boton1);

        tfNombre.setInputVerifier(new ValidaSoloLetras());
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValidText(tfNombre)) {
                    JOptionPane.showMessageDialog(
                            ventana,
                            "Este punto se lanzaría otro evento, o se guardaría algo en un fichero o bbdd...",
                            "La validación ha ido bien",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        ventana.setVisible(true);
    }

    private static boolean isValidText(JTextField textField) {
        if (textField.isVisible()
                && textField.isEnabled()
                && !textField.getInputVerifier().verify(textField)) {

            JOptionPane.showMessageDialog(
                    null,
                    "Este campo sólo admite caracteres del abecedario",
                    "Datos de entrada erróneos",
                    JOptionPane.ERROR_MESSAGE);

            // No se recomienda darle el foco a un campo oculto y deshabilitado:
            textField.requestFocus();
            textField.selectAll();

            return false;
        }
        return true;
    }
}

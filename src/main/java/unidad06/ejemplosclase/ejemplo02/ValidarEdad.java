package unidad06.ejemplosclase.ejemplo02;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Este primer validador de edad está limitado al rango de edad hardcodeado
 * entre 1 y 100.
 *
 * @author diego
 */
public class ValidarEdad extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        
        if (input.getClass() == JTextField.class){
            try {
                JTextField campo = (JTextField) input;
                String texto = campo.getText();
                
                System.out.println("texto del campo: " + texto);
                
                if (texto == null || texto.isBlank()) return true;
                
                int edad = Integer.parseInt(texto);
                if (edad < 1 || edad > 100) {
                    return false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        input,
                        "Sólo admite números entre 1 y 100.",
                        "ERROR!",
                        JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
            return true;
        }
        return true;
    }

}

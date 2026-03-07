package unidad06.ejemplosclase.ejemplo02;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Este primer validador de edad está limitado al rango de edad hardcodeado
 * entre 1 y 100.
 * No se puede establecer el rango que necesitemos en cada caso.
 *
 * @author diego
 */
public class ValidarEdad extends InputVerifier {

    private static final int EDAD_MINIMA_DEFAULT = 1;
    private static final int EDAD_MAXIMA_DEFAULT = 100;

    @Override
    public boolean verify(JComponent input) {
        // Comprobamos que efectivamente es un JTextField:
        if (input.getClass() == JTextField.class){
            JTextField campo = (JTextField) input;
            String texto = campo.getText();

            try {
                System.out.println("texto del campo: " + texto);
                
                if (texto == null || texto.isBlank()) {
                    // Limpiamos el campo:
                    campo.setText("");

                    // Permitimos que se pueda perder el foco del campo:
                    return true;
                }
                
                int edad = Integer.parseInt(texto);
                if (edad < EDAD_MINIMA_DEFAULT || edad > EDAD_MAXIMA_DEFAULT) {
                    return false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        input,
                        "Sólo admite números entre 1 y 100.",
                        "ERROR!",
                        JOptionPane.INFORMATION_MESSAGE);
                campo.setText("");
                return false;
            }
            return true;
        }
        return true;
    }

}

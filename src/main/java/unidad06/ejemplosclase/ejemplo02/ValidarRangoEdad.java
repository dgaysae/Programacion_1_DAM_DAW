package unidad06.ejemplosclase.ejemplo02;

import javax.swing.*;

/**
 * Este segundo validador de edad es más flexible que {@link ValidarEdad}, ya que podemos establecer en el constructor
 * los límites del rango a validar.
 *
 * @author diego
 */
public class ValidarRangoEdad extends InputVerifier {

    private static final int EDAD_MINIMA_DEFAULT = 1;
    private static final int EDAD_MAXIMA_DEFAULT = 100;
    private int edadMinima;
    private int edadMaxima;

    /**
     * El rango de edad debe estar correctamente delimitado.
     * @param edadMinima
     * @param edadMaxima
     */
    public ValidarRangoEdad(int edadMinima, int edadMaxima) {
        this.edadMinima = setEdad(edadMinima, EDAD_MINIMA_DEFAULT);
        this.edadMaxima = setEdad(edadMaxima, EDAD_MAXIMA_DEFAULT);
        if (this.edadMinima >= this.edadMaxima) {
            this.edadMinima = EDAD_MINIMA_DEFAULT;
            this.edadMaxima = EDAD_MAXIMA_DEFAULT;
        }
    }

    /**
     * Hace lo mismo que el constructor principal, pero estableciendo los límites por defecto.
     */
    public ValidarRangoEdad() {
        this(EDAD_MINIMA_DEFAULT, EDAD_MAXIMA_DEFAULT);
    }

    /**
     * Validamos la edad y, si está fuera de rango, establecemos la edad por defecto.
     *
     * @param edad
     * @param edadPorDefecto
     */
    private int setEdad(int edad, int edadPorDefecto) {
        return fueraDeRango(edad)
                ? edadPorDefecto
                : edad;
    }

    private static boolean fueraDeRango(int edad) {
        return edad < EDAD_MINIMA_DEFAULT || edad > EDAD_MAXIMA_DEFAULT;
    }

    @Override
    public boolean verify(JComponent input) {

        // Comprobamos que efectivamente es un JTextField:
        if (input.getClass() == JTextField.class) {

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
                if (edad < edadMinima || edad > edadMaxima) {
                    JOptionPane.showMessageDialog(
                            input,
                            "Sólo admite números entre " + edadMinima + " y " + edadMaxima + ".",
                            "ERROR!",
                            JOptionPane.INFORMATION_MESSAGE);
                    campo.setText("");
                    return false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        input,
                        "Sólo admite números entre " + edadMinima + " y " + edadMaxima + ".",
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

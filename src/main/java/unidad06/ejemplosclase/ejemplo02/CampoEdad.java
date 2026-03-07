package unidad06.ejemplosclase.ejemplo02;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * <p>
 *     Este es un <strong>campo de texto personalizado</strong>. Sirve para que el usuario pueda introducir un dato
 *     numérico que represente una edad dentro de un rango específico.
 * </p>
 * <p>
 *     Este <strong>JTextField vitaminado</strong> tiene las propiedades de edad mímina y máxima para establecer dicho
 *     rango cada vez que se cree.
 * </p>
 * <p>
 *     Además se usa setToolTipText para mostrar texto emergente al usuario que le aclare dicha limitación.
 * </p>
 * <p>
 *     Añadimos un KeyListener para impedir que puedan introducirse valores que no sean numéricos.
 * </p>
 * <p>
 *     Validamos los datos que el usuario puede introducir mediante el setInputVerifier. Si se introduce un valor que se
 *     sale del rango, se muestra un mensaje de error por pantalla.
 * </p>
 * <p>
 *     En conclusión, <strong>es un campo de edad autosuficiente</strong>.
 * </p>
 * <p>
 *     El objetivo es la <strong>reutilización</strong>. Se hace cuando vamos a usar el mismo componente en más de una ocasión en la
 *     misma u otras ventanas de otras aplicaciones.
 * </p>
 *
 * @author diego
 */
public class CampoEdad extends JTextField {

    public static final int ANCHURA_DEFAULT = 5;
    public static final int EDAD_MINIMA_DEFAULT = 1;
    public static final int EDAD_MAXIMA_DEFAULT = 100;
    private int edadMinima;
    private int edadMaxima;

    public CampoEdad(int edadMinima, int edadMaxima, int anchura) {
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;

        if (anchura < 0) anchura = ANCHURA_DEFAULT;
        setColumns(anchura);

        setToolTipText(
                "Introduzca un nº entre "
                + edadMinima
                + " y "
                + edadMaxima
                + " (ambos incluidos)");

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                if (!Character.isDigit(caracter)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                /*
                Aquí no necesitamos validar que input es un JTextField, ya que esta validación la aplicamos
                a CampoEdad, que sabemos que lo es.
                 */
                JTextField tfNumero = (JTextField) input;

                // Si no introduce nada o sólo espacios en blanco:
                if (tfNumero.getText().isBlank()) {
                    // Limpiamos el campo:
                    tfNumero.setText("");

                    // Permitimos que se pueda perder el foco del campo:
                    return true;
                }
                    
                int numero = Integer.parseInt(tfNumero.getText());

                if (numero < edadMinima || numero > edadMaxima) {
                    JOptionPane.showMessageDialog(
                            tfNumero,
                            "La edad debe estar entre "
                            + edadMinima
                            + " y "
                            + edadMaxima,
                            "Edad errónea",
                            JOptionPane.ERROR_MESSAGE);
                    tfNumero.setText("");
                    return false;
                }
                return true;
            }
        });

    }

    /**
     * Hace lo mismo que el constructor principal, pero estableciendo la anchura por defecto.
     * @param edadMinima
     * @param edadMaxima
     */
    public CampoEdad(int edadMinima, int edadMaxima) {
        this(edadMinima, edadMaxima, ANCHURA_DEFAULT);
    }

    /**
     * Crea un campo de edad con el rango preestablecido.
     */
    public CampoEdad() {
        this(EDAD_MINIMA_DEFAULT, EDAD_MAXIMA_DEFAULT, ANCHURA_DEFAULT);
    }
}

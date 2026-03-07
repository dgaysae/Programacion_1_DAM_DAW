package unidad06.ejemplosclase.ejemplo02;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author diego
 */
public class CampoEdad extends JTextField {

    private int edadMinima;
    private int edadMaxima;

    public CampoEdad(int edadMinima, int edadMaxima) {
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;

        setColumns(5);

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
                JTextField tfNumero = (JTextField) input;

                if (tfNumero.getText().isBlank()) return true;
                    
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

    public CampoEdad() {
        this(1, 100);
    }
}

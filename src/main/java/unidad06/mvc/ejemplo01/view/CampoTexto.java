package unidad06.mvc.ejemplo01.view;

import javax.swing.*;
import java.awt.*;

/**
 * Creamos un campo de texto personalizado que incluye:
 * <ul>
 *     <li>Una etiqueta</li>
 *     <li>El campo de texto</li>
 * </ul>
 * De esta forma, con instanciar un objeto de esta clase tenemos los dos elementos.
 */
public class CampoTexto extends JPanel {
    private static final int ANCHO_CAMPO_TEXTO = 10;

    private JLabel lbEtiqueta = new JLabel();
    private JTextField tfCampoTexto = new JTextField();

    public CampoTexto(String textoEtiqueta, int anchoCampoTexto) {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        // Validamos los datos de entrada:
        setLabelText(textoEtiqueta);
        if (anchoCampoTexto <= 0) { anchoCampoTexto = ANCHO_CAMPO_TEXTO; }
        this.tfCampoTexto.setColumns(anchoCampoTexto);

        // Añadimos los campos al panel:
        add(lbEtiqueta);
        add(tfCampoTexto);
    }

    /**
     * Establece el texto de la etiqueta para el campo personalizado.
     * @param textoEtiqueta Si no contiene texto, no se mostrará.
     */
    public void setLabelText(String textoEtiqueta) {
        boolean hayEtiqueta = (textoEtiqueta != null && !textoEtiqueta.isBlank());

        this.lbEtiqueta.setVisible(hayEtiqueta);
        this.lbEtiqueta.setText(hayEtiqueta ? textoEtiqueta : "");
    }

    /**
     * Introduce un texto en el textfield de nuestr campo personalizado.
     * @param texto Texto a introducir en nuestro campo.
     */
    public void setText(String texto) {
        this.tfCampoTexto.setText(texto);
    }
}

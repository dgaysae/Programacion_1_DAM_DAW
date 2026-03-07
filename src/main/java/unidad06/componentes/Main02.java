package unidad06.componentes;

import javax.swing.*;
import java.awt.*;

/**
 * Vamos a usar un FlowLayout para que los componentes se distribuyan de la misma forma en que escribimos:
 * de izquierda a derecha y, cuando no caben más, pasan a la línea siguiente.
 *
 * IMPORTANTE: observa cómo se crea y se añade un menú en una ventana.
 * @author diego
 */
public class Main02 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana con componentes");
        ventana.setBounds(100, 100, 400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        JLabel etiqueta1 = new JLabel("Soy una etiqueta");
        JLabel etiqueta2 = new JLabel("Nombre: ");

        JButton boton1 = new JButton("Aceptar");

        JTextField tfNombre = new JTextField(20);

        JCheckBox cbComida1 = new JCheckBox("Carne");
        JCheckBox cbComida2 = new JCheckBox("Pescado");
        JCheckBox cbComida3 = new JCheckBox("Verdura");

        JRadioButton rbOpcion1 = new JRadioButton("Verdadero");
        JRadioButton rbOpcion2 = new JRadioButton("Falso");
        ButtonGroup opciones = new ButtonGroup();
        opciones.add(rbOpcion1);
        opciones.add(rbOpcion2);

        JMenuBar barraMenu = getBarraMenu();
        ventana.setJMenuBar(barraMenu);

        ventana.add(etiqueta1);
        ventana.add(etiqueta2);
        ventana.add(boton1);
        ventana.add(tfNombre);
        ventana.add(cbComida1);
        ventana.add(cbComida2);
        ventana.add(cbComida3);
        ventana.add(rbOpcion1);
        ventana.add(rbOpcion2);

        ventana.setVisible(true);
    }

    private static JMenuBar getBarraMenu() {
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem menuItemAbrir = new JMenuItem("Abrir");
        JMenuItem menuItemGuardar = new JMenuItem("Guardar");
        JMenuItem menuItemGuardarComo = new JMenuItem("Guardar como...");
        menuArchivo.add(menuItemAbrir);
        menuArchivo.add(menuItemGuardar);
        menuArchivo.add(menuItemGuardarComo);

        JMenu menuEdicion = new JMenu("Edición");
        JMenuItem menuItemBuscar = new JMenuItem("Buscar");
        JMenuItem menuItemSeleccionar = new JMenuItem("Seleccionar");
        menuEdicion.add(menuItemBuscar);
        menuEdicion.add(menuItemSeleccionar);

        barraMenu.add(menuArchivo);
        barraMenu.add(menuEdicion);
        return barraMenu;
    }
}

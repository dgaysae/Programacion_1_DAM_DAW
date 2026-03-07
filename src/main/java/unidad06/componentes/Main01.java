package unidad06.componentes;

import javax.swing.*;

/**
 * Metemos componentes sin que la ventana tenga layout.
 * Para ello, hemos de indicar las coordenadas absolutas
 * de cada componente.
 * 
 * @author diego
 */
public class Main01 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana con componentes");
        ventana.setBounds(100, 100, 400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        
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

        etiqueta1.setBounds(10, 10, 100, 20);
        etiqueta2.setBounds(10, 35, 100, 20);
        tfNombre.setBounds(115, 35, 100, 20);
        
        boton1.setBounds(10, 60, 100, 20);

        cbComida1.setBounds(10, 95, 100, 20);
        cbComida2.setBounds(115, 95, 100, 20);
        cbComida3.setBounds(220, 95, 100, 20);
        
        rbOpcion1.setBounds(10, 120, 100, 20);
        rbOpcion2.setBounds(115, 120, 100, 20);

        JMenuBar barraMenu = getBarraMenu();

        // Añadir una barra de menú de esta forma no es lo más correcto:
        ventana.add(barraMenu);

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

        barraMenu.setBounds(5, 5, 200, 20);
        barraMenu.add(menuArchivo);
        barraMenu.add(menuEdicion);
        return barraMenu;
    }
}

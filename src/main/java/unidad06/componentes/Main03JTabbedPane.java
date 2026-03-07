package unidad06.componentes;

import javax.swing.*;

/**
 * Podemos poner pestañas en nuestra aplicación con el control JTabbedPane.
 */
public class Main03JTabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JTabbedPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JTabbedPane tabbedPane = new JTabbedPane();
        JMenuBar barraMenu = getBarraMenu();
        frame.setJMenuBar(barraMenu);

        // Crear paneles para cada pestaña
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Contenido de la pestaña 1"));
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Contenido de la pestaña 2"));

        // Agregar paneles al JTabbedPane
        tabbedPane.addTab("Pestaña 1", panel1);
        tabbedPane.addTab("Pestaña 2", panel2);

        frame.add(tabbedPane);
//        frame.pack();
        frame.setVisible(true);
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

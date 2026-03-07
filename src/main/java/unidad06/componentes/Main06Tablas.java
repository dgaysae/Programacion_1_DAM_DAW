package unidad06.componentes;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Ejemplo de tabla y modelo de tabla.
 * @author diego
 */
public class Main06Tablas {
    public static void main(String[] args) {
        JFrame ventana  = new JFrame("Tablas");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        
        
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable tabla = new JTable(tableModel);
        JScrollPane scroll = new JScrollPane(tabla);
        
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellidos");
        tableModel.addColumn("Edad");
        tableModel.addColumn("Casado");
        
        tableModel.addRow(new Object[]{"Pepe", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe", "Sánchez López", 45, true});
        
        ventana.add(scroll);
        
        ventana.setVisible(true);
    }
}

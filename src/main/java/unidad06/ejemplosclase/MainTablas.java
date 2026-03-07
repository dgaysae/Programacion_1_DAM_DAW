package unidad06.ejemplosclase;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author diego
 */
public class MainTablas {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Tablas");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        DefaultTableModel tableModel = new DefaultTableModel();
        JTable tabla = new JTable(tableModel);
        JScrollPane scroll = new JScrollPane(tabla);

        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellidos");
        tableModel.addColumn("Edad");
        tableModel.addColumn("Casado");

        tableModel.addRow(new Object[]{"Pepe1", "Sánchez López", 45});
        tableModel.addRow(new Object[]{"Pepe1", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe2", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe3", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe4", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe5", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe6", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe7", "Sánchez López", 45, true});
        tableModel.addRow(new Object[]{"Pepe8", "Sánchez López", 45, true});

        ventana.add(scroll);

        ventana.setVisible(true);
    }
}

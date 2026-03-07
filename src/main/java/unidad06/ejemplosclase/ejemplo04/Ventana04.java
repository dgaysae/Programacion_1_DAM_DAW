package unidad06.ejemplosclase.ejemplo04;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import unidad06.ejemplosclase.Persona;
import unidad06.ejemplosclase.model.DataProvider;

/**
 *
 * @author diego
 */
public class Ventana04 extends JFrame {

    private DefaultTableModel tableModel = new DefaultTableModel();
    private JTable tabla = new JTable(tableModel);
    private JScrollPane scroll = new JScrollPane(tabla);
    private JButton btBorrar = new JButton("Borrar");
    
    private List<Persona> personas;

    public Ventana04() {
        initWindow();
        
        add(scroll);
        add(btBorrar, BorderLayout.SOUTH);
        btBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tabla.getSelectedRow();
                        
                if (filaSeleccionada == -1) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Debe seleccionar una fila de la tabla", "Error!",
                            JOptionPane.ERROR_MESSAGE);
                }
                else {
                    tableModel.removeRow(filaSeleccionada);
                    personas.remove(filaSeleccionada);
                    for(Persona persona : personas) {
                        System.out.println(persona);
                    }
                }
            }
        });

        setTable();
        
        setVisible(true);
    }

    private void initWindow() {
        setTitle("Ventana1 con tabla");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
    }

    private void setTable() {
        tableModel.setColumnIdentifiers(new String[]{"Nombre", "Edad", "Altura"});
        
        personas = DataProvider.get(5);
        
        for(Persona persona : personas) {
            tableModel.addRow(new Object[]{
                persona.getNombre(),
                persona.getEdad(),
                persona.getAltura()});
        }

//        tableModel.addRow(new Object[]{"Pepe", 25, 1.78});
//        tableModel.addRow(new Object[]{"Anselmo", 32, 1.78});
//        tableModel.addRow(new Object[]{"Peláez", 33, 1.78});
//        tableModel.addRow(new Object[]{"Paca", 44, 1.78});
//        tableModel.addRow(new Object[]{"Pepón", 55, 1.78});
//        tableModel.addRow(new Object[]{"Juanita", 67, 1.78});
//        tableModel.addRow(new Object[]{"Filomeno", 79, 1.78});
//        tableModel.addRow(new Object[]{"Olegario", 62, 1.78});
    }
}

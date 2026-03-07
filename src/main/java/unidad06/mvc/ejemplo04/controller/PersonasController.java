package unidad06.mvc.ejemplo04.controller;

import unidad06.mvc.ejemplo04.model.Persona;
import unidad06.mvc.ejemplo04.model.PersonasModel;
import unidad06.mvc.ejemplo04.view.PersonasView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


/**
 *
 * @author diego
 */
public class PersonasController {

    private PersonasView ventana = new PersonasView();
    private PersonasModel modelo = new PersonasModel();

    public PersonasController() {
        setActions();

        setTableColumns();

        fillTable();

    }

    private void fillTable() {
        for (Persona persona : modelo.select()) {
            ventana.getTableModel().addRow(new Object[]{
                persona.getNombre(),
                persona.getEdad(),
                persona.getAltura()});
        }
    }

    private void setTableColumns() {
        ventana.getTableModel().setColumnIdentifiers(
                modelo.getColumnNames()
        );
    }

    private void setActions() {

        ventana.getTabla().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = ventana.getTabla().getSelectedRow();
                System.out.println("Hemos pulsado sobre la tabla en la fila: " + ventana.getTabla().getSelectedRow());
                for (int i = 0; i < ventana.getTableModel().getColumnCount(); i++) {
                    ventana.getTableModel().getValueAt(filaSeleccionada, i);
                }

                String nombre = String.valueOf(ventana.getTableModel().getValueAt(filaSeleccionada, 0));
                Integer edad = (Integer) ventana.getTableModel().getValueAt(filaSeleccionada, 1);
                Double altura = (Double) ventana.getTableModel().getValueAt(filaSeleccionada, 2);

                ventana.getTfNombre().setText(nombre);
                ventana.getTfEdad().setText(edad.toString());
                ventana.getTfAltura().setText(altura.toString());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        ventana.getBtBorrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = ventana.getTabla().getSelectedRow();

                if (filaSeleccionada == -1) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Debe seleccionar una fila de la tabla", "Error!",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    //ventana.getTableModel().removeRow(filaSeleccionada);
                    if (!modelo.delete(filaSeleccionada)) {
                        JOptionPane.showMessageDialog(
                                ventana,
                                "Registro no encontrado",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    ventana.getTableModel().setRowCount(0);
                    fillTable();
                    /*
                    personas.remove(filaSeleccionada);
                    for(pruebas.pruebas01.Persona persona : personas) {
                    System.out.println(persona);
                    }
                     */
                }
            }
        });
    }

}

package unidad06.mvc.ejemplo05.controller;

import unidad06.mvc.ejemplo05.model.Persona;
import unidad06.mvc.ejemplo05.model.PersonasModel;
import unidad06.mvc.ejemplo05.view.PersonasView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author diego
 */
public class PersonasController {

    private PersonasView view = new PersonasView();
    private PersonasModel model = new PersonasModel();
    private boolean selected = false;

    public PersonasController() {
        fillTable();

        view.getBtGuardar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!selected) {
                    insertPersona();
                }
                else {
                    updatePersona();
                }
            }

            private void updatePersona() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        view.getTabla().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = view.getTabla().getSelectedRow();
                if (filaSeleccionada != -1) {
                    String nombre = (String) view.getTabla().getValueAt(filaSeleccionada, 0);
                    Integer edad = (Integer) view.getTabla().getValueAt(filaSeleccionada, 1);
                    Double altura = (Double) view.getTabla().getValueAt(filaSeleccionada, 2);
                    
                    view.getPfNombre().setValue(nombre);
                    view.getPfEdad().setValue(edad.toString());
                    view.getPfAltura().setValue(altura.toString());
                    selected = true;
                }
                else {
                    System.out.println("Estás pulsando fuera de la tabla");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

    }

    private void fillTable() {
        view.getTableModel().setColumnIdentifiers(model.getColumns());
        vaciarTabla();
        for (Persona p : model.select()) {
            view.getTableModel().addRow(p.rowData());
        }
    }

    private void vaciarTabla() {
        view.getTableModel().setRowCount(0);
    }

    private void insertPersona() {
        String nombre = view.getPfNombre().getValue();
        Integer edad = Integer.parseInt(view.getPfEdad().getValue());
        Double altura = Double.parseDouble(view.getPfAltura().getValue());

        model.insert(new Persona(nombre, edad, altura));
        fillTable();
        
        vaciarFormulario();
    }

    private void vaciarFormulario() {
        view.getPfNombre().remove();
        view.getPfEdad().remove();
        view.getPfAltura().remove();
    }
}

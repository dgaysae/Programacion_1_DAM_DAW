package unidad06.mvc.ejemplo03.controllers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import unidad06.mvc.ejemplo03.model.Persona;
import unidad06.mvc.ejemplo03.views.ViewPersonas;
import unidad06.mvc.ejemplo03.model.Personas;

/**
 * 
 * @author diego
 */
public class ControllerPersonas {
    ViewPersonas view = new ViewPersonas("----- Personas -----");
    Personas model = new Personas();
    
    public ControllerPersonas() {
        loadTable();
        setEventComponents();
        
        view.setVisible(true);
    }

    private void loadTable() {
        setColumnNames();
        loadDataTable();
    }

    private void setColumnNames() {
        String[] columnNames = model.getPersonaColumnNames();
        DefaultTableModel tableModel = (DefaultTableModel) view.getTable().getModel();
        
        for (String columnName : columnNames) {
            tableModel.addColumn(columnName);
        }
    }

    private void setEventComponents() {
        ControllerPersonasEvents eventos = new ControllerPersonasEvents(view, model, this);
        
        view.getBtAdd().addActionListener(eventos);
        view.getBtRemove().addActionListener(eventos);
        view.getBtExit().addActionListener(eventos);
    }

    protected void loadDataTable() {
        ArrayList<Persona> personas = model.getPersonas();
        DefaultTableModel tableModel = (DefaultTableModel) view.getTable().getModel();
        
        // Vaciamos la tabla antes de cargarla:
        tableModel.setRowCount(0);
        
        for (Persona persona : personas) {
            tableModel.addRow(persona.getDataRow());
        }
    }
    
}

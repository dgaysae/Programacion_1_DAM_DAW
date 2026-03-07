package unidad06.mvc.ejemplo05.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author diego
 */
public class PersonasView extends JFrame {
    
    private JButton btGuardar = new JButton("Guardar");
    private JButton btBorrar = new JButton("Borrar");
    private JButton btSalir = new JButton("Salir");
    
    private PanelFlow pfNombre = new PanelFlow(
            "Nombre: ",
            10,
            Color.white
    );
    
    private PanelFlow pfEdad = new PanelFlow(
            "Edad: ",
            5, Color.white
    );
    
    private PanelFlow pfAltura = new PanelFlow(
            "Altura: ",
            5,
            Color.white
    );
    
    private DefaultTableModel tableModel = new DefaultTableModel();
    private JTable tabla = new JTable(tableModel);
    JScrollPane scroll = new JScrollPane(tabla);
    
    PanelVertical jpFormulario = new PanelVertical(pfNombre, pfEdad, pfAltura);
    PanelVertical jpBotonera = new PanelVertical(
            btGuardar, btBorrar, btSalir);
    
    public PersonasView() {
        setTitle("Ejemplo de BoxLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        
        add(jpFormulario, BorderLayout.NORTH);
        add(jpBotonera, BorderLayout.EAST);
        add(scroll);
        
        setVisible(true);
    }
    
    /**
     * @return the btGuardar
     */
    public JButton getBtGuardar() {
        return btGuardar;
    }

    /**
     * @return the btBorrar
     */
    public JButton getBtBorrar() {
        return btBorrar;
    }

    /**
     * @return the btSalir
     */
    public JButton getBtSalir() {
        return btSalir;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public PanelFlow getPfNombre() {
        return pfNombre;
    }

    public PanelFlow getPfEdad() {
        return pfEdad;
    }

    public PanelFlow getPfAltura() {
        return pfAltura;
    }

    public JTable getTabla() {
        return tabla;
    }
    
    
}

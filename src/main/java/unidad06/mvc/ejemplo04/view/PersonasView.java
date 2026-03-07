package unidad06.mvc.ejemplo04.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class PersonasView extends JFrame {
    // Campos del formulario
    JLabel lbNombre = new JLabel("Nombre: ");
    JLabel lbEdad = new JLabel("Edad: ");
    JLabel lbAltura = new JLabel("Altura: ");
    JTextField tfNombre = new JTextField(15);
    JTextField tfEdad = new JTextField(5);
    JTextField tfAltura = new JTextField(5);
    
    // Tabla de datos
    private DefaultTableModel tableModel = new DefaultTableModel();
    private JTable tabla = new JTable(tableModel);
    private JScrollPane scroll = new JScrollPane(tabla);
    
    // Botones
    private JButton btBorrar = new JButton("Borrar");
    
    public PersonasView() {
        initWindow();
        
        // Tabla de datos
        add(scroll);
        
        // Formulario
        JPanel pnFormulario = new JPanel(new FlowLayout());
        
        pnFormulario.add(lbNombre);
        pnFormulario.add(tfNombre);
        pnFormulario.add(lbEdad);
        pnFormulario.add(tfEdad);
        pnFormulario.add(lbAltura);
        pnFormulario.add(tfAltura);
        
        add(pnFormulario, BorderLayout.NORTH);
        // Botonera
        add(btBorrar, BorderLayout.SOUTH);

        setVisible(true);
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public JButton getBtBorrar() {
        return btBorrar;
    }

    public JTable getTabla() {
        return tabla;
    }

    public JTextField getTfNombre() {
        return tfNombre;
    }

    public JTextField getTfEdad() {
        return tfEdad;
    }

    public JTextField getTfAltura() {
        return tfAltura;
    }
    
    

    private void initWindow() {
        setTitle("Ventana con tabla");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
    }
}

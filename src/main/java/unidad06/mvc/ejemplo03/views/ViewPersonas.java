package unidad06.mvc.ejemplo03.views;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author diego
 */
public class ViewPersonas extends JFrame {
    private DefaultTableModel tableModel = new DefaultTableModel();
    private JTable table = new JTable(tableModel);
    private JButton btAdd = new JButton("Añadir");
    private JButton btRemove = new JButton("Borrar");
    private JButton btExit = new JButton("Salir");
    
    public ViewPersonas(String title) {
        setTitle(title);
        initWindow();
        setViewComponents();
    }
    
    public JTable getTable() {
        return table;
    }
    
    public JButton getBtAdd() {
        return btAdd;
    }

    public JButton getBtRemove() {
        return btRemove;
    }

    public JButton getBtExit() {
        return btExit;
    }

    private void initWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout());
    }

    private void setViewComponents() {
        
        btAdd.setActionCommand("acAdd");
        btRemove.setActionCommand("acRemove");
        btExit.setActionCommand("acExit");
        
        Box panelVertical = Box.createVerticalBox();
        panelVertical.add(btAdd);
        panelVertical.add(btRemove);
        panelVertical.add(btExit);
                
        add(panelVertical, BorderLayout.LINE_END);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
    
}

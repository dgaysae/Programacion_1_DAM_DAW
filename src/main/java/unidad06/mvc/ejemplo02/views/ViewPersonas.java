package unidad06.mvc.ejemplo02.views;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class ViewPersonas extends JFrame {
    JMenuBar mbBarraMenu;
    JMenu mArchivo, mEdicion;
    JMenuItem miAbrir, miGuardar, miSalir;
    JMenuItem miBuscar, miSeleccionar;
    
    JTable tabla;
    DefaultTableModel tableModel;
            
    public ViewPersonas(String title) {
        setTitle(title);
        setViewProperties();
        setViewMenu();
    }
    
    public JMenuItem getMenuItemSalir() {
        return miSalir;
    }

    private void setViewProperties() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());
    }

    private void setViewMenu() {
        mbBarraMenu = new JMenuBar();
        
        mArchivo = new JMenu("Archivo");
        miAbrir = new JMenuItem("Abrir");
        miGuardar = new JMenuItem("Guardar");
        miSalir = new JMenuItem("Salir");
        miSalir.setActionCommand("acExit");
        miSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        mArchivo.add(miAbrir);
        mArchivo.add(miGuardar);
        mArchivo.add(miSalir);
        
        mEdicion = new JMenu("Edición");

        miBuscar = new JMenuItem("Buscar");
        miSeleccionar = new JMenuItem("Seleccionar");
        
        mEdicion.add(miBuscar);
        mEdicion.add(miSeleccionar);

        mbBarraMenu.add(mArchivo);
        mbBarraMenu.add(mEdicion);
        
        setJMenuBar(mbBarraMenu);
    }
}

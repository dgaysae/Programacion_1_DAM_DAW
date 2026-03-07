package unidad06.ejemplosclase;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @see PanelFlow
 * @see PanelVertical
 * @author diego
 */
public class VentanaBoxLayout extends JFrame {
    
    private JButton btGuardar = new JButton("Guardar");
    private JButton btBorrar = new JButton("Borrar");
    private JButton btSalir = new JButton("Salir");
    
    PanelFlow pf1 = new PanelFlow(
            "Nombre: ",
            10,
            Color.white,
            "Datos personales"
    );
    
    PanelFlow pf2 = new PanelFlow(
            "Edad: ",
            5, Color.white,
            "Datos bancarios"
    );
    
    PanelFlow pf3 = new PanelFlow(
            "Altura: ",
            5,
            Color.white,
            "Mi jpanel mola más");
    
    PanelVertical jpIzdo = new PanelVertical(pf1, pf2, pf3);
    PanelVertical jpDcho = new PanelVertical(
            btGuardar, btBorrar, btSalir);
    
    public VentanaBoxLayout() {
        setTitle("Ejemplo de BoxLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        setLayout(
                new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS)
        );
        
        add(jpIzdo);
        add(jpDcho);
        
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
}

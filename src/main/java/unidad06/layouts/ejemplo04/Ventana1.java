package unidad06.layouts.ejemplo04;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Vamos a empezar a separar los elementos para abstraerlos como objetos independientes.
 * Este caso es el de la ventana, que será una clase que hereda de JFrame todos sus miembros
 * y funcionalidades
 * Como nuestra clase representa una ventana, sus atributos serán los componentes de dicha ventana.
 * @author diego
 */
public class Ventana1 extends JFrame {
    JButton bt01, bt02, bt03, bt04;
    JButton btBoton1, btBoton2, btBoton3, btBoton4;
    JButton btCentral;
    JLabel jl01, jl02, jl03, jl04;
            
    public Ventana1(String titulo) {
        setTitle(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 400, 400);
        setLayout(new BorderLayout());
        
        bt01 = new JButton("Botón 1");
        bt02 = new JButton("Botón 2");
        bt03 = new JButton("Botón 3");
        bt04 = new JButton("Botón 4");
        
        btBoton1 = new JButton("Botón 1.1");
        btBoton2 = new JButton("Botón 1.2");
        btBoton3 = new JButton("Botón 1.3");
        btBoton4 = new JButton("Botón 1.4");
        
        btCentral = new JButton("Botón central");

        jl01 = new JLabel("Label 1");
        jl02 = new JLabel("Label 2");
        jl03 = new JLabel("Label 3");
        jl04 = new JLabel("Label 4");
        
        // TODO: revisar cómo hacer este panel:
//        JPanel paneIzquierdo = new JPanel(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        JPanel paneIzquierdo = new PanelVertical(jl03, bt01, bt02, bt03);
        
        JPanel panelDcho = new PanelVertical(btBoton1, btBoton2, btBoton3, btBoton4);
        
        
        add(paneIzquierdo, BorderLayout.LINE_START);
        add(btCentral, BorderLayout.CENTER);
        add(jl01, BorderLayout.PAGE_START);
        add(jl02, BorderLayout.PAGE_END);
        add(panelDcho, BorderLayout.LINE_END);
        
        System.out.println("Titulo: " + this.getTitle());
        
        setVisible(true);
    }
}

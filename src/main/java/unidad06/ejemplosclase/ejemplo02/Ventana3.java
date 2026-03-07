package unidad06.ejemplosclase.ejemplo02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Al heredar de JFrame (ventana) estamos creando una ventana más específica (como dictan los principios de la
 * herencia).
 * <br/>
 * En nuestra ventana vamos a incluir como propiedades los distintos componentes que vamos a usar: botones, etiquetas,
 * etc.
 * <br/>
 * Se incluye un menú, que se añade a la ventana de forma distinta al resto de componentes.
 *
 * @author diego
 */
public class Ventana3 extends JFrame {

    JButton btnEjemplo = new JButton("Aceptar");
    JLabel lbEtiqueta1 = new JLabel("Edad: ");

    CampoEdad tfEdad = new CampoEdad(20, 80);

    JMenuBar mbMenu = new JMenuBar();
    JMenu mFile = new JMenu("File");
    JMenu mEdit = new JMenu("Edit");
    JMenu mView = new JMenu("View");
    JMenuItem miOpenCalculadora = new JMenuItem("Open calc");
    JMenuItem miNewFile = new JMenuItem("New file");
    JMenuItem miExit = new JMenuItem("Exit");

    /**
     * Generamos la ventana y sus componentes y la mostramos.
     * Establecemos el Layout Manager que dictará la forma en que los componentes se organizarán en la pantalla.
     * <br>
     * Para más información:
     * <a href="https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html">A Visual Guide to Layout Managers</a>
     * @param title
     * @param layout
     */
    public Ventana3(String title, LayoutManager layout) {
        /*
        Es importante establecer un Layout Manager que no sea nulo, porque si es nulo deberíamos situar manualmente
        cada componente en la ventana indicando su posición (X e Y) y su tamaño (altura y anchura).
         */
        if (layout == null) {
            layout = new BorderLayout();
        }
        initWindow(title, layout);
        setMenu();

        checkLayout(layout);

        setActionCommands();

        setVisible(true);
    }

    /**
     * Genera la ventana de la misma forma que el constructor principal, admitiendo como parámetro el Layout Manager y
     * estableciendo por defecto el título de la ventana.
     * @param layout
     */
    public Ventana3(LayoutManager layout) {
        this("Nueva ventana", layout);
    }

    /**
     * Genera la ventana de la misma forma que el constructor anterior, pero estableciendo BoderLayout por defecto
     * como el Layout Manager de la ventana.
     * @param title
     */
    public Ventana3(String title) {
        this(title, new BorderLayout());
    }

    /**
     * Genera la ventana de la misma forma que el constructor anterior, estableciendo BoderLayout por defecto como el
     * Layout Manager de la ventana.
     * Al no tener parámetros, establece por defecto el título.
     */
    public Ventana3() {
        this("Nueva ventana");
    }

    /**
     * Establece los elementos básicos de la ventana.
     * @param title Texto de la barra de título de la ventana.
     * @param layout Layout Manager de la ventana.
     */
    private void initWindow(String title, LayoutManager layout) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(layout);
        setSize(300, 300);
    }

    /**
     * Para nuestro ejemplo situaremos los componentes según el layout seleccionado.
     * @param layout
     */
    public void checkLayout(LayoutManager layout) {
        if (layout.getClass() == BorderLayout.class) {
            add(lbEtiqueta1, BorderLayout.WEST);
            add(tfEdad);
            add(btnEjemplo, BorderLayout.EAST);
        } else {
            add(lbEtiqueta1);
            add(tfEdad);
            add(btnEjemplo);
        }
    }

    /**
     * Configura los distintos menús y sus respectivas opciones.
     */
    private void setMenu() {
        mbMenu.add(mFile);
        mFile.add(miNewFile);
        mFile.add(miExit);

        mbMenu.add(mEdit);

        mView.add(miOpenCalculadora);
        mbMenu.add(mView);
        setJMenuBar(mbMenu);

        miExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        miOpenCalculadora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaCalculo();
            }
        });
    }

    private void setActionCommands() {
        btnEjemplo.setActionCommand("btnEjemplo");
        miExit.setActionCommand("miExit");
    }
}

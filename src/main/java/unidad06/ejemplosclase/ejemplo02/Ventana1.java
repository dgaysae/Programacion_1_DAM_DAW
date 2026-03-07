package unidad06.ejemplosclase.ejemplo02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 * Al heredar de JFrame (ventana) estamos creando una ventana más específica (como dictan los principios de la
 * herencia).
 * <br/>
 * En nuestra ventana vamos a incluir como propiedades los distintos componentes que vamos a usar: botones, etiquetas,
 * etc.
 * <br/>
 * Se incluye un menú, que se añade a la ventana de forma distinta al resto de componentes.
 * <br/>
 * Usamos un JTextField para introducir la edad:
 * <ul>
 *     <li>Le aplicamos un KeyListener para impedir que el usuario introduzca caracteres que no sean dígitos.</li>
 *     <li>Le asignamos un validador con setInputVerifier para impedir un valor fuera de un rango concreto.</li>
 * </ul>
 * El validador es {@link ValidarEdad} y es muy rígido, ya que establece dentro de él el rango de edad.
 *
 * @author diego
 */
public class Ventana1 extends JFrame {

    JButton btnEjemplo = new JButton("Aceptar");
    JLabel lbEtiqueta1 = new JLabel("Edad: ");
    
    JTextField tfCampoDeTextoParaEdad = new JTextField(6);

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
    public Ventana1(String title, LayoutManager layout) {
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

        setComponents();

        setActionCommands();

        setVisible(true);
    }

    /**
     * Genera la ventana de la misma forma que el constructor principal, admitiendo como parámetro el Layout Manager y
     * estableciendo por defecto el título de la ventana.
     * @param layout
     */
    public Ventana1(LayoutManager layout) {
        this("Nueva ventana", layout);
    }

    /**
     * Genera la ventana de la misma forma que el constructor anterior, pero estableciendo BoderLayout por defecto
     * como el Layout Manager de la ventana.
     * @param title
     */
    public Ventana1(String title) {
        this(title, new BorderLayout());
    }

    /**
     * Genera la ventana de la misma forma que el constructor anterior, estableciendo BoderLayout por defecto como el
     * Layout Manager de la ventana.
     * Al no tener parámetros, establece por defecto el título.
     */
    public Ventana1() {
        this("Validador rígido");
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
            add(tfCampoDeTextoParaEdad);
            add(btnEjemplo, BorderLayout.EAST);
        } else {
            add(lbEtiqueta1);
            add(tfCampoDeTextoParaEdad);
            add(btnEjemplo);
        }
        btnEjemplo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfCampoDeTextoParaEdad.setText("Hola, Pepe!");
            }
        });
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

    /**
     * Configuramos los componentes de la pantalla.
     * En nuestro ejemplo será sólo el campo de edad.
     * Se usa setToolTipText para mostrar al usuario texto emergente que le de información sobre el campo.
     * <br/>
     * Añadimos un KeyListener para impedir que puedan introducirse valores que no sean numéricos.
     * <br/>
     * Validamos los datos que el usuario puede introducir mediante el setInputVerifier. Para ello hemos creado la clase
     * {@link ValidarEdad}, que es un InputVerifier. Este validador nos limita a un rango fijo de edades entre 1 y 100
     * años.
     */
    private void setComponents() {
        tfCampoDeTextoParaEdad.setToolTipText("Introduzca un nº entre 1 y 100 (ambos incluidos)");
        tfCampoDeTextoParaEdad.setInputVerifier(new ValidarEdad());
        tfCampoDeTextoParaEdad.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
                System.out.println("Tecla pulsada: " + e.getKeyChar());
                
                //if (Character.toString(e.getKeyChar()).matches("[0-9]"))
                if (!Character.isDigit(e.getKeyChar())) {
                    // El carácter pulsado se consume. Es decir, no se llega a introducir en el campo:
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
}

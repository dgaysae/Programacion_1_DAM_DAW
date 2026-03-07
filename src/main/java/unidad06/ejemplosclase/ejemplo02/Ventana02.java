package unidad06.ejemplosclase.ejemplo02;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
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
 *
 * @author diego
 */
public class Ventana02 extends JFrame {

    JButton btnEjemplo = new JButton("Aceptar");
    JLabel lbEtiqueta1 = new JLabel("Edad: ");
    
    JTextField tfCampoDeTextoParaEdad = new JTextField(6);
    CampoEdad tfEdad = new CampoEdad(20, 80);
    
    JMenuBar mbMenu = new JMenuBar();
    JMenu mFile = new JMenu("File");
    JMenu mEdit = new JMenu("Edit");
    JMenu mView = new JMenu("View");
    JMenuItem miOpenCalculadora = new JMenuItem("Open calc");
    JMenuItem miNewFile = new JMenuItem("New file");
    JMenuItem miExit = new JMenuItem("Exit");

    public Ventana02(String title, LayoutManager layout) {
        initWindow(title, layout);
        setMenu();

        checkLayout(layout);

        setComponents();

        setActionCommands();

        setVisible(true);
    }

    public Ventana02(String title) {
        this(title, new BorderLayout());
    }

    public Ventana02(LayoutManager layout) {
        this("Nueva ventana", layout);
    }

    public Ventana02() {
        this("Nueva ventana");
    }

    private void initWindow(String title, LayoutManager layout) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(layout);
        setSize(300, 300);
    }

    public void checkLayout(LayoutManager layout) {
        if (layout.getClass() == BorderLayout.class) {
            add(lbEtiqueta1, BorderLayout.WEST);
//            add(tfTexto1);
            add(tfEdad);
            add(btnEjemplo, BorderLayout.EAST);
        } else {
            add(lbEtiqueta1);
//            add(tfTexto1);
            add(tfEdad);
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

    private void setComponents() {
        tfCampoDeTextoParaEdad.setToolTipText("Introduzca un nº entre 1 y 100 (ambos incluidos)");
        tfCampoDeTextoParaEdad.setInputVerifier(new ValidarEdad());
        tfCampoDeTextoParaEdad.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
                System.out.println("Tecla pulsada: " + e.getKeyChar());
                
                //if (Character.toString(e.getKeyChar()).matches("[0-9]"))
                if (!Character.isDigit(e.getKeyChar())) {
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

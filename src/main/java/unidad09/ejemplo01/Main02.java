package unidad09.ejemplo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <p>
 *     En caso de encontrar algún legacy-code donde, por el motivo que sea, no se puede usar el try-with-resouces,
 *     debemos usar el finally.
 * </p>
 *
 * @author dgs
 */public class Main02 {
    public static final String cadenaConexion = "jdbc:mysql://localhost:3306/instituto";
    public static final String usuario = "root";
    public static final String pwd = "";

    public static void main(String[] args) {
        Connection c = null;
        try {
            c = DriverManager.getConnection(cadenaConexion, usuario, pwd);
            System.out.println("Conexión realizada!");
        }
        catch (SQLException e) {
            System.out.println("Error en la conexión! " + e.getMessage());
        }
        finally {
            cerrar(c);
        }

        System.out.println("Fin del programa!");
    }

    /**
     * Creamos un método que cierre esos elementos abiertos.
     * @param c
     */
    public static void cerrar(Connection c) {
        if (c != null) {
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

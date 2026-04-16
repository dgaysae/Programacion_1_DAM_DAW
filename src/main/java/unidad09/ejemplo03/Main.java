package unidad09.ejemplo03;

import java.sql.*;

/**
 * <p>
 *     Dos de tres: conexión con la bbdd, ejecución de sentencia (de escritura) y ahora toca ¡consultar datos! <br/>
 *     Mediante el Statement vamos a lanzar una SELECT que devolverá un conjunto (Set) de registros o resultados (Result).
 *     En otras palabras, un objeto <strong>ResultSet</strong> que aglutina la lista de registros obtenidos en la consulta.
 * </p>
 * <p>
 *     Este ResultSet se crea a partir del Statement.
 * </p>
 *
 * @author dgs
 */
public class Main {
    public static final String cadenaConexion = "jdbc:mysql://localhost:3306/instituto";
    public static final String usuario = "root";
    public static final String pwd = "";

    /**
     * Un Statement se crea a partir de la conexión a la base de datos, y se ejecuta como vemos a continuación.
     * @param args
     */
    public static void main(String[] args) {
        try (Connection c = DriverManager.getConnection(cadenaConexion, usuario, pwd);
             Statement s = c.createStatement();
             ResultSet rows = s.executeQuery("SELECT dni, nombre, apellidos, email FROM alumnos;")) {

            while (rows.next()) {
                System.out.println("DNI: " + rows.getString("dni"));
                System.out.println("Nombre: " + rows.getString("nombre"));
                System.out.println("Apellidos: " + rows.getString("apellidos"));
                System.out.println("Email: " + rows.getString("email"));
                System.out.println("-----------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Error en la conexión! " + e.getMessage());
        }

        System.out.println("Fin del programa!");
    }
}

package unidad09.ejemplo03;

import java.sql.*;

/**
 * <p>
 *     Ya hemos establecido la conexión con la bbdd! <br/>
 *     El siguiente paso es que, a través de dicha conexión, creemos las sentencias que queremos ejecutar.
 * </p>
 * <p>
 *     Esto lo haremos con Statement. Esta sentencia, grosso modo, puede hacer dos operaciones:
 *     <ul>
 *         <li>Lectura: consulta (SELECT) elementos de la bbdd usando el método executeQuery.<br/> Para ver estos ejemplos ve a las clases del paquete ejemplo02.</li>
 *         <li>Escritura: que puede ser un alta (INSERT), baja (DELETE) o modificación (UPDATE) en la bbdd usando el método executeUpdate.</li>
 *     </ul>
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

package unidad09.ejemplo02;

import java.sql.*;

/**
 * <p>
 *     Ya hemos establecido la conexión con la bbdd! <br/>
 *     El siguiente paso es que, a través de dicha conexión, creemos las sentencias que queremos ejecutar.
 * </p>
 * <p>
 *     Esto lo haremos con Statement. Esta sentencia, grosso modo, puede hacer dos operaciones:
 *     <ul>
 *         <li>Escritura: que puede ser un alta (INSERT), baja (DELETE) o modificación (UPDATE) en la bbdd usando el método executeUpdate.<br/> Para ver estos ejemplos ve a las clases del paquete ejemplo03.</li>
 *         <li>Lectura: consulta (SELECT) elementos de la bbdd usando el método executeQuery.</li>
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
     * <p>
     *     Se lanzan tres operaciones en este orden: INSERT, UPDATE y DELETE.<br/>
     *     Para ver los resultados en la BD se recomienda comentar dos operaciones y dejar sólo una para su ejecución.
     * </p>
     * @param args
     */
    public static void main(String[] args) {
        int filas = 0;
        filas = insertar("99999999Z", "Federica", "Jorl e Norl", "federica@federica.es");
        System.out.println("Filas afectadas: " + filas);

//        filas = actualizar("99999999Z", "Federica", "Otros Apellidos", "federica@nuevocorreo.es");
//        System.out.println("Filas afectadas: " + filas);

//        filas = borrar("99999999Z");
//        System.out.println("Filas afectadas: " + filas);

        System.out.println("Fin del programa!");
    }

    /**
     * Todos los INSERT se harán introduciendo el curso_id = 1
     * @param dni
     * @return
     */
    public static int insertar(String dni, String nombre, String apellidos, String email) {
        return ejecutarQuery("INSERT INTO alumnos (dni, nombre, apellidos, email, curso_id) VALUES ('"
                + dni + "', '"
                + nombre + "', '"
                + apellidos + "', '"
                + email
                + "', 1)");
    }

    public static int actualizar(String dni, String nombre, String apellidos, String email) {
        return ejecutarQuery("UPDATE alumnos SET nombre = '" + nombre + "'"
                + ", apellidos = '" + apellidos + "'"
                + ", email = '" + email + "'"
                + " WHERE dni = '" + dni + "'"
                + ";");
    }

    public static int borrar(String dni) {
        return ejecutarQuery("DELETE FROM alumnos WHERE dni = '" + dni + "';");
    }

    private static int ejecutarQuery(String query) {
        int filasAfectadas = 0;
        try (Connection c = DriverManager.getConnection(cadenaConexion, usuario, pwd);
             Statement s = c.createStatement();) {

            filasAfectadas = s.executeUpdate(query);
            System.out.println("Query ejecutada: " + query);
        } catch (SQLException e) {
            System.out.println("Error en la conexión! " + e.getMessage());
        }

        return filasAfectadas;
    }
}

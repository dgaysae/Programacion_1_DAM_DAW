package unidad09.ejemplo02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta versión legacy code nos permite ver cómo cerrar todos estos objetos AutoCloseable.
 *
 * @author dgs
 */
public class Main02 {
    public static final String cadenaConexion = "jdbc:mysql://localhost:3306/instituto";
    public static final String usuario = "root";
    public static final String pwd = "";

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

    /**
     * Por si encontramos alguna versión antigua, no está de más recordar cómo cerrar las conexiones, statements, etc.
     * @param query
     * @return
     */
    private static int ejecutarQuery(String query) {
        int filasAfectadas = 0;
        Connection c = null;
        Statement s = null;

        try {

            c = DriverManager.getConnection(cadenaConexion, usuario, pwd);
            s = c.createStatement();

            filasAfectadas = s.executeUpdate(query);
            System.out.println("Query ejecutada: " + query);
        }
        catch (SQLException e) {
            System.out.println("Error en la conexión! " + e.getMessage());
        }
        finally {
            cerrar(c, s);
        }

        return filasAfectadas;
    }

    /**
     * Cierra los elementos abiertos.
     * @param c
     * @param s
     */
    public static void cerrar(Connection c, Statement s) {
        try {
            if (s != null) s.close();
            if (c != null) c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

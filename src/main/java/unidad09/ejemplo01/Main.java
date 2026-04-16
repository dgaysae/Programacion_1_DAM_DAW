package unidad09.ejemplo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <p>
 *     <strong>¡IMPORTANTE!</strong>
 *     Para la correcta ejecución de los ejemplos de esta unidad es necesario:
 *     <ol>
 *         <li>añadir al fichero pom.xml (Maven) del proyecto la dependencia de <strong>MySQL Connector /J</strong> que
 *         se puede encontrar en <a href="https://mvnrepository.com/artifact/com.mysql/mysql-connector-j">MVN Repository</a>.</li>
 *         <li>Instalar <a href="https://www.apachefriends.org/es/index.html">XAMPP</a> o un contenedor Docker con MySQL.</li>
 *     </ol>
 * </p>
 *
 * <p>
 *     Vamos a comenzar de forma gradual para ver los elementos necesarios para que nuestro código pueda atacar una base
 *     de datos (en este caso) MySQL.<br/>
 *     Recordemos que vamos a hacerlo a través de JDBC, que abstrae las particularidades del SGBD para que con el mismo
 *     código podamos acceder a distintos SGBD.
 * </p>
 *
 * <p>
 *     <strong>¡IMPORTANTE!</strong>
 *     En ocasiones nuestro IDE puede sugerir que elijamos un objeto con el mismo nombre que citamos en este código, pero
 *     que no pertenece al paquete <strong>java.sql</strong>. Es importante vigilar esto, ya que el paquete java.sql es
 *     el que contiene la librería de clases de JDBC.
 * </p>
 *
 * <p>
 *     Para este ejemplo hemos creado la bbdd <strong>instituto</strong>. Se puede usar el fichero
 *     <strong>instituto.sql</strong> para crear las tablas y alimentarlas con unos pocos datos.<br/>
 *
 *     El primer paso es conseguir una <strong>conexión con la BBDD</strong>. Esto lo hacemos con un objeto Connection.<br/>
 *     Recordemos que los objetos que implementan AutoCloseable pueden instanciarse en un try-with-resources para que al
 *     finalizar la ejecución del try se cierren automáticamente.
 * </p>
 *
 * @author dgs
 */
public class Main {
    public static final String cadenaConexion = "jdbc:mysql://localhost:3306/instituto";
    public static final String usuario = "root";
    public static final String pwd = "";

    public static void main(String[] args) {
        try (Connection c = DriverManager.getConnection(cadenaConexion, usuario, pwd);) {
            System.out.println("Conexión realizada!");
        } catch (SQLException e) {
            System.out.println("Error en la conexión! " + e.getMessage());
        }

        System.out.println("Fin del programa!");
    }
}

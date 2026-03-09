package unidad08.ejemplos.clasePrintWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>
 * PrintWriter es otra subclase de la abstracta Writer que ofrece más versatilidad que FileWriter.
 * </p>
 * <p>
 * Cualquier objeto que intercambie datos entre la memoria principal (donde se ejecuta el programa) y el exterior
 * suele implementar la interfaz
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/AutoCloseable.html">AutoCloseable</a>.
 * <br/>
 * Cualquier AutoCloseable puede usar el try-with-resources, como vemos en este ejemplo:
 * </p>
 *
 * @author diego
 */
public class Ejemplo03 {

    public static void main(String args[]) {
        String nombreFichero = ".\\ficheros\\prueba.txt";
        String texto = "Hola, caracola! Este texto se ha insertado desde el programa usando PrintWriter.";

        /*
        try-with-resources se llama así porque el try se abre usando recursos del sistema (un fichero, una conexión al
        teclado, a Internet, etc.
        Se hace entre paréntesis que acompañan al try.
        Esto hace que no sea necesario cerrar esa conexión (.close()).
        */
        try (PrintWriter escribirEnFichero = new PrintWriter(new FileWriter(nombreFichero, true));) {


            escribirEnFichero.print("Este texto está ");
            escribirEnFichero.print("en la misma línea.");
            escribirEnFichero.println(texto);

            escribirEnFichero.print("Imprimo un booleano: ");
            escribirEnFichero.println(false);

            escribirEnFichero.print("Imprimo un float: ");
            escribirEnFichero.println(4.56f);

            escribirEnFichero.print("Imprimo un objeto: ");
            escribirEnFichero.println(new Persona());

            // No es necesario cerrar:
            // escribirEnFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! Fichero no encontrado. " + e.getMessage());
//            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error! " + e.getMessage());
        }

        System.out.println("Operación de escritura OK");
    }
}

package unidad08.ejemplos.clasePrintWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * PrintWrite es otra subclase de la abstracta Writer que ofrece más
 * versatilidad que FileWriter.
 *
 * @author diego
 */
public class Ejemplo01 {

    public static void main(String args[]) {
        String nombreFichero = ".\\ficheros\\prueba.txt";
        String texto = "Hola, caracola! Este texto se ha insertado desde el programa usando PrintWriter.";

        try {
            PrintWriter escribirEnFichero = new PrintWriter(nombreFichero); // este método machaca el fichero

            escribirEnFichero.print("Este texto está ");
            escribirEnFichero.print("en la misma línea.");
            escribirEnFichero.println(texto);

            escribirEnFichero.print("Imprimo un booleano: ");
            escribirEnFichero.println(false);
                    
            escribirEnFichero.print("Imprimo un float: ");
            escribirEnFichero.println(4.56f);
                    
            escribirEnFichero.print("Imprimo un objeto: ");
            escribirEnFichero.println(new Persona());
                    
            escribirEnFichero.close();
            
            System.out.println("Operación de escritura OK");
        } catch (FileNotFoundException e) {
            System.out.println("Error! Fichero no encontrado. " + e.getMessage());
//            e.printStackTrace();
        }
    }
}

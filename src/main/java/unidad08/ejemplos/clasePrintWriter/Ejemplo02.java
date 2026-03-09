package unidad08.ejemplos.clasePrintWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * PrintWriter es otra subclase de la abstracta Writer que ofrece más
 * versatilidad que FileWriter.
 * PrintWriter no permite indicar directamente en su constructor si va a machacar
 * el contenido del fichero o si va a añadirlo al final. Por eso hemos de usar  Podemos hacer que PrintWriter añada texto al final del fichero si lo indicamos
 * en su constructorya existente en el fichero
 *
 * @author diego
 */
public class Ejemplo02 {

    public static void main(String args[]) {
        String nombreFichero = ".\\ficheros\\prueba.txt";
        String texto = "Hola, caracola! Este texto se ha insertado desde el programa usando PrintWriter.";

        PrintWriter escribirEnFichero = null;   // así no se machaca, se añade.
        try {
            escribirEnFichero = new PrintWriter(new FileWriter(nombreFichero, true));

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
        }
        catch (FileNotFoundException e) {
            System.out.println("Error! Fichero no encontrado. " + e.getMessage());
//            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Error! " + e.getMessage());
        }

        System.out.println("Operación de escritura OK");
    }
}

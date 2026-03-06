package unidad01;

/**
 * En este código vemos cómo se declara una variable:
 * <ol>
 *     <li>Primero se indica el tipo de dato: String (texto), int (nº entero), double (nº con decimales), etc.</li>
 *     <li>Le sigue el nombre de la variable, que es un identificador en el código para dicho dato.</li>
 * </ol>
 *
 * @author dgs
 */
public class DeclararVariables {

    public static void main(String[] args) {

        /*
        Declaramos una variable de tipo String (contendrá texto)
        con el identificador o nombre: nombreClientePotencial
         */
        String nombreClientePotencial;

        /*
        Declaramos una variable de tipo int (número entero)
        con el identificador o nombre: numeroEntero
         */
        int numeroEntero;

        // Asignamos un texto a la variable de tipo String:
        nombreClientePotencial = "Anselmo";

        // Mostramos mensajes por pantalla:
        System.out.println("Hola, me llamo " + nombreClientePotencial);
        System.out.println("esto parece chungo que te cagas");
        System.out.println("pero de cagarse...");

        // Asignamos un número entero a la variable de tipo int:
        numeroEntero = 5;

        System.out.println("El número es " + numeroEntero);
    }
}

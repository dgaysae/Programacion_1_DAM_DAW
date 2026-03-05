package unidad01;

/**
 * Una variable declarada en un bloque de código (entre { y } de una función)
 * puede usarse en cualquier parte de dicho bloque, pero no fuera de él.
 *
 * @author dgs
 */
public class AmbitoVariables {
    /**
     * La variable nombre puede usarse en cualquier parte dentro
     * de las llaves de la clase AmbitoVariables.
     */
    public static String nombre = "Anselmo";

    public static void main(String[] args) {

        double longitudCirculo = longitudCircunferencia(5);
        saludar();
        saludar("Pepe");
        System.out.println("*********");
        System.out.println("Longitud del círculo: " + longitudCirculo);
        
        System.out.println("Fin del programa");
    }

    /**
     * Usamos la variable nombre dentro de esta función porque ha sido declarada dentro de la clase.
     * Por tanto, se puede usar en cualquier parte dentro del bloque de código de la clase, incluidas
     * las funciones que contiene
     */
    public static void saludar() {
        System.out.print("Hola, " + nombre);
        System.out.println("Te doy la bienvenida a este programa...");
    }

    /**
     * El parámetro nombrePersona es realmente una variable declarada en la cabecera de la función.
     * <br/>
     * Por tanto, su ámbito (donde podrá usarse) será solamente dentro de la función saludar.
     * @param nombrePersona
     */
    public static void saludar(String nombrePersona) {
        System.out.println("Hola, " + nombrePersona);
        System.out.println("Te doy la bienvenida a este programa...");
    }

    /**
     * Esta variable longitudCirculo tiene el mismo nombre que la de la función main.
     * La de la función main no se puede usar aquí, porque sólo tiene validez en el
     * bloque de código de main.
     * <br/>
     * Por eso podemos crear aquí otra variable con el mismo nombre y que sólo podremos
     * usar aquí dentro. Una vez finalice esta función y devuelva el resultado, dejará
     * de existir.
     * @param radio
     * @return
     */
    public static double longitudCircunferencia(double radio) {
        double longitudCirculo = 2 * Math.PI * radio;
        return longitudCirculo;
    }
}

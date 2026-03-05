package unidad01;

/**
 *
 * @author diego
 */
public class OperacionesAritmeticas {

    /**
     * Estas variables pueden usarse en toda la clase OperacionesAritmeticas.
     */
    public static int num1 = 5;
    public static int num2 = 7;
    public static double dividendo = 10.0;
    public static double divisor = 7.0;

    public static void main(String[] args) {
        int suma = sumar(4, 7);
        System.out.println("Suma de los valores pasados por argumento:");
        System.out.println(suma);

        System.out.println("Suma de los valores en el ámbito de la clase:");
        suma = sumar();
        System.out.println(suma);

        System.out.println("-------------------------------------------------");
        int resta = restar(4, 7);
        System.out.println("Resta de los valores pasados por argumento:");
        System.out.println(resta);

        System.out.println("Resta de los valores en el ámbito de la clase:");
        resta = restar();
        System.out.println(resta);

        System.out.println("-------------------------------------------------");
        int multiplicacion = multiplicar(4, 7);
        System.out.println("Multiplicación de los valores pasados por argumento:");
        System.out.println(multiplicacion);

        System.out.println("Multiplicación de los valores en el ámbito de la clase:");
        multiplicacion = multiplicar();
        System.out.println(multiplicacion);

        System.out.println("-------------------------------------------------");
        int divisionTruncada = dividir(10, 7);
        System.out.println("División de los valores pasados por argumento. El resultado pierde precisión ya que NO TIENE DECIMALES:");
        System.out.println(divisionTruncada);

        System.out.println("División de los valores en el ámbito de la clase. El resultado tiene precisión ya que TIENE DECIMALES:");
        double divisionConDedimales = dividir();
        System.out.println(divisionConDedimales);

    }

    /**
     * Cuidado cuando se dividen dos números enteros con el operador /.
     * El resultado es un entero, por lo que se pierde precisión (decimales).
     * @param dividendo
     * @param divisor
     * @return
     */
    private static int dividir(int dividendo, int divisor) {
        int division = dividendo / divisor;
        return division;
    }

    private static double dividir() {
        double division = dividendo / divisor;
        return division;
    }

    /**
     * Esta función permite introducir qué números queremos sumar.
     *
     * @param num1 Primer sumando
     * @param num2 Segundo sumando
     * @return Suma resultante
     */
    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    /**
     * Esta función no admite parámetros, pero puede sumar dos variables si
     * están en el ámbito adecuado...
     *
     * @return
     */
    public static int sumar() {
        int suma = num1 + num2;
        return suma;
    }


    public static int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public static int restar() {
        int suma = num1 - num2;
        return suma;
    }

    private static int multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    private static int multiplicar() {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }


}

package unidad01;

/**
 * Muchas de las operaciones matemáticas que conocemos ya están implementadas
 * en la API de Java, por lo que no tenemos que programar esos cálculos.
 * <br/>
 * Veamos algunos de esos ejemplos. Para ello usaremos el modificador final, que
 * convierte una variable en constante (su valor no se puede modificar).
 * @author dgs
 */
public class OperacionesComplejas {
    
    /*
    Usaremos los métodos de la clase Math.
    */
    public static void main(String[] args) {
        final int numeroNegativo = -19;
        final double numeroConDecimales = 4.4999999999999999999999;
        final double PI = 3.14159;

        System.out.println("La clase Math es tu amiga!!!");

        // En lugar de crear una constante propia para valores como el número PI...
        System.out.println("Mi constante PI = " + PI);

        // ... podemos usar la constante PI que hay dentro de la clase Math:
        System.out.println("Constante PI en Math = " + Math.PI);

        System.out.println("El número negativo " + numeroNegativo);
        System.out.println("Puede ponerse positivo hallando su valor absoluto con Math.abs: " + Math.abs(numeroNegativo));

        System.out.println();
        System.out.println("*************************************************************");
        System.out.println("************************* REDONDEOS *************************");
        System.out.println("*************************************************************");
        System.out.println("Para el número " + numeroConDecimales + " vamos a hacer varios tratamientos:");
        System.out.println("1. Math.round. Redondeo clásico.");
        System.out.println("   Redondea al entero más cercano. Si el decimal es .5, redondea hacia arriba (al entero superior):");
        System.out.println("   Número redondeado: " + Math.round(numeroConDecimales));

        System.out.println();
        System.out.println("2. Math.floor. Redondeo a la baja.");
        System.out.println("   Devuelve el entero más cercano que sea MENOR O IGUAL al número dado:");
        System.out.println("   Redondeado a la baja: " + Math.floor(numeroConDecimales));

        System.out.println();
        System.out.println("3. Math.ceil. Redondeo al alza. Redondea siempre hacia arriba.");
        System.out.println("   Devuelve el entero más cercano que sea MAYOR O IGUAL al número dado:");
        System.out.println("   Redondeado a la baja: " + Math.ceil(numeroConDecimales));

        System.out.println();
        System.out.println("4. Math.rint. Similar a Math.round pero con una peculiaridad.");
        System.out.println("   Si el número está exactamente en medio (2.5, 3.5, 4.5, etc.), redondea al Nº PAR MÁS CERCANO:");
        System.out.println("   Redondeado científico: " + Math.rint(numeroConDecimales));
        System.out.print("   Redondeado científico de 1.5: " + Math.rint(1.5));
        System.out.println(" (el cero no se considera un nº par)");
        System.out.println("   Redondeado científico de 2.5: " + Math.rint(2.5));
        System.out.println("   Redondeado científico de 3.5: " + Math.rint(3.5));
        System.out.println("   Redondeado científico de 4.5: " + Math.rint(4.5));

        System.out.println();
        System.out.println("*************************************************************");
        System.out.println("************************* POTENCIAS *************************");
        System.out.println("*************************************************************");
        System.out.println("2 elevado a 3 = " + Math.pow(2, 3));

        System.out.println();
        System.out.println("************************************************************");
        System.out.println("******************** Números aleatorios ********************");
        System.out.println("************************************************************");

        double aleatorio = Math.random();
        System.out.println("Nº aleatorio entre 0 (incluido) y 1 (excluido): " + aleatorio);

        int maximo = 10;
        int aleatorioEntero = (int)(aleatorio * maximo);
        System.out.print("Números aleatorios entre 0 (incluido) y " + maximo + " (excluido, es decir, " + (maximo - 1) + "): ");
        System.out.println(aleatorioEntero);

        aleatorioEntero = (int)(aleatorio * (maximo + 1));
        System.out.print("Números aleatorios entre 0 y " + maximo + ": ");
        System.out.println(aleatorioEntero);

        maximo = 12;
        aleatorioEntero = (int)(aleatorio * maximo);
        System.out.print("Números aleatorios entre 0 (incluido) y " + maximo + " (excluido): ");
        System.out.println(aleatorioEntero);

        maximo = 21;
        aleatorioEntero = (int)(aleatorio * maximo);
        System.out.print("Números aleatorios entre 0 (incluido) y " + maximo + "  (excluido): ");
        System.out.println(aleatorioEntero);
        
        int limiteInferior = 3;
        int limiteSuperior = 21;
        System.out.print("Números aleatorios entre "
                + limiteInferior + " y "
                + limiteSuperior + ": ");
        aleatorioEntero = (int)(aleatorio * (limiteSuperior + 1 - limiteInferior)) + limiteInferior;
        System.out.println(aleatorioEntero);
    }
    
}

package unidad05.enumerados.ejemplo04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Completar el ejercicio mostrando un menú por pantalla para calcular áreas de esas figuras geométricas.
 * Leer la opción de teclado y, posteriormente, leer también de teclado los datos necesarios para el cálculo.
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        int base = 4;
        int altura = 6;

        System.out.println("Calcular superficies de figuras geométricas:");

        /*
        El siguiente cálculo no tiene sentido. Nuestro enum no puede permitir que se ejecute el método
        calcularSuperficieRectangulo desde una CIRCUNFERENCIA.
        ¡Recordemos que los métodos de un enum los puede ejecutar cualquiera de las constantes contenidas
        en él!
        */
        System.out.println(
                FiguraGeometrica.CIRCUNFERENCIA.calcularSuperficieRectangulo(base, altura)
        );

        /*
        Al igual que en la herencia, podemos hacerlo mediante un método abstracto que se implementa
        para cada constante.
        Al establecer un método abstracto, sólo hay que definirlo para cada constante, según el caso.
        Así, el método calcularArea realizará los cálculos correspondientes a cada figura geométrica.
        */
        System.out.println(FiguraGeometrica.CIRCUNFERENCIA.calcularArea(base));
        System.out.println(FiguraGeometrica.CUADRADO.calcularArea(base));
        System.out.println(FiguraGeometrica.RECTANGULO.calcularArea(base, altura));
        System.out.println(FiguraGeometrica.TRIANGULO.calcularArea(base, altura));
    }


    public static int leerEnteroDeTeclado() {
        Scanner entradaTeclado = new Scanner(System.in);

        int numero = 0;
        boolean esNumero = false;

        do {
            try {
                System.out.println("Intro número: ");
                numero = entradaTeclado.nextInt();
                esNumero = true;
            } catch (InputMismatchException e) {
                System.out.println("Dato no válido");
                esNumero = false;
            }
            entradaTeclado.nextLine();

        } while (!esNumero);

        entradaTeclado.close();

        return numero;
    }
}

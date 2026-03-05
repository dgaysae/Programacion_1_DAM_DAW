package unidad01;

import java.util.Scanner;

/**
 * Cómo calcular un valor aleatorio usando las funcionalidades que ofrece la clase Math.
 * <br/>
 * <ol>
 *     <li></li>
 * </ol>
 */
public class Aleatorio {

    public static void main(String[] args) {
        int max = 27;
        int min = 13;
        int aleatorio1; // 0 a max
        int aleatorio2;
        int aleatorio3;

        // Calcular nº aleatorio desde el 0 (incluido) hasta max (EXCLUIDO):
        aleatorio1 = (int) (Math.random() * max);
        System.out.println("Del 0 al " + (max - 1) + "= " + aleatorio1);

        // Calcular nº aleatorio desde el 0 (incluido) hasta max (INCLUIDO):
        aleatorio2 = (int) (Math.random() * (max + 1));
        System.out.println("Del 0 al " + max + "= " + aleatorio2);

        // Calcular nº aleatorio desde un mínimo min (incluido) hasta max (INCLUIDO):
        aleatorio3 = (int) (Math.random() * (max + 1));
        System.out.println("Del " + min + " al " + max + "= " + aleatorio3);
    }
}

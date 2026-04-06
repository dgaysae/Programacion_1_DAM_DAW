package RECUPERACION.cartonBingo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
//        CartonBingo c = new CartonBingo();
//
//        c.printCarton();

        // ***************************************************************
        Scanner leerDeTeclado = new Scanner(System.in);
        int numeroSecreto = (new Random()).nextInt(1, 101);
        int intentos = 0;
        int numeroTentativa = 0;
        do {
            System.out.println("Introduzca un número: ");
            numeroTentativa = leerDeTeclado.nextInt();

            if (numeroTentativa < numeroSecreto) {
                System.out.println("Debe ser mayor.");
            }
            else if (numeroTentativa > numeroSecreto) {
                System.out.println("Debe ser menor.");
            }
            intentos++;
        } while (numeroTentativa != numeroSecreto);

        System.out.println("Enhorabuena! Has acertado en " + intentos + " intentos.");
        leerDeTeclado.close();
    }
}

package unidad07.prog_funcional.ejemplo02;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Introducción a la programación funcional.</h1>
 * <p>
 *     Como hemos dicho muchas veces en clase, si el código de una clase no se va a utilizar en más de un sitio, es
 *     conveniente hacer una clase anónima.<br/>
 *     Ya lo vimos en Swing, cuando implementamos el comportamiento de un botón u otro control visual mediante estas
 *     clases anónimas.
 * </p>
 * <p>
 *     Las clases anónimas se usan cuando vamos a implementar un código que no se va a utilizar más que en ese bloque
 *     de código, por lo que no es necesario (ni conveniente) hacer una clase sólo para ese fragmento de código.
 * </p>
 * <p>
 *     En estos ejemplos vamos a rehacer lo que se ha implementado en el ejemplo anterior usando <strong>clases
 *     anónimas</strong>.
 * </p>
 * <p>
 *     <strong>Importante:</strong> una buena parte de los ejemplos se han tomado o inspirado del canal de
 *     <strong><a href="https://youtu.be/wenIr54-UEc?si=m8YAbXvod8W5g8dM">Pedro Joya</a></strong>.
 * </p>
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = getLista();
        System.out.println(numeros);

        List<Integer> pares = filterParesFrom(numeros);
        System.out.println(pares);

        List<Integer> dobles = doblar(numeros);
        System.out.println(dobles);

        List<Integer> cuadrados = calcularCuadradosDe(numeros);
        System.out.println(cuadrados);

        int suma = calcularSumaDe(numeros);
        System.out.println("Suma: " + suma);
    }

    private static int calcularSumaDe(List<Integer> numeros) {
        int suma = 0;
        for(Integer numero : numeros)
            suma += numero;
        return suma;
    }

    private static List<Integer> calcularCuadradosDe(List<Integer> numeros) {
        List<Integer> cuadrados = new ArrayList<>();
        for(Integer numero : numeros) {
            cuadrados.add(numero * numero);
        }
        return cuadrados;
    }

    private static List<Integer> doblar(List<Integer> numeros) {
        List<Integer> dobles = new ArrayList<>();
        for(Integer numero : numeros) {
            dobles.add(numero * 2);
        }
        return dobles;
    }

    private static List<Integer> getLista() {
        return List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
    }

    private static List<Integer> filterParesFrom(List<Integer> numeros) {
        List<Integer> pares = new ArrayList<>();
        for(Integer numero : numeros) {
            if (numero % 2 == 0) pares.add(numero);
        }
        return pares;
    }
}

package unidad07.prog_funcional.ejemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Introducción a la programación funcional.</h1>
 * <p>
 *     Hasta ahora hemos usado el paradigma de programación imperativa.
 *     Esto es, con cada expresión y línea de código le decimos al programa lo que tiene que hacer.<br/>
 *     Por ejemplo, el método filterParesFrom devolverá una lista con los números enteros pares del argumento que
 *     recibe. Esto es normal y, hasta aquí, no hay nada nuevo bajo el sol.
 * </p>
 * <p>
 *     Como ejemplo tenemos los métodos de esta clase que hemos usado hasta ahora para recorrer y tratar
 *     colecciones de elementos.
 * </p>
 * <p>
 *     En la siguiente clase {@link Main02} veremos cómo implementar estas mismas funcionalidades de otra forma...
 * </p>
 * <p>
 *     <strong>Importante:</strong> una buena parte de los ejemplos se han tomado o inspirado del canal de
 *     <a href="https://youtube.com/playlist?list=PLK6RrRW5qdCMccvDnZb6-0d6uAIwbTQ1A&si=Yi_wXfzqJrU5zS3O">Pedro Joya</a>.
 * </p>
 * @author diego
 */
public class Main01 {
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

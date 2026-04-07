package unidad07.prog_funcional.ejemplo04;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Method Cadena - encadenando un método tras otro</h1>
 * <p>
 *     Retomando los ejemplos anteriores, si queremos hacer un flujo de ejecución completo donde:
 *     <ol>
 *         <li>Genere una lista de números.</li>
 *         <li>Calcule el cuadrado de todos ellos.</li>
 *         <li>Filtro para quedarme sólo con los pares de esos cuadrados.</li>
 *         <li>Haga un reduce para obtener la suma de los números del punto anterior.</li>
 *     </ol>
 *     ...tendriamos que hacer algo así: reduce(filtrar(calcular(getValues(...))));
 * </p>
 * <p>
 *     Este anidamiento de unos métodos en otros puede resultar confuso en su lectura y mantenimiento.
 *     Lo más intuitivo sería algo así:<br/>
 *     getValues(...).calcular(...).filtrar(...).reduce(...);<br/>
 * </p>
 * <p>
 *     Esto nos permite leer el código de forma natural, como si de un libro se tratase.<br/>
 *     A esto se le conoce como <strong>method chaining</strong> o <strong>encadenamiento de métodos</strong> y al
 *     aplicarlo para conseguir leer casi como lenguaje natural se conoce como <strong>fluent interface</strong> (interfaz fluida).
 * </p>
 * <p>
 *     Vamos a hacer eso, aglutinando todas las funcionalidades anteriores en una sola clase.
 * </p>
 * <p>
 *     <strong>Importante:</strong> una buena parte de los ejemplos se han tomado o inspirado del canal de
 *     <strong><a href="https://youtu.be/dK8erMU9t_g?si=a5o_fSwc9EIBU1t7">Pedro Joya</a></strong>.
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

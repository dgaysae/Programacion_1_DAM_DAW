package unidad07.prog_funcional.ejemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     Los métodos de {@link Main01} hacen cada uno una tarea específica.<br/>
 *     Para conseguir un código más genérico en cada uno de esos métodos podemos hacer uso de las interfaces. Así, en
 *     lugar de que cada método haga una tarea específica, podemos implementarlo de forma más genérica para que siga
 *     haciendo esa tarea, pero bajo los criterios que nosotros le indiquemos.
 * </p>
 * <p>
 *     Por ejemplo, el método filterParesFrom de {@link Main01} devuelve lo pares de la lista introducida. No hace nada
 *     más. Si queremos filtrar los impares, los múltiplos de 3, de 5, etc. tendríamos que crear un método para cada
 *     uno de esos filtros.
 * </p>
 * <p>
 *     Pero podemos crear un único método de filtrado único al que, además de la lista de números a tratar, le pasamos
 *     como argumento el filtro que queremos que aplique. Así, tenemos un sólo método para filtrar listas de números,
 *     pero dicho método filtrará en base a lo que le indiquemos.<br/>
 *     Para ello vamos a crear la interfaz {@link NumberFilter} e implementarla en {@link NumeroPar}, {@link NumeroImpar}
 *     y algunos múltiplos, de forma que cada una implemente su correspondiente filtro.
 * </p>
 */
public class Main02 {
    public static void main(String[] args) {
        List<Integer> numeros = getLista();
        System.out.println(numeros);

        List<Integer> numerosPares = filtrar(numeros, new NumeroPar());
        List<Integer> numerosImpares = filtrar(numeros, new NumeroImpar());
        List<Integer> multiplosDe3 = filtrar(numeros, new NumeroMultiploDe3());
        List<Integer> multiplosDe5 = filtrar(numeros, new NumeroMultiploDe5());
        List<Integer> multiplosDe7 = filtrar(numeros, new NumeroMultiploDe7());

        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números impares: " + numerosImpares);
        System.out.println("Números múltiplos de 3: " + multiplosDe3);
        System.out.println("Números múltiplos de 5: " + multiplosDe5);
        System.out.println("Números múltiplos de 7: " + multiplosDe7);
    }

    private static List<Integer> getLista() {
        return List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
    }

    public static List<Integer> filtrar(List<Integer> numeros, NumberFilter filtro) {
        List<Integer> numerosFiltrados = new ArrayList<>();
        for(Integer numero : numeros) {
            if (filtro.validar(numero)) {
                numerosFiltrados.add(numero);
            }
        }
        return numerosFiltrados;
    }
}

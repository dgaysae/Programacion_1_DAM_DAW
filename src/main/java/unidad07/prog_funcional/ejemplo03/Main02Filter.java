package unidad07.prog_funcional.ejemplo03;

import unidad07.prog_funcional.ejemplo03.filter.NumberFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     Los métodos de {@link Main} hacen cada uno una tarea específica.<br/>
 *     Para conseguir un código más genérico en cada uno de esos métodos podemos hacer uso de las interfaces. Así, en
 *     lugar de que cada método haga una tarea específica, podemos implementarlo de forma más genérica para que siga
 *     haciendo esa tarea, pero bajo los criterios que nosotros le indiquemos.
 * </p>
 * <p>
 *     Al hacer un único método de filtrado, <strong>evitamos la repetición de código</strong> y <strong>el método
 *     permite elegir la funcionalidad</strong> (en este caso, el criterio de filtrado) a llevar a cabo.
 * </p>
 * <p>
 *     <strong>Importante:</strong> una buena parte de los ejemplos se han tomado o inspirado del canal de
 *     <strong><a href="https://youtu.be/wArA9GkkOnc?si=rAFxlJSXSzquUJ7D">Pedro Joya</a></strong>.
 * </p>
 * @author diego
 */
public class Main02Filter {
    public static void main(String[] args) {
        List<Integer> numeros = getLista();
        System.out.println(numeros);

        // Si el objeto se usa en varios lugares, podemos usar una variable:
        NumberFilter<Integer> filtroPares = new NumberFilter<>() {
            @Override
            public boolean validar(Integer numero) {
                return numero % 2 == 0;
            }
        };

        List<Integer> numerosPares = filtrar(numeros, filtroPares);

        List<Integer> numerosImpares = filtrar(numeros, new NumberFilter<Integer>() {
            @Override
            public boolean validar(Integer numero) {
                return numero % 2 != 0;
            }
        });
        List<Integer> multiplosDe3 = filtrar(numeros, new NumberFilter<Integer>() {
            @Override
            public boolean validar(Integer numero) {
                return numero % 3 == 0;
            }
        });
        List<Integer> multiplosDe5 = filtrar(numeros, new NumberFilter<Integer>() {
            @Override
            public boolean validar(Integer numero) {
                return numero % 5 == 0;
            }
        });
        List<Integer> multiplosDe7 = filtrar(numeros, new NumberFilter<Integer>() {
            @Override
            public boolean validar(Integer numero) {
                return numero % 7 == 0;
            }
        });

        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números impares: " + numerosImpares);
        System.out.println("Números múltiplos de 3: " + multiplosDe3);
        System.out.println("Números múltiplos de 5: " + multiplosDe5);
        System.out.println("Números múltiplos de 7: " + multiplosDe7);
    }

    private static List<Integer> getLista() {
        return List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
    }

    /**
     * <p>
     *     Esta función recorre la lista de números que recibe como argumento y devuelve otra lista en la que se ha
     *     filtrado la anterior según el criterio indicado en el filtro (también pasado como argumento).
     * </p>
     * <p>
     *     De esta forma tomamos el <strong>comportamiento general de todas las funciones</strong> anteriores de
     *     filtrado (recorrer la lista del argumento y pasar datos a otra lista), evitando así repetir código, y aplicando
     *     en cada caso el comportamiento que hemos introducido desde el exterior a través de <strong>filtro</strong> para
     *     decidir qué elementos se filtran y cuáles no.
     * </p>
     * @param numeros Lista de números a filtrar.
     * @param filtro Criterio de filtrado. Objeto de tipo {@link unidad07.prog_funcional.ejemplo02.filter.NumberFilter}
     * @return Lista filtrada.
     */
    public static <T> List<T> filtrar(List<T> numeros, NumberFilter<T> filtro) {
        List<T> numerosFiltrados = new ArrayList<>();
        for(T numero : numeros) {
            if (filtro.validar(numero)) {
                numerosFiltrados.add(numero);
            }
        }
        return numerosFiltrados;
    }
}

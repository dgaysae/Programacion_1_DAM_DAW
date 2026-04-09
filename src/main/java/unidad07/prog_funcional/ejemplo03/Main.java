package unidad07.prog_funcional.ejemplo03;

import unidad07.prog_funcional.ejemplo02.filter.NumberFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     En estos ejemplos rehacemos las implementaciones de los ejemplos anteriores usando expresiones lambda.<br>
 *     Como se puede comprobar, una expresión lambda "vale más que mil palabras".
 * </p>
 *
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = getLista();
        System.out.println("Naturales: " + numeros);

        List<Integer> numerosPares = filtrar(numeros, x -> x % 2 == 0);
        List<Integer> numerosImpares = filtrar(numeros, x -> x % 2 != 0);

        System.out.println("Pares: " + numerosPares);
        System.out.println("Implares: " + numerosImpares);

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

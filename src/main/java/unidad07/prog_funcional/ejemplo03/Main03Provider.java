package unidad07.prog_funcional.ejemplo03;

import unidad07.prog_funcional.ejemplo03.provider.ElementProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>
 *     Veamos cómo definir las operaciones de obtención de datos de los ejemplos anteriores usando genéricos.<br/>
 * </p>
 * <p>
 * <strong>Importante:</strong> una buena parte de los ejemplos se han tomado o inspirado del canal de
 * <strong><a href="https://youtu.be/dK8erMU9t_g?si=m6oIYPxO11apUV0l">Pedro Joya</a></strong>.
 * </p>
 *
 * @author diego
 */
public class Main03Provider {
    public static void main(String[] args) {
        List<Integer> naturales = getLista(20, new ElementProvider<>() {
            private static Integer next = 0;

            @Override
            public Integer get() {
                return ++next;
            }
        });

        List<Integer> multiplosDe3 = getLista(20, new ElementProvider<>() {
            private static Integer next = 3;

            @Override
            public Integer get() {
                return (next += 3) - 3;
            }
        });

        List<Integer> aleatoriosMenoresDe100 = getLista(20, new ElementProvider<>() {
            @Override
            public Integer get() {
                return (new Random()).nextInt(101);
            }
        });
//        List<Integer> aleatoriosEntre50y100 = getLista(20, new AleatorioEntre50y100());
//        List<Integer> inicializarACero = getLista(20, new InitializeTo(0));

        System.out.println("Números naturales: " + naturales);
        System.out.println("Múltiplos de 3: " + multiplosDe3);
        System.out.println("Aleatorios menores a 100: " + aleatoriosMenoresDe100);
//        System.out.println("Aleatorios entre 50 y 100: " + aleatoriosEntre50y100);
//        System.out.println("Ceros: " + inicializarACero);
    }

    public static <T> List<T> getLista(int size, ElementProvider<T> intProvider) {
        List<T> numerosGenerados = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numerosGenerados.add(intProvider.get());
        }
        return numerosGenerados;
    }
}

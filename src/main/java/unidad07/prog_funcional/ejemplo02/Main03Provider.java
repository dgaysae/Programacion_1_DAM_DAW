package unidad07.prog_funcional.ejemplo02;

import unidad07.prog_funcional.ejemplo02.provider.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>
 *     Pero no tenemos que parar en el filtrado. ¡También podemos "personalizar" otras tareas para un método!
 * </p>
 * <p>
 *     En este caso atacaremos el tema de <strong>crear</strong> esa lista de números. En {@link Main} hicimos un
 *     método <strong>getLista</strong> que hardcodeaba esa lista. Ahora podemos indicar qué tipo de números queremos
 *     en ella de la misma forma que hemos hecho en el caso del filtrado.
 * </p>
 * <p>
 *     <strong>Importante:</strong> una buena parte de los ejemplos se han tomado o inspirado del canal de
 *     <strong><a href="https://youtu.be/syvhj0PWv_0?si=5LIvvlEs8AewoC8l">Pedro Joya</a></strong>.
 * </p>
 * @author diego
 */
public class Main03Provider {
    public static void main(String[] args) {
        List<Integer> naturales = provide(20, new ElementProvider() {
            private static int next = 0;
            @Override
            public Integer get() {
                return ++next;
            }
        });
        List<Integer> multiplosDe3 = provide(20, new ElementProvider() {
            private static int next = 3;
            @Override
            public Integer get() {
                return (next += 3) - 3;
            }
        });
        List<Integer> aleatoriosMenoresDe100 = provide(20, new ElementProvider() {
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

    public static List<Integer> provide(int size, ElementProvider intProvider) {
        List<Integer> numerosGenerados = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            numerosGenerados.add(intProvider.get());
        }
        return numerosGenerados;
    }
}

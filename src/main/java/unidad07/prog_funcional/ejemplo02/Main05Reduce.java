package unidad07.prog_funcional.ejemplo02;

import unidad07.prog_funcional.ejemplo02.provider.IntegerProvider;
import unidad07.prog_funcional.ejemplo02.reduce.*;

import java.util.List;

/**
 * <p>
 *
 * </p>
 * <p>
 *     <strong>Importante:</strong> una buena parte de los ejemplos se han tomado o inspirado del canal de
 *     <strong><a href="https://youtu.be/yXWV2rIDkuM?si=DNVWAzNJSCtRG8vL">Pedro Joya</a></strong>.
 * </p>
 * @author diego
 */public class Main05Reduce {
    public static void main(String[] args) {
        List<Integer> naturales = Main03Provider.getLista(20, new IntegerProvider() {
            private static int next = 0;
            @Override
            public Integer get() {
                return ++next;
            }
        });

        System.out.println("Naturales: \n" + naturales);
//        System.out.println("Suma: \n" + reduce(naturales, 0, new Sumador()));
//        System.out.println("Multiplicación: \n" + reduce(naturales, 1, new Multiplicador()));
//        System.out.println("Suma sólo de pares: \n" + reduce(naturales, 0, new SumadorDePares()));
//        System.out.println("Suma sólo de impares: \n" + reduce(naturales, 0, new SumadorDeImpares()));
    }

    public static Integer reduce(
            List<Integer> numeros,
            Integer init,
            Reductor reductor) {
        int reduccion = init;
        for (Integer numero : numeros) {
            reduccion = reductor.reduce(reduccion, numero);
        }
        return reduccion;
    }
}

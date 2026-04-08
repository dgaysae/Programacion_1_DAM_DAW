package unidad07.prog_funcional.ejemplo01;

import unidad07.prog_funcional.ejemplo01.provider.Natural;
import unidad07.prog_funcional.ejemplo01.reduce.*;

import java.util.List;

/**
 * <p>
 *     Las operaciones de tipo <strong>reduce</strong> sirven literalmente para reducir un conjunto de datos a uno sólo.<br/>
 *     Tal es el caso del método calcularSumaDe de {@link Main01}.
 * </p>
 * <p>
 *     Suma, producto, máximo, mínimo, validación (si todos los elementos cumplen una condición) son operaciones típicas
 *     de reduce. Pero hay otras operaciones que pueden devolver otros elementos en lugar de un número:
 *     <ul>
 *         <li>Hacer agrupaciones, como la frecuencia de aparición de cada elemento (se guardaría en un Map).</li>
 *         <li>"Aplanar" una estructura de varias dimensiones (matriz, lista de listas, etc.) a una lista lineal.</li>
 *         <li>Etc.</li>
 *     </ul>
 * </p>
 * <p>
 *     En este caso vamos a analizar los acumuladores como la suma. Si queremos hacer un método genérico que haga sumas,
 *     multiplicaciones, suma de pares, etc. debemos indicar:
 *     <ul>
 *         <li>La lista de elementos sobre los que actuar.</li>
 *         <li>El valor inicial del que partir.</li>
 *         <li>El elemento de interfaz que contenga la lógica correspondiente.</li>
 *     </ul>
 * </p>
 * <p>
 *     <strong>Importante:</strong> una buena parte de los ejemplos se han tomado o inspirado del canal de
 *     <strong><a href="https://youtu.be/yXWV2rIDkuM?si=DNVWAzNJSCtRG8vL">Pedro Joya</a></strong>.
 * </p>
 * @author diego
 */public class Main05Reduce {
    public static void main(String[] args) {
        List<Integer> naturales = Main03Provider.provide(10, new Natural());

        System.out.println("Naturales: \n" + naturales);
        System.out.println("Suma: \n" + reduce(naturales, 0, new Sumador()));
        System.out.println("Multiplicación: \n" + reduce(naturales, 1, new Multiplicador()));
        System.out.println("Suma sólo de pares: \n" + reduce(naturales, 0, new SumadorDePares()));
        System.out.println("Suma sólo de impares: \n" + reduce(naturales, 0, new SumadorDeImpares()));
    }

    public static Integer reduce(
            List<Integer> numeros,
            Integer identity,
            Reductor reductor) {
        int reduccion = identity;
        for (Integer numero : numeros) {
            reduccion = reductor.reduce(reduccion, numero);
        }
        return reduccion;
    }
}

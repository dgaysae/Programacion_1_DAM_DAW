package unidad07.prog_funcional.ejemplo01;

import unidad07.prog_funcional.ejemplo01.mapping.*;
import unidad07.prog_funcional.ejemplo01.provider.InitializeTo;
import unidad07.prog_funcional.ejemplo01.provider.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     Ya hemos visto cómo hacer un sólo método para una tarea (filtrar y generar). Ahora toca transformar datos.
 * </p>
 * <p>
 *     Se va a crear un método genérico al que se le pasarán una lista de números y un criterio para transformar
 *     todos los números de esa lista.
 * </p>
 * <p>
 *     <strong>Importante:</strong> una buena parte de los ejemplos se han tomado o inspirado del canal de
 *     <strong><a href="https://youtu.be/syvhj0PWv_0?si=5LIvvlEs8AewoC8l">Pedro Joya</a></strong>.
 * </p>
 * @author diego
 */public class Main04Mapping {
    public static void main(String[] args) {
        List<Integer> naturales = Main03Provider.getLista(20, new Natural());
        List<Integer> naturales2 = Main03Provider.getLista(20, new Natural());
        List<Integer> dobles = calcular(naturales, new Doble());
        List<Integer> cuadrados = calcular(naturales, new Cuadrado());
        List<Integer> cubos = calcular(naturales, new Cubo());

        List<Integer> cuadrados2 = calcular(naturales, new Potencia(2));
        List<Integer> cubos2 = calcular(naturales, new Potencia(3));

//        List<Integer> multiplosDe3 = calcular(20, new MultiplosDe3());
//        List<Integer> aleatoriosMenoresDe100 = calcular(20, new AleatorioHasta100());
//        List<Integer> aleatoriosEntre50y100 = calcular(20, new AleatorioEntre50y100());
//
        System.out.println("Números naturales: \n" + naturales);
        System.out.println("Dobles: \n" + dobles);
        System.out.println("Cuadrados: \n" + cuadrados);
        System.out.println("Cuadrados (con Potencia): \n" + cuadrados2);
        System.out.println("Cubos: \n" + cubos);
        System.out.println("Cubos (con Potencia): \n" + cubos2);
        System.out.println("-----------------------------------");
        System.out.println("Números naturales: \n" + naturales2);
        transformar(naturales2, new Triple());
        System.out.println("Números naturales transformados (triple): \n" + naturales2);

//        System.out.println("Aleatorios menores a 100: " + aleatoriosMenoresDe100);
//        System.out.println("Aleatorios entre 50 y 100: " + aleatoriosEntre50y100);
    }

    public static List<Integer> calcular(List<Integer> numeros, Calculo calculo) {
        List<Integer> numerosTransformados = new ArrayList<>();
        for(Integer numero: numeros) {
            numerosTransformados.add(calculo.calcular(numero));
        }
        return numerosTransformados;
    }

    /**
     * En general, la transformación suele hacerse en programación funcional a través de métodos como
     * .map, que actúa directamente sobre la lista objeto.
     * @param numeros
     * @param calculo
     */
    public static void transformar(List<Integer> numeros, Calculo calculo) {
        for (int i = 0; i < numeros.size(); i++) {
            numeros.set(i, calculo.calcular(numeros.get(i)));
        }
    }
}

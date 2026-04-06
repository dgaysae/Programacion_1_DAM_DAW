package unidad07.prog_funcional.ejemplo03;

import unidad07.prog_funcional.ejemplo03.mapping.Calculo;
import unidad07.prog_funcional.ejemplo03.mapping.CalculoUnario;
import unidad07.prog_funcional.ejemplo03.provider.ElementProvider;

import java.util.ArrayList;
import java.util.List;

import static unidad07.prog_funcional.ejemplo03.Main03Provider.getLista;

/**
 * <p>
 *     Veamos cómo definir las operaciones de transformación de los ejemplos anteriores usando genéricos.<br/>
 *     De esta forma podemos ampliar el rango de operaciones a otros tipos de datos que hasta ahora no habíamos
 *     contemplado (como es el caso de cuadrados2).
 * </p>
 * <p>
 *     <strong>Importante:</strong> una buena parte de los ejemplos se han tomado o inspirado del canal de
 *     <strong><a href="hthttps://youtu.be/dK8erMU9t_g?si=m6oIYPxO11apUV0l">Pedro Joya</a></strong>.
 * </p>
 * @author diego
 */public class Main04Mapping {
    public static void main(String[] args) {
        List<Integer> naturales = getLista(20, new ElementProvider<>() {
            private static Integer next = 0;

            @Override
            public Integer get() {
                return ++next;
            }
        });
        System.out.println("Números naturales: \n" + naturales);

        List<Integer> cuadrados = calcular(naturales, new CalculoUnario<Integer>() {
            @Override
            public Integer calcular(Integer numero) {
                return numero * numero;
            }
        });
        System.out.println("Cuadrados: \n" + cuadrados);

        List<Integer> cuadrados2 = calcular(naturales, new Calculo<Integer, Integer>() {
            @Override
            public Integer calcular(Integer numero) {
                return numero * numero;
            }
        });
        System.out.println("Cuadrados: \n" + cuadrados2);


        List<String> cuadradosAString = calcular(naturales, new Calculo<Integer, String>() {
            @Override
            public String calcular(Integer numero) {
                return "Cuadrado de " + numero + " = " + (numero * numero);
            }
        });
        System.out.println(cuadradosAString);

//        TODO Obtener e imprimir lista de dobles.
//        TODO Obtener e imprimir lista de triples.
//        TODO Obtener e imprimir lista de cubos.
//        TODO Obtener e imprimir lista de potencias de 2.
//        TODO Obtener e imprimir lista de potencias de 3.

//        System.out.println("Números naturales transformados (triple): \n" + naturales2);
    }

    public static <T, R> List<R> calcular(List<T> numeros, Calculo<T, R> calculo) {
        List<R> numerosTransformados = new ArrayList<>();
        for(T numero: numeros) {
            numerosTransformados.add(calculo.calcular(numero));
        }
        return numerosTransformados;
    }

    /**
     * En general, la transformación suele hacerse en programación funcional a través de métodos como
     * .map, que actúa directamente sobre la lista objeto. Por tanto, este método sería más propio de un .map
     * que el método calcular.
     * @param numeros
     * @param calculo
     */
    public static <T> void transformar(List<T> numeros, CalculoUnario<T> calculo) {
        for (int i = 0; i < numeros.size(); i++) {
            numeros.set(i, calculo.calcular(numeros.get(i)));
        }
    }
}

package unidad05.apdo7_1;

import java.util.ArrayList;
import unidad05.ejercicios.ejercicioAnterior.Neumatico;

/**
 * <p>
 *     Las colecciones y listas de elementos, si no se especifica el tipo, pueden contener
 *     elementos de distintos tipos (como se muestra en este ejemplo).
 * </p>
 * <p>
 *     Esto no es recomendable cuando se implementa un programa. Lo recomendable es usar
 *     estas estructuras de forma homogénea, es decir, que todos los elementos que
 *     almacenan sean del mismo tipo.
 * </p>
 *
 */
public class Main00 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(9);
        System.out.println("Lista de elementos de distintos tipos: " + lista);

        lista.add("Anselmo");
        System.out.println("Lista de elementos de distintos tipos: " + lista);

        lista.add(new Neumatico(
                20,
                20,
                10000)
        );

        System.out.println("Lista de elementos de distintos tipos: " + lista);
    }
}

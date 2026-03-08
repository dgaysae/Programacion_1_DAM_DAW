package unidad05.apdo7_5.ordenar.ejemplo01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Vamos a establecer un criterio inicial de ordenación POR EDAD en la misma clase Persona.
 * Esta ordenación se puede realizar porque Persona implementa Comparable.
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Anselmo", 25, "11111111A"));
        listaPersonas.add(new Persona("Benancio", 12, "22222222B"));
        listaPersonas.add(new Persona("Carlos", 86, "33333333C"));
        listaPersonas.add(new Persona("Dionisio", 42, "44444444D"));

        // Lista desordenada de personas
        System.out.println("Lista DESORDENADA de personas --------------------------");
        for(Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        System.out.println("Lista ORDENADA de personas --------------------------");
        Collections.sort(listaPersonas);
        // Lista ordenada de personas
        for(Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}

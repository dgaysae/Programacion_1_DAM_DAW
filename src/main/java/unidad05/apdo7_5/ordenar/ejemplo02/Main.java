package unidad05.apdo7_5.ordenar.ejemplo02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Si queremos tener distintos criterios para comparar nuestros objetos, podemos establecer clases que sirvan como
 * comparadores.
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Dionisio", 42, "44444444D"));
        listaPersonas.add(new Persona("Benancio", 12, "22222222B"));
        listaPersonas.add(new Persona("Anselmo", 25, "11111111A"));
        listaPersonas.add(new Persona("Carlos", 86, "33333333C"));

        // Lista desordenada de personas
        System.out.println("Lista de personas DESORDENADA --------------------------");
        for(Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        System.out.println("Lista de personas ORDENADA POR NOMBRE --------------------------");
        Collections.sort(listaPersonas, new CompararPorNombre());
        // Lista ordenada de personas
        for(Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        System.out.println("Lista de personas ORDENADA POR EDAD --------------------------");
        Collections.sort(listaPersonas, new CompararPorEdad());
        // Lista ordenada de personas
        for(Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        System.out.println("Lista de personas ORDENADA POR DNI --------------------------");
        Collections.sort(listaPersonas, new CompararPorDNI());
        // Lista ordenada de personas
        for(Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}

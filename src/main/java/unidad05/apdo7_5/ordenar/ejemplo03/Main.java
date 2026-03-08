package unidad05.apdo7_5.ordenar.ejemplo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Podemos usar CLASES ANÓNIMAS cuando no se vayan a reutilizar en distintas partes de nuestro código. Es decir, cuando
 * se vayan a utilizar sólamente en un fragmento de nuestro código.
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

        // Podemos instanciar una CLASE ANÓNIMA que implemente la interfaz Comparator:
        Comparator<Persona> compararPorNombre = new Comparator<>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Lista de personas ORDENADA POR NOMBRE --------------------------");
        // Y aplicarla en el método de ordenación...
        Collections.sort(listaPersonas, compararPorNombre);
        // Lista ordenada de personas
        for(Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        // O instanciar la clase anónima directamente en el método:
        System.out.println("Lista de personas ORDENADA POR EDAD --------------------------");
        Collections.sort(listaPersonas, new Comparator<>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getEdad() - o2.getEdad();
            }
        });
        // Lista ordenada de personas
        for(Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        System.out.println("Lista de personas ORDENADA POR DNI --------------------------");
        Collections.sort(listaPersonas,  new Comparator<>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getDni().compareTo(o2.getDni());
            }
        });
        // Lista ordenada de personas
        for(Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}

package unidad05.apdo7_5;

import java.util.HashSet;

/**
 * Veamos cómo funcionan los objetos de tipo Set.
 *
 * @author diego
 */
public class Main00 {

    public static void main(String[] args) {
        HashSet<Integer> numerosLoteria = new HashSet<>();
        numerosLoteria.add(45);
        numerosLoteria.add(46);
        numerosLoteria.add(47);
        numerosLoteria.add(48);
        
        // Si intento meter valores que ya están, no se repiten:
        numerosLoteria.add(45);
        numerosLoteria.add(46);
        numerosLoteria.add(47);
        numerosLoteria.add(48);        

        System.out.println(numerosLoteria);
        
        System.out.println("---------------------");
        /*
        Para que los conjuntos Set que funcionen con código hash (tienen la palabra
        hash en su nombre, como HashSet), la clase de los objetos en dicha estructura
        deben implementar el método hashCode() y éste debe contemplar los mismos
        atributos que el método equals() en dicha clase.
        Es decir, equals(Object o) y hashCode() van de la mano.
        */
        HashSet<Persona> listaPersonas = new HashSet<>();
        listaPersonas.add(new Persona("Pepe", 15, "1111A"));
        listaPersonas.add(new Persona("Pepe", 15, "1111A"));
        
        System.out.println("listaPersonas = " + listaPersonas);
//        System.out.println("Hash de Pepe = " + "Pepe".hashCode());
//        System.out.println("Hash de pepe = " + "pepe".hashCode());
//        System.out.println("Hash de 1111A = " + "1111A".hashCode());
        
    }
}

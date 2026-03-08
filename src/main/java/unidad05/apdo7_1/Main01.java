package unidad05.apdo7_1;

import unidad05.ejercicios.ejercicioAnterior.Neumatico;
import java.util.ArrayList;

/**
 * Para especificar el tipo de dato de los elementos de estas colecciones y listas
 * , hay que fijarse en la definición de la API:
 * <p>ArrayList&lt;E&gt;</p>
 * <p>Donde E representa de forma genérica a cualquier tipo de dato que queramos poner
 * ¡siempre que sea un objeto!</p>
 * <p>Por ejemplo:</p>
 * <p>ArrayList&lt;String&gt; nombres = new ArrayList&lt;&gt;();</p>
 * </E>de elementos, si no se especifica el tipo, pueden contener
 * <p>Si sólo admite objetos, no se puede hacer un ArrayList&lt;int&gt; ya que es
 * un dato primitivo. Para ello se usan los wrappers.
 *
 */
public class Main01 {
    public static void main(String[] args) {
        int indice = 0;
        ArrayList<String> listaNombres = new ArrayList();
        // Añadir elementos a la lista:
        listaNombres.add("Pepe");
        listaNombres.add("José");
        listaNombres.add("Anicasio");
        System.out.println("Lista de nombres: " + listaNombres);

        // Obtener tamaño de la lista (nº de elementos):
        System.out.printf("Nº elementos de la lista %d: %n", listaNombres.size());

        // Obtener elementos de la lista:
        System.out.println("Obtener elementos de la lista: ------");
        String nombre = listaNombres.get(indice);
        System.out.printf("Nombre en posicion %d: %s%n", indice, nombre);
        System.out.printf("Nombre en posicion %d: %s%n", indice, listaNombres.get(1));
        indice = 2;
        System.out.printf("Nombre en posicion %d: %s%n", indice, listaNombres.get(indice));
        /*
        Si pongo un índice que se sale de los límites, saltará una IndexOutOfBoundsException.
        indice = 4;
        System.out.println(listaNombres.get(indice));
        */

        // Cambiar valor de un elemento de la lista:
        System.out.println("Cambiar uno de los nombres: ------");
        System.out.println("Lista de nombres: " + listaNombres);
        listaNombres.set(0, "Anselmo");
        System.out.println("Lista de nombres: " + listaNombres);

        // Eliminar un objeto de la lista:
        System.out.println("Eliminar un nombre de la lista: ------");
        System.out.println("Lista de nombres: " + listaNombres);

        // Indicando el objeto a borrar:
        listaNombres.remove("José");
        System.out.println("Lista de nombres: " + listaNombres);

        // Indicando la posición a borrar:
        listaNombres.remove(0);
        System.out.println("Lista de nombres: " + listaNombres);

        System.out.println("----------------------------------------");
        ArrayList<Integer> listaNotas = new ArrayList();
        listaNotas.add(9);
        listaNotas.add(4);
        listaNotas.add(9);
        System.out.println("Lista de notas: " + listaNotas);

        // Obtener tamaño de la lista (nº de elementos):
        System.out.printf("Nº elementos de la lista %d: %n", listaNotas.size());

        // Obtener elementos de la lista:
        System.out.println("Obtener elementos de la lista: ------");
        indice = 1;
        int nota = listaNotas.get(indice);
        System.out.printf("Elemento en posicion %d: %d%n", indice, nota);

        // Cambiar valor de un elemento de la lista:
        System.out.println("Cambiar uno de los elementos: ------");
        System.out.println("Lista de elementos: " + listaNotas);
        listaNotas.set(0, 5);
        System.out.println("Lista de elementos: " + listaNotas);

        System.out.println();

        System.out.println("----------------------------------------");
        ArrayList<Neumatico> listaNeumaticos = new ArrayList();
        listaNeumaticos.add(new Neumatico(20, 20,10000));
        listaNeumaticos.add(new Neumatico(30, 30,30000));
        listaNeumaticos.add(new Neumatico(40, 40,40000));

        System.out.println("Lista de neumáticos: " + listaNeumaticos);

        // Obtener tamaño de la lista (nº de elementos):
        System.out.printf("Nº elementos de la lista %d: %n", listaNeumaticos.size());

        // Obtener elementos de la lista:
        System.out.println("Obtener elementos de la lista: ------");
        indice = 1;
        System.out.println("Elemento en posicion "
                + indice + ": "
                + listaNeumaticos.get(indice)
        );

        // Cambiar valor de un elemento de la lista:
        System.out.println("Cambiar uno de los elementos: ------");
        System.out.println("Lista de elementos: " + listaNeumaticos);
        listaNeumaticos.set(0,
                new Neumatico(5, 5,50000));
        System.out.println("Lista de elementos: " + listaNeumaticos);

        // Eliminar un objeto de la lista:
        System.out.println("Eliminar un elemento de la lista: ------");
        System.out.println("Lista de elementos: " + listaNeumaticos);
        listaNeumaticos.remove(0);
        /*
        Para usar .remove(Object o) la lista compara el objeto introducido con cada uno de los que
        tiene almacenados. Si alguno es igual al introducido, se borra.
        Pero ¿cómo sabe la lista que son iguales? Por el método equals del objeto.
        Como no lo hemos definido, comprueba que el objeto introducido haga referencia
        a cada objeto que vaya comprobando.
        */
        System.out.println("Lista de elementos: " + listaNeumaticos);
    }
}

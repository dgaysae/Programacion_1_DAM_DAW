package unidad05.apdo7_1;


import java.util.ArrayList;

/**
 * Hemos definido el método equals en Persona, de forma que si dos objetos Persona
 * tienen el mismo DNI se consideran la misma persona.
 */
public class Main02 {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList();
        listaPersonas.add(new Persona("Pepe", 20,"11111111A"));
        listaPersonas.add(new Persona("Pepe", 20,"22222222B"));
        listaPersonas.add(new Persona("Pepe", 20,"33333333C"));

        System.out.println("Lista de neumáticos: " + listaPersonas);
        /*
        Aunque cree un nuevo objeto, al ejecutar remove se compara dicho objeto
        con los que hay dentro de la lista usando el equals de dicho objeto.
        Como ya hay un objeto Persona con el dni 22222222B, ambos se consideran
        iguales y por tanto se borra.
        */
        listaPersonas.remove(new Persona("Pepe", 20,"22222222B"));
        System.out.println("Lista de neumáticos: " + listaPersonas);

    }
}

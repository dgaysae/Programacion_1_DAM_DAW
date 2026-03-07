package unidad06.ejemplosclase.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import unidad06.ejemplosclase.Persona;

/**
 * Clase de ejemplo que genera un banco de datos que nos servirá de
 * base de datos ficticia.
 *
 * @author diego
 */
public class DataProvider {

    /**
     * Genera una lista de personas con datos aleatorios.
     *
     * @param cantidad Número de personas a generar (ej. 20 o 30).
     * @return List de objetos pruebas.pruebas01.Persona.
     */
    public static List<Persona> get(int cantidad) {
        List<Persona> lista = new ArrayList<>();
        Random random = new Random();

        String[] nombresEjemplo = {"Ana", "Luis", "Elena", "Pedro", "Marta", "Juan", "Sofía", "Carlos"};

        for (int i = 0; i < cantidad; i++) {
// Seleccionamos un nombre al azar del array de ejemplos
            String nombre = nombresEjemplo[random.nextInt(nombresEjemplo.length)] + " " + (i + 1);
// Generamos edad entre 18 y 60 años
            int edad = random.nextInt(43) + 18;
// Generamos altura entre 1.50 y 2.00 metros
            double altura = 1.50 + (0.50 * random.nextDouble());

            lista.add(new Persona(nombre, edad, altura));
        }

        return lista;
    }
}

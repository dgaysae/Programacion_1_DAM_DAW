package unidad06.mvc.ejemplo04.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * En el patrón MVC (Model-View-Controller), el modelo se responsabiliza única y exclusivamente de gestionar los datos
 * de la aplicación, ofreciendo para ello las funcionalidades necesarias. En resumen, un CRUD o parte de él:
 * <br/>
 * CRUD:
 * <ul>
 *     <li>Create (alta de datos)</li>
 *     <li>Read (obtener datos)</li>
 *     <li>Update (modificarlos)</li>
 *     <li>Delete (borrarlos)</li>
 * </ul>
 * Esto implica que el modelo debe ofrecer una ventana o interfaz (métodos) que permitan realizar todas estas operaciones
 * de las formas que requiera la aplicación: borrado de uno o varios datos, obtener un sólo registro o una lista de ellos,
 * etc.
 *
 * @author diego
 */
public class PersonasModel {

    private static final String DATA_NOMBRE = "Nombre";
    private static final String DATA_EDAD = "Edad";
    private static final String DATA_ALTURA = "Altura";
    public static final int VOLUMEN_BD_DEFAULT = 30;

    /**
     * Esta propiedad será la que contenga la información del modelo.
     * Servirá como base de datos ficticia para nuestro desarrollo.
     */
    List<Persona> personas;

    /**
     * El constructor del modelo "carga la base de datos"
     * @param cantidad Indica el volumen de "registros" de la base de datos.
     */
    public PersonasModel(int cantidad) {
        personas = generateRandomData(cantidad);
    }
    
    public PersonasModel() {
        this(VOLUMEN_BD_DEFAULT);
    }

    /**
     * Una de las responsabilidades del modelo es decirle a quien se lo solicite
     * qué datos va a devolver.
     * Este método ofrece la lista de los nombres de las columnas de datos.
     * @return Nombres de los datos.
     */
    public String[] getColumnNames() {
        return new String[]{DATA_NOMBRE, DATA_EDAD, DATA_ALTURA};
    }

    /**
     * Devuelve la lista de datos.
     * Esto nos servirá de momento para simular los resultados de lanzar una SELECT
     * contra una base de datos.
     * @return Resultado de la SELECT de personas
     */
    public List<Persona> select() {
        return personas;
    }

    /**
     * Devuelve los datos de un registro.
     * Esto nos servirá de momento para simular los resultados de lanzar
     * una SELECT-WHERE contra una base de datos.
     * @param indice
     * @return Registro resultado de la SELECT-WHERE
     */
    public Persona selectByIndex(int indice) {
        return personas.get(indice);
    }

    /**
     * Borra el registro especificado.
     * Esto nos servirá de momento para simular los resultados de lanzar
     * una DELETE-WHERE contra una base de datos.
     * @param p Registro (Persona) a borrar.
     * @return true si se ha borrado correctamente.
     */
    public boolean delete(Persona p) {
        if (!personas.contains(p)) {
            return false;
        }
        
        // Hacer en casa
        return true;
    }

    /**
     * Borra el registro del índice especificado.
     * Esto nos servirá de momento para simular los resultados de lanzar
     * una DELETE-WHERE contra una base de datos.
     * @param indice Índice del registro (Persona) a borrar.
     * @return true si se ha borrado correctamente.
     */
    public boolean delete(int indice) {
        try{
            personas.remove(indice);
        }
        catch(Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Este método es el que genera los datos de "base de datos" ficticia.
     * Genera una lista de personas con datos aleatorios.
     * @param cantidad Número de personas a generar (ej. 20 o 30).
     * @return List de objetos pruebas.pruebas01.Persona.
     */
    private List<Persona> generateRandomData(int cantidad) {
        List<Persona> lista = new ArrayList<>();
        Random random = new Random();

        String[] nombres = {"Ana", "Luis", "Elena", "Pedro", "Marta", "Juan", "Sofía",
                "Carlos", "Juana", "Fernanda", "Víctor", "Ana", "Anselmo", "Federico", "José Antonio", "José Enrique",
                "Iván", "Joel", "Perales", "Miguel", "Lucas", "Joaquín", "Francisco", "Noah", "Rubén", "David",
                "Roberto", "Soulemane", "Zakaria", "Juan Jesús", "Matías", "Sergio", "Álvaro", "José Juan", "Pablo"};

        String[] apellidos = {"Iguiño", "Sáez", "Iribarne", "Romero", "Reche", "Navarro", "Peláez", "Manzano",
                "Jiménez", "Giménez", "Martínez", "Pérez", "Artero", "Hernández", "Fernández", "Godoy", "García",
                "Domínguez", "Rodríguez", "El Habchi", "El Mokhtari", "Jaraba", "Prieto", "Oliver", "Ortigosa", "Gay",
                "Castillo", "Bravo", "Becerra", "Naranjo", "Cortéz", "Cortez", "Castañeda", "Konate", "Márquez", "Ruiz",
                "López"};
        for (int i = 0; i < cantidad; i++) {
            // Seleccionamos un nombre y los apellidos al azar de los arrays de muestra
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido1 = apellidos[random.nextInt(apellidos.length)];
            String apellido2 = apellidos[random.nextInt(apellidos.length)];
            // Generamos edad entre 18 y 60 años
            int edad = random.nextInt(43) + 18;
            // Generamos altura entre 1.50 y 2.00 metros
            double altura = 1.50 + (0.50 * random.nextDouble());

            lista.add(new Persona(apellido1 + " " + apellido2 + ", " + nombre, edad, altura));
        }

        return lista;
    }
}

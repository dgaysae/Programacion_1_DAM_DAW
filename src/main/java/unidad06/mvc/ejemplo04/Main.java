package unidad06.mvc.ejemplo04;


import unidad06.mvc.ejemplo04.controller.PersonasController;

/**
 * El patrón MVC (Model-View-Controller) otorga al Controller todo el control.
 * <br/>
 * Él se encarga de atender a las peticiones que se hagan de la vista, al pulsar cualquier botón o control de pantalla,
 * y pedirle al modelo que realice la operación que crea necesaria.
 * <br/>
 * Por su parte, el modelo se responsabiliza única y exclusivamente de gestionar los datos de la aplicación, ofreciendo
 * para ello las funcionalidades necesarias. En resumen, un CRUD o parte de él:
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
public class Main {
    public static void main(String[] args) {
        new PersonasController();
    }
}

package unidad07.clasesAnonimas.paraOtrasClases;

/**
 * <p>
 *     En esta ocasión usamos una clase anónima para instanciar un objeto de OTRA CLASE. Con esto creamos un objeto de
 *     una subclase que hereda de la clase en cuestión.
 * </p>
 * <p>
 *     Esto lo hacemos cuando en un punto concreto de nuestro código queremos especificar un comportamiento diferente
 *     sin necesidad de crear una nueva clase que herede de la primera.
 *     <br/>
 *     La reutilización es siempre recomendable, pero si no vamos a usarla en ningún otro lugar, ¿para qué crear otra
 *     clase?
 * </p>
 * <p>
 *     Esa es la diferencia con las interfaces, donde se instanciaba un objeto de la nada (clase anónima) y se le daba
 *     un comportamiento (el de la interfaz).
 * </p>
 * <p>
 *     Al hacerlo podemos sobreescribir métodos para dar un comportamiento diferente.
 * </p>
 * @author dgs
 */
public class Main {
    public static void main(String[] args) {
        Alumno pepe = new Alumno("Pepe", 9.4, 4.5);
        System.out.println(pepe.getNombre() + " ha aprobado? " + pepe.aprobado());

        Alumno ana = new Alumno("Ana", 9.4, 4.5) {
            /**
             * Está aprobado si se ponderan el examen y las actividades.
             * @return
             */
            @Override
            public boolean aprobado() {
                return (0.4 * getNotaActividades() + 0.6 * getNotaExamen()) >= 5;
            }
        };
        System.out.println(ana.getNombre() + " ha aprobado? " + ana.aprobado());
    }
}

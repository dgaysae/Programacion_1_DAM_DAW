package unidad07.clasesAnonimas.paraInterfaces.ejemplo02;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.toser();

        ToserEnClase profesor = new ToserEnClase() {
            @Override
            public void toser() {
                System.out.println("COOOOOF, COOOOOOF!");
            }
        };
        
        profesor.toser();
    }
}

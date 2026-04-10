package unidad07.prog_funcional.ejemplo05;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>Programación funcional - Ejemplo de Function</h1>
 * <p>
 * Tenemos la clase {@link Persona} cuyos getters para obtener los datos de la dirección se repiten mucho.<br/>
 * Intenta usar la interfaz funcional Function y expresiones lambda para evitar repetición de código.
 * </p>
 * <p>
 *     Después usa stream y expresiones lambda para filtrar los datos de la lista <strong>persona</strong> por distintos
 *     criterios: que sean de una misma provincia, que hayan nacido en un mes concreto, etc.
 * </p>
 * @author dgs
 */
public class MainPersona {
    public static void main(String[] args) {
        List<Persona> personas = getPersonas();
        if (personas.size() == 0) return;

        System.out.println("---- TODAS LAS PERSONAS ----");
        personas.forEach(p -> System.out.println(p));


    }

    public static List<Persona> getPersonas() {
        return Arrays.asList(
                new Persona("Juana",
                        "12345678D",
                        "juana@juana.es",
                        LocalDate.of(1945, Month.MARCH, 3)),
                new Persona("Pepe",
                        "00000000A",
                        "pepe@pepe.es",
                        LocalDate.of(1987, Month.NOVEMBER, 23),
                        true,
                        "Almería",
                        "Almería",
                        "04007",
                        "C/ Ficticia de Almería, 12, portal 3, 1-2"),
                new Persona("Anicasia",
                        "11111111B",
                        "anicasia@anicasia.es",
                        LocalDate.of(1973, Month.JANUARY, 5),
                        false,
                        "Córdoba",
                        "Córdoba",
                        "14001",
                        "C/ Ficticia de Córdoba, 32"),
                new Persona("Prudencio",
                        "22222222C",
                        "prudencio@prudencio.es",
                        LocalDate.of(1973, Month.JANUARY, 5),
                        true,
                        "Sevilla",
                        "Sevilla",
                        "41001",
                        "C/ Ficticia de Sevilla, 27"),
                new Persona("Ermenegildo",
                        "22334987E",
                        "ermenegildo@ermenegildo.es",
                        LocalDate.of(1981, Month.FEBRUARY, 14),
                        true,
                        "Priego de Córdoba",
                        "Córdoba",
                        "14800",
                        "C/ Ficticia de Priego de Córdoba, 145"),
                new Persona("Telmo",
                        "93872651F",
                        "telmo@telmo.es",
                        LocalDate.of(2012, Month.AUGUST, 22),
                        true,
                        "Uleila del Campo",
                        "Almería",
                        "04279",
                        "C/ Ficticia de Uleila del Campo, 51"),
                new Persona("Antonio",
                        "93872651F",
                        "antonio@dejaen.es",
                        LocalDate.of(1989, Month.JANUARY, 2),
                        false,
                        "Jaén",
                        "Jaén",
                        "23006",
                        "C/ Ficticia de Jaén, 27"),
                new Persona("Alberto",
                        "93872651F",
                        "alberto@delinares.es",
                        LocalDate.of(1977, Month.NOVEMBER, 23),
                        true,
                        "Linares",
                        "Jaén",
                        "23700",
                        "C/ Ficticia de Linares, 76")
        );
    }
}

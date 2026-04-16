package unidad07.prog_funcional.ejemplo05;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class MainPersonaSolucion {
    public static void main(String[] args) {






        List<PersonaSolucion> personas = getPersonas();
        if (personas.size() == 0) return;

        System.out.println("---- TODAS LAS PERSONAS ----");
        personas.forEach(p -> System.out.println(p));

        System.out.println();
        System.out.println("---- TODAS LAS PERSONAS DE LA PROVINCIA DE JAÉN ----");
        personas.stream()
                .filter(p -> p.getProvincia().equalsIgnoreCase("jaén"))
                .forEach(p -> System.out.println(p));

        System.out.println();
        System.out.println("---- TODAS LAS PERSONAS NACIDAS EN NOVIEMBRE ----");
        personas.stream()
                .filter(p -> p.getFechaNacimiento().getMonth() == Month.NOVEMBER)
                .forEach(p -> System.out.println(p));

        System.out.println();
        System.out.println("---- TODAS LAS PERSONAS NACIDAS DESPUÉS DEL 1985 ----");
        personas.stream()
                .filter(p -> p.getFechaNacimiento().getYear() > 1985)
                .forEach(p -> System.out.println(p));

        System.out.println();
        System.out.println("---- TODAS LAS PERSONAS SOLTERAS ----");
        personas.stream()
                .filter(p -> !p.isCasada())
                .forEach(p -> System.out.println(p));

        System.out.println();
        System.out.println("---- TODAS LAS PERSONAS SOLTERAS Y NACIDAS ANTES DE 1980 ----");
        personas.stream()
                .filter(p -> !p.isCasada())
                .filter(p -> p.getFechaNacimiento().getYear() < 1980)
                .forEach(p -> System.out.println(p));
    }

    public static List<PersonaSolucion> getPersonas() {
        return Arrays.asList(
                new PersonaSolucion("Juana",
                        "12345678D",
                        "juana@juana.es",
                        LocalDate.of(1945, Month.MARCH, 3)),
                new PersonaSolucion("Pepe",
                        "00000000A",
                        "pepe@pepe.es",
                        LocalDate.of(1987, Month.NOVEMBER, 23),
                        true,
                        "Almería",
                        "Almería",
                        "04007",
                        "C/ Ficticia de Almería, 12, portal 3, 1-2"),
                new PersonaSolucion("Anicasia",
                        "11111111B",
                        "anicasia@anicasia.es",
                        LocalDate.of(1973, Month.JANUARY, 5),
                        false,
                        "Córdoba",
                        "Córdoba",
                        "14001",
                        "C/ Ficticia de Córdoba, 32"),
                new PersonaSolucion("Prudencio",
                        "22222222C",
                        "prudencio@prudencio.es",
                        LocalDate.of(1973, Month.JANUARY, 5),
                        true,
                        "Sevilla",
                        "Sevilla",
                        "41001",
                        "C/ Ficticia de Sevilla, 27"),
                new PersonaSolucion("Ermenegildo",
                        "22334987E",
                        "ermenegildo@ermenegildo.es",
                        LocalDate.of(1981, Month.FEBRUARY, 14),
                        true,
                        "Priego de Córdoba",
                        "Córdoba",
                        "14800",
                        "C/ Ficticia de Priego de Córdoba, 145"),
                new PersonaSolucion("Telmo",
                        "93872651F",
                        "telmo@telmo.es",
                        LocalDate.of(2012, Month.AUGUST, 22),
                        true,
                        "Uleila del Campo",
                        "Almería",
                        "04279",
                        "C/ Ficticia de Uleila del Campo, 51"),
                new PersonaSolucion("Antonio",
                        "93872651F",
                        "antonio@dejaen.es",
                        LocalDate.of(1989, Month.JANUARY, 2),
                        false,
                        "Jaén",
                        "Jaén",
                        "23006",
                        "C/ Ficticia de Jaén, 27"),
                new PersonaSolucion("Alberto",
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

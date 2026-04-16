package unidad07.prog_funcional.ejemplo05;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <h1>Programación funcional - API Stream</h1>
 * <p>
 * Java se incorporó tarde a la programación funcional y tuvo que hacer "ajustes" para permitir la misma versatilidad
 * que otros lenguajes de programación. Y uno de esos ajustes son los "stream" que se pueden invocar desde cualquier
 * colección de datos.
 * </p>
 *
 * @author dgs
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------- EJEMPLO 1 -------------------");
        List<String> nombres = List.of("Anselmo", "Federica", "Olegario", "Mercedes", "Telmo", "Ana", "Alberto", "Juan José", "José Andrés");

        List<String> nombresCortos = nombres.stream()
                .filter(s -> s.length() <= 5)
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("----------- Nombres cortos -----------");
        System.out.println(nombresCortos);

        List<String> nombresCompuestos = nombres.stream()
                .filter(nombre -> nombre.split(" ").length > 1)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("----------- Nombres compuestos -----------");
        System.out.println(nombresCompuestos);

        int empiezanPorA = nombres.stream()
                .map(nombre -> nombre.toUpperCase().startsWith("A") ? 1 : 0)
                .reduce(0, (subtotal, elemento) -> subtotal + elemento);
        List<String> nombresEmpiezanPorA = nombres.stream()
                .filter(s -> s.toUpperCase().startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("----------- Nombres que empiezan por A -----------");
        System.out.printf("Hay %d nombres que empiezan por A. Esos nombres son: %n", empiezanPorA);
        System.out.println(nombresEmpiezanPorA);

        System.out.println();
        System.out.println();
        System.out.println("------------------- EJEMPLO 2 -------------------");
        List<String> frutas = List.of("pera", "manzana", "FRESA", "PLÁTANO", "POMELO", "kiwi", "mango", "PERA");
        System.out.println("Frutas: " + frutas);

        System.out.println("--- Frutas en mayúsculas ---");
        frutas.stream()
                .filter(s -> s.matches("[A-ZÁÉÍÓÚ]+"))
                .forEach(System.out::println);

        System.out.println("--- Frutas en minúsculas ---");
        frutas.stream()
                .filter(s -> s.matches("[a-z]+"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println("------------------- EJEMPLO 3 -------------------");
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);

        Integer suma = numeros.stream()
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("Suma: " + suma);
    }
}

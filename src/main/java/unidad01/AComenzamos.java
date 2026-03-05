package unidad01;

public class AComenzamos {
    public static void main(String[] args) {
        // esto es un comentario

        /*
        Esto es otro comentario de varias líneas y puedo
        seguir así hasta quedarme sin pantalla
        */

        // La siguiente línea muestre el texto entre comillas en la consola:
        System.out.println("Hola, clase!!!");

        // La siguiente línea declara una variable double donde se guarda un número aleatorio entre 0 (incluido) y 1 (no incluido):
        double numeroAleatorio = Math.random();

        // La siguiente línea muestra por consola el valor de dicho número:
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        // La siguiente línea muestra por consola el valor de un número aleatorio entre 0 (incluido) y 10 (incluido):
        System.out.println("Número aleatorio final = " + (int)(numeroAleatorio * 11));
    }
}

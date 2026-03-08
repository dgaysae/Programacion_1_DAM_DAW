package unidad05.apdo7_5.morse;

import java.util.HashMap;
import java.util.Map;

/**
 * Crea un programa que sea capaz de transformar texto natural a código morse y
 * viceversa. - Debe detectar automáticamente de qué tipo se trata y realizar la
 * conversión. - En morse se soporta raya "—", punto ".", un espacio " " entre
 * letras o símbolos y dos espacios entre palabras " ". - El alfabeto morse
 * soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 * Ejercicio extraído de: https://retosdeprogramacion.com/ejercicios/
 *
 * @author diego
 */
public class Morse {

    private Map<String, String> codigoMorse = new HashMap<>();

    public Morse() {
        inicializar();
    }

    private void inicializar() {

        codigoMorse.put("a", ".-");
        codigoMorse.put("b", "-...");
        codigoMorse.put("c", "-.-.");
        codigoMorse.put("d", "-..");
        codigoMorse.put("e", ".");
        codigoMorse.put("f", "..-.");
        codigoMorse.put("g", "--.");
        codigoMorse.put("h", "....");
        codigoMorse.put("i", "..");
        codigoMorse.put("j", ".---");
        codigoMorse.put("k", "-.-");
        codigoMorse.put("l", ".-..");
        codigoMorse.put("m", "--");
        codigoMorse.put("n", "-.");
        codigoMorse.put("o", "---");
        codigoMorse.put("p", ".--.");
        codigoMorse.put("q", "--.-");
        codigoMorse.put("r", ".-.");
        codigoMorse.put("s", "...");
        codigoMorse.put("t", "-");
        codigoMorse.put("u", "..-");
        codigoMorse.put("v", "...-");
        codigoMorse.put("w", ".--");
        codigoMorse.put("x", "-..-");
        codigoMorse.put("y", "-.--");
        codigoMorse.put("z", "--..");
        codigoMorse.put(" ", " ");
    }

    public void cifrar(String texto) {
        if (texto == null || texto.equals("")) {
            return;
        }
        texto = texto.toLowerCase();
        for (int lector = 0; lector < texto.length(); lector++) {
            System.out.print(
                    codigoMorse.get(texto.charAt(lector) + "")
                    + " "
            );

        }

    }

    private String deMorseALetra(String letraMorse) {
        for (Map.Entry<String, String> letra : codigoMorse.entrySet()) {
            if (letraMorse.equals(letra.getValue())) {
                return letra.getKey();
            }
        }

        return "_";
    }

    public void descifrar(String texto) {
        if (texto == null || texto.equals("")) {
            return;
        }
        String[] codigos = texto.split(" ");

        for (int i = 0; i < codigos.length; i++) {

            System.out.print(deMorseALetra(codigos[i]));
        }

    }

    public String toString() {
        return "Codigo{" + this.codigoMorse + "}";
    }

}

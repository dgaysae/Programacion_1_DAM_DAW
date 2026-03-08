package unidad05.expresionesRegulares;

/**
 * Si no has podido asistir a clase, es conveniente que antes de estudiar este código
 * veas el vídeo: https://youtu.be/n7leNDm7D5g?feature=shared
 * @see EjemploVideo
 * @author diego
 */
public class Main01 {

    public static void main(String[] args) {
        //System.out.println("Valida matricula: " + validaMatriculaMal("1234BGD"));

        System.out.println("--------------------");
        // Comprobar si es juan angel, jose angel o miguel angel
        String texto = "juan angel";
        String patron = "(jose|miguel|juan) angel";
        validarTexto(texto, patron);

        // Comprobar si es el patrón se repite 0, 1 o más veces
        texto = "aaaaaa";
        patron = "a*";
        validarTexto(texto, patron);

        texto = "";
        validarTexto(texto, patron);

        texto = "a";
        validarTexto(texto, patron);

        texto = "rrocacacarro";
        patron = "(ca|rro)*";
        validarTexto(texto, patron);

        // Comprobar si es el patrón se repite 1 o más veces
        texto = "";
        patron = "a+";
        validarTexto(texto, patron);

        texto = "a";
        validarTexto(texto, patron);

        texto = "aaaaaaaaaaaaaaa";
        validarTexto(texto, patron);

        texto = "aab";
        validarTexto(texto, patron);

        texto = "cacaca";
        patron = "(ca|rro)+";
        validarTexto(texto, patron);

        texto = "rro";
        patron = "(ca|rro)+";
        validarTexto(texto, patron);

        texto = "ro";
        patron = "(ca|rro)+";
        validarTexto(texto, patron);

        texto = "";
        patron = "(ca|rro)+";
        validarTexto(texto, patron);

        // Comprobar si es el patrón se repite n veces exactamente
        texto = "aa";
        patron = "a{2}";
        validarTexto(texto, patron);

        texto = "aaaaaa";
        validarTexto(texto, patron);

        texto = "";
        validarTexto(texto, patron);

        // Comprobar si es el patrón se repite entre n y m veces exactamente
        texto = "aa";
        patron = "a{2,3}";
        validarTexto(texto, patron);

        texto = "aaa";
        validarTexto(texto, patron);

        texto = "aaaa";
        validarTexto(texto, patron);

        texto = "a";
        validarTexto(texto, patron);

        texto = "caa";
        patron = "ca{2}";
        validarTexto(texto, patron);

        texto = "ccaa";
        patron = "ca{2}";
        validarTexto(texto, patron);

        texto = "caca";
        patron = "(ca){2}";
        validarTexto(texto, patron);

        texto = "caca";
        patron = "(ca|ro){2}";
        validarTexto(texto, patron);

        texto = "caro";
        validarTexto(texto, patron);

        texto = "roca";
        validarTexto(texto, patron);

        // Comprobar si el texto tiene uno de varios caracteres
        texto = "a";
        patron = "[aeiou]";
        validarTexto(texto, patron);

        texto = "o";
        validarTexto(texto, patron);

        texto = "d";
        validarTexto(texto, patron);

        texto = "pepa";
        patron = "pep[ae]";
        validarTexto(texto, patron);

        texto = "pepe";
        validarTexto(texto, patron);

        texto = "pepi";
        validarTexto(texto, patron);

        // Comprobar si el texto tiene uno de un rango de caracteres
        texto = "a";
        patron = "[a-z]";
        validarTexto(texto, patron);

        texto = "-";
        validarTexto(texto, patron);

        texto = "A";
        validarTexto(texto, patron);

        texto = "a";
        patron = "[A-Za-z]";
        //patron = "[ABCDEFG...Zabecefg...z]";
        //patron = "[aAbBcCdDeEfFgG...Zabecefg...z]";
        validarTexto(texto, patron);

        // Comprobar si el texto es un dígito
        texto = "5";
        patron = "[0-9]";
        validarTexto(texto, patron);

        texto = "b";
        validarTexto(texto, patron);

        // Comprobar si el texto es un número de 3 dígitos
        texto = "567";
        patron = "[0-9]{3}";
        validarTexto(texto, patron);

        texto = "56";
        validarTexto(texto, patron);

        texto = "b56";
        validarTexto(texto, patron);

        // Comprobar si el texto comienza por el 1 y acaba con la z
        texto = "1z";
        patron = "^1.*z$";
        validarTexto(texto, patron);

        texto = "1654987asdfasdfasdfz";
        validarTexto(texto, patron);

        texto = "1654987asdfasdfasdfZ";
        validarTexto(texto, patron);

        // Comprobar si el texto comienza por el 1 y acaba con punto (.)
        texto = "1z";
        patron = "^1.*\\.$";
        validarTexto(texto, patron);

        texto = "1z.";
        validarTexto(texto, patron);

        // Comprobar si el texto comienza por el 1 y acaba con algo entre paréntesis
        texto = "1z()";
        patron = "^1.*\\(.*\\)$";
        validarTexto(texto, patron);

        texto = "1z(asdf)";
        validarTexto(texto, patron);

        texto = "1z(asdf).";
        validarTexto(texto, patron);

        // Comprobar si el texto es un número, que puede ser negativo
        texto = "-65";
        patron = "-?[0-9]+";
        validarTexto(texto, patron);

        texto = "65";
        validarTexto(texto, patron);

        texto = "-0";
        validarTexto(texto, patron);

        // Comprobar lo de antes, evitando el -0
        texto = "-0";
        //patron = "-?[1-9][0-9]*";
        patron = "(-?[1-9][0-9]*|0)";
        validarTexto(texto, patron);

        texto = "00";
        validarTexto(texto, patron);

        texto = "0";
        validarTexto(texto, patron);

        texto = "-10";
        validarTexto(texto, patron);

    }

    /**
     * Comprueba que el texto introducido cumple con el patrón indicado.
     * @param texto
     * @param regExp
     */
    public static void validarTexto(String texto, String regExp) {
        System.out.println("------------------");
        System.out.println("Texto = " + texto);
        System.out.println("Patron = " + regExp);

        if (texto.matches(regExp)) {
            System.out.println("Concuerda con el patrón");
        } else {
            System.out.println("Expresión incorrecta");
        }
    }
}

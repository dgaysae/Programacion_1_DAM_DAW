package unidad05.expresionesRegulares;

/**
 * 
 * @author diego
 */
public class Ejemplos {
    public static void main(String[] args) {
        System.out.println("Entero: " + validaEntero("60"));
        System.out.println("Real: " + validaReal("-60.0"));
        System.out.println("Telefono: " + validaTelefonoES("+34666554433"));
    }
    
    public static boolean validaEntero(String s) {
        return s.matches("(-?[1-9][0-9]*|0)");
    }

    public static boolean validaReal(String s) {
        return s.matches("(-?[1-9][0-9]*|0)(\\.[0-9]+)?");
    }

    public static boolean validaTelefonoES(String s) {
        return s.matches("^\\+34[0-9]{9}");
    }

    /**
     * Las letras no incluyen vocales.
     * @param s
     * @return 
     */
    public static boolean validaMatriculaES(String s) {
        return s.matches("^[0-9]{4}[A-Z&&[^AEIOU]]{3}");
    }
}

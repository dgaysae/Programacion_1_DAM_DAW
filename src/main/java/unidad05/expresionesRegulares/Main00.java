package unidad05.expresionesRegulares;

/**
 * En este ejemplo vamos a ver lo que supone comprobar que una cadena cumpla con un formato
 * concreto. En este caso se trata de una matrícula, pero podría ser un teléfono, un DNI, una
 * dirección de email.
 * Aquí es donde vamos a ver la utilidad de usar expresiones regulares, que reducen esta comprobación
 * a una sola línea de código.
 */
public class Main00 {
    public static void main(String[] args) {

        System.out.println("Valida matricula: " + validaMatriculaMal("1234BGD"));

    }

    /**
     * Este método valida si la cadena introducida cumple con el formato de una matrícula
     * de coche en España. El formato debe ser 9999XXX
     * Donde 9 puede ser cualquier dígito y X cualquier letras mayúscula que no sea vocal.
     * Este método NO ESTÁ COMPLETO, pero puede verse hasta qué punto puede complicarse este
     * tipo de validaciones...
     * @param matricula
     * @return
     */
    public static boolean validaMatriculaMal(String matricula) {
        if (matricula.length() != 7) {
            return false;
        }
        String digitos = matricula.substring(0, 4);
        try {
            Integer numero = Integer.valueOf(digitos);
            if (numero < 0) {
                System.out.println("El texto pasado por parámetro no debe ser un número negativo");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("El texto pasado por parámetro no es un número entero");
            return false;
        }
        String letras = matricula.substring(4).toUpperCase();
        if (letras.contains("A")
                || letras.contains("E")
                || letras.contains("I")
                || letras.contains("O")
                || letras.contains("U")
                || letras.contains("0")
                || letras.contains("1")
                || letras.contains("2")
                || letras.contains("3") // etc
        ) {
            return false;
        }

        return true;
    }
}

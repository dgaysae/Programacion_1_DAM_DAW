package unidad01;

/**
 * Las operaciones de comparación, generalmente, devuelven un valor true o false.
 * <br/>
 * Se trata de operaciones que comprueban si dos valores son iguales, mayor/menor que el otro,
 * mayor o igual/menor o igual o simplemente distintos.
 *
 * @author dgs
 */
public class OperadoresComparacion {
    
    public static void main(String[] args) {

        /*
        Del carácter se evalúa su nº en la tabla ASCII/Unicode.
        Es decir, en ASCII la A es 65.
         */
        char letraAMayuscula = 'A';
        char letraAMinuscula = 'a';
        int valorASCIILetraA = 65;

        System.out.print(letraAMayuscula + " es igual que " + letraAMinuscula + "? ");
        System.out.println(letraAMayuscula == letraAMinuscula);

        System.out.print("En la tabla ASCII/Unicode, la A equivale al valor 65. Es eso cierto? ");
        System.out.println(letraAMayuscula == valorASCIILetraA);

        System.out.print("Y la a equivale al valor 65? ");
        System.out.println(letraAMinuscula == valorASCIILetraA);

        /*
        Al devolver un valor boolean, podemos guardar cualquier comparación en una
        variable de ese tipo.
         */

        boolean cincoIgualACinco = (5 == 5);
        boolean cincoMayorQueSeis = (5 > 6);
        
        System.out.println("cincoIgualACinco = " + cincoIgualACinco);
        System.out.println("cincoMayorQueSeis = " + cincoMayorQueSeis);

        System.out.println("Podemos encadenar condiciones con el operador && = AND.");
        int edad = 17;
        boolean edadPositiva = (edad > 0);
        boolean edadMenorDe18 = (edad < 18);
        boolean esMenorDeEdad = edadPositiva &&  edadMenorDe18;

        System.out.println("Es menor de edad? edadPositiva && edadMenorDe18 = " + esMenorDeEdad);

        int numero = -20;
        boolean esNegativo = (numero < 0);
        boolean esMayorDe18 = (numero > 18);
        System.out.println(numero + " está fuera del rango entre 0 y 18? esNegativo || esMayorDe18 = " + (esNegativo || esMayorDe18));

        System.out.println("Podemos obtener el valor opuesto de una condición anteponiendo el operador de negación: !");
        System.out.println(numero + " esMayorDe18 = " + esMayorDe18);
        System.out.println(numero + " no esMayorDe18 = !esMayorDe18 = " + !esMayorDe18);

        System.out.println("Está entre 0 y 18? = !esNegativo && !esMayorDe18 = "
                + (!esNegativo && !esMayorDe18));
        
        System.out.println("Está entre 0 y 18? = !(esNegativo || esMayorDe18) = "
                + !(esNegativo || esMayorDe18));
                
        
    }
    
}

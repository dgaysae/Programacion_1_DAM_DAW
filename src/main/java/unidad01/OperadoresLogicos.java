package unidad01;

/**
 * Las operaciones lógicas devuelven uno de dos posibles valores: true o false.
 * <br/>
 * Se trata de operaciones que evalúan una condición.
 * <ul>
 *     <li>Si ésta se cumple = true</li>
 *     <li>En caso contrario = false</li>
 * </ul>
 * @author dgs
 */
public class OperadoresLogicos {
    
    public static void main(String[] args) {
        boolean tieneCarnetDeConducir = true;
        boolean esMayorDeEdad;
        boolean puedeConducir;
        int edad = 25;
        
        esMayorDeEdad = (edad >= 18);
        
        System.out.println("Es mayor de edad? " + esMayorDeEdad);
        System.out.println("Tiene carnet de conducir? " + tieneCarnetDeConducir);
        
        puedeConducir = esMayorDeEdad && tieneCarnetDeConducir;
        System.out.println("Para que pueda conducir debe ser mayor de edad y tener el carnet de conducir (ambas)");
        System.out.println("Entonces, ¿puede conducir? " + puedeConducir);

        System.out.println("************************************");
        boolean dniEnRegla = false;
        boolean carnetConducirEnRegla = false;
        
        boolean dejarPasar = (dniEnRegla || carnetConducirEnRegla);

        System.out.print("Para pasar un control, hemos de tener en regla uno de estos dos documentos:");
        System.out.println(" dni o carnet de conducir");
        System.out.println("1. dni en regla? " + dniEnRegla);
        System.out.println("2. carnet de conducir en regla? " + carnetConducirEnRegla);
        System.out.println("El policía nos deja pasar? " + dejarPasar);

        System.out.println("************************************");
        boolean dniCaducado = true;
        boolean carnetConducirCaducado = false;
        
        dejarPasar = (!dniCaducado || !carnetConducirCaducado);
        
        System.out.println("dni caducado ? " + dniCaducado);
        System.out.println("carnet de conducir caducado? " + carnetConducirCaducado);
        System.out.println("El policía nos deja pasar? " + dejarPasar);
        
        // ********************************************
        // Operador XOR - ^
        System.out.println("***************************************");
        System.out.println("**************** XOR ^ ****************");
        System.out.println("***************************************");
        System.out.println("Ejemplo 1: ----------------------------");
        System.out.println("Nos invitan a comer, con la condición de que debemos elegir entre carne o pescado.");
        System.out.println("Si no elegimos uno de los dos, nos quedamos sin comer.");
        boolean comerCarne = true;
        boolean comerPescado = false;
        boolean podemosComer = (comerCarne ^ comerPescado);

        System.out.println("comerCarne? " + comerCarne);
        System.out.println("comerPescado? " + comerPescado);

        System.out.println("Finalmente, ¿podemos comer? " + podemosComer);

        System.out.println("Ejemplo 2: ----------------------------");
        System.out.println("En una tienda en Internet nos muestran por pantalla dos formas de pago: con tarjeta o por Paypal.");
        System.out.println("Sólo podemos pagar de una de las dos formas.");
        System.out.println("Si no elegimos ninguna, obviamente no podemos pagar.");
        System.out.println("Si elegimos las dos, el sistema nos dirá que debemos elegir sólo una de ellas.");
        System.out.println("Cambia los valores y comprueba el resultado.");
        boolean pagoPorPaypal = true;
        boolean pagoConTarjeta = true;
        boolean seguirConElPago = pagoPorPaypal ^ pagoConTarjeta;

        System.out.println("pagoPorPaypal? " + pagoPorPaypal);
        System.out.println("pagoConTarjeta? " + pagoConTarjeta);
        System.out.println("Entonces, puedo seguir con el proceso de pago? " + seguirConElPago);

        System.out.println("Ejemplo 3: ----------------------------");
        System.out.println("CIFRADO SIMÉTRICO: misma clave para cifrar y para descifrar.");
        System.out.println("Vamos a hacer la operación XOR con bits");
        System.out.println("Cruzaremos los bits de la letra A con la x");
        System.out.println("En la tabla ASCII, la letra A tiene el valor 65");
        System.out.println("En la tabla ASCII, la letra x tiene el valor 120");
        System.out.println("En binario:");
        System.out.println("    A -> 0100 0001");
        System.out.println("    x -> 0111 1000");
        System.out.println("         ---------");
        System.out.println("  XOR -> 0011 1001");
        System.out.println("0011 1001 equivale al valor decimal 57, que en la tabla ASCII representa al carácter: 9");
        System.out.println("Vamos a hacerlo como si la A fuese un mensaje a cifrar y la x la clave de cifrado (clave secreta)");
        char mensaje = 'A';
        char clave = 'x';

        char mensajeCifrado = (char) (mensaje ^ clave); // resultado = 57 -> 0011 1001

        System.out.println("Original: " + mensaje);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

        // Si aplicamos la misma operación que al mensaje original, recuperamos su valor:
        System.out.println("Aplicamos la misma operación sobre el mensaje cifrado para obtener el original:");
        char mensajeDescifrado = (char) (mensajeCifrado ^ clave);

        System.out.println("Descifrado (aplicando XOR de nuevo): " + mensajeDescifrado);
    }
    
}

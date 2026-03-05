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
        
        System.out.println("Es mayor de edad? "
                + esMayorDeEdad);
        System.out.println("Tiene carnet de conducir? "
                + tieneCarnetDeConducir);
        
        puedeConducir = esMayorDeEdad && tieneCarnetDeConducir;
        System.out.println("Puede conducir? "
                + puedeConducir);
        
        // ************************************************
        System.out.println("************************************");
        boolean dniEnRegla = false;
        boolean carnetConducirEnRegla = false;
        
        boolean dejarPasar = (dniEnRegla || carnetConducirEnRegla);
        
        System.out.println("dni en regla? " + dniEnRegla);
        System.out.println("carnet de conducir en regla? "
                + carnetConducirEnRegla);
        System.out.println("El policía nos deja pasar? "
                + dejarPasar);
        
        
        // ************************************************
        System.out.println("************************************");
        boolean dniCaducado = true;
        boolean carnetConducirCaducado = false;
        
        dejarPasar = (!dniCaducado || !carnetConducirCaducado);
        
        System.out.println("dni caducado ? " + dniCaducado);
        System.out.println("carnet de conducir caducado? "
                + carnetConducirCaducado);
        System.out.println("El policía nos deja pasar? "
                + dejarPasar);
        
        // ********************************************
        // Operador XOR - ^
        System.out.println("************************************");
        boolean i1Encendido = true;
        boolean i2Encendido = false;
        boolean luzEncendida = (i1Encendido ^ i2Encendido);
        
        System.out.println("i1Encendido? " + i1Encendido);
        System.out.println("i2Encendido? " + i2Encendido);
        
        System.out.println("luz encendida = " + luzEncendida);

    }
    
}

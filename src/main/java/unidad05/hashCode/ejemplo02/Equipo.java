package unidad05.hashCode.ejemplo02;

import java.util.Objects;

/**
 * Ejemplo extraído de: https://www.baeldung.com/java-equals-hashcode-contracts
 *
 * El método .hashCode() se utiliza para comparar objetos en estructuras de datos
 * que utilicen tablas hash (HashSet, HashMap, etc.).
 * 
 * Este método devuelve un entero que representa la instancia actual
 * de la clase. Debemos calcular este valor de manera coherente con la
 * definición del método equals(). Es decir, que si equals evalúa unos campos para
 * validar la igualdad con otros objetos, hashCode debe usar los mismos campos para
 * calcular el codigo hash.
 *
 * Java SE define un contrato para el método .hashCode():
 * <ol>
 *     <li>Consistencia interna: el valor de hashCode() solo puede cambiar si cambia una propiedad que está en equals()</li>
 *     <li>Consistencia de igualdad: los objetos que son iguales entre sí deben devolver el mismo código hash.</li>
 *     <li>Colisiones: objetos desiguales pueden tener el mismo código hash.</li>
 * </ol>
 * En los casos donde dos objetos distintos puedan tener el mismo hash, se recurre al método equals para desempatar.
 *
 * @author diego
 */
public class Equipo {
    private String ciudad;
    private String nombre;

    public Equipo(String ciudad, String nombre) {
        this.ciudad = ciudad;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        
        final Equipo otro = (Equipo) o;
        if (!this.ciudad.equals(otro.ciudad)) return false;
        
        return this.nombre.equals(otro.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.ciudad.hashCode();
        hash = 17 * hash + this.nombre.hashCode();
        return hash;
    }
    
    
}

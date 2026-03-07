package unidad06.mvc.ejemplo05.model;

import java.util.Objects;

/**
 *
 * @author diego
 */
public class Persona {
    private static int contador = 1;
    private int id;
    private String nombre;
    private int edad;
    private double altura;
    
    
    public Persona(String n, int e, double a) {
        this.nombre = n;
        this.edad = e;
        this.altura = a;
        

        this.id = contador;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }
    
    
    public String toString() {
        return id + " - " + nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + this.edad;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (Double.doubleToLongBits(this.altura) != Double.doubleToLongBits(other.altura)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    /**
     * Devuelve los datos de la persona como array para insertarlos como
     * fila de una tabla.
     * @return Array con los datos de la persona.
     */
    public Object[] rowData() {
        return new Object[]{nombre, edad, altura};
    }
    
    
}

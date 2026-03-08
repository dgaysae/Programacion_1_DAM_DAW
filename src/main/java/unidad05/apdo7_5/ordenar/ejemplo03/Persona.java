package unidad05.apdo7_5.ordenar.ejemplo03;

/**
 *
 * @author diego
 */
public class Persona implements Comparable {
    private String nombre;
    private int edad;
    private String dni;
    
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return persona.dni.equals(this.dni)
                && this.nombre.equals(persona.nombre)
                && this.edad == persona.edad;
    }

    @Override
    public int hashCode() {
        int resultado = 17;
        final int primo = 13;

        if (nombre != null) {
            resultado = primo * resultado + nombre.hashCode();
        }

        if (dni != null) {
            resultado = primo * resultado + dni.hashCode();
        }

        resultado = primo * resultado + edad;

        return resultado;
    }


    /**
     * Comparamos las personas por su edad, aunque podrían ser por más criterios.
     * @param o the object to be compared.
     * @return si > 0, this es mayor; si = 0 ambos tienen la misma edad; si < 0, this es menor
     */
    @Override
    public int compareTo(Object o) {
        Persona otraPersona = (Persona) o;
        return this.edad - otraPersona.edad;
    }


    public String toString() {
        return "{nombre: " + nombre + "; edad: " + edad + "; dni: " + dni + "}";
    }
}

package unidad05.apdo7_1;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.edad = edad;
        this.nombre = nombre;
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
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null
                || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;

        return dni.equals(persona.dni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }
}

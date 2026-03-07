package unidad06.mvc.ejemplo03.model;

import java.util.Objects;

/**
 *
 * @author diego
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private int edad;

    public Persona(
            String nombre,
            String apellido1,
            String apellido2,
            String dni,
            int edad
    ) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public String getDni() {
        return this.dni;
    }

    public int getEdad() {
        return this.edad;
    }

    public Object[] getDataRow() {
        return new Object[]{
            nombre,
            apellido1,
            apellido2,
            dni,
            edad
        };
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (this == o) {
            return true;
        }

        Persona otraPersona = (Persona) o;
        return this.edad == otraPersona.edad
                && Objects.equals(this.nombre, otraPersona.nombre)
                && Objects.equals(this.apellido1, otraPersona.apellido1)
                && Objects.equals(this.apellido2, otraPersona.apellido2)
                && Objects.equals(this.dni, otraPersona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                dni,
                edad,
                nombre,
                apellido1,
                apellido2
        );
    }
}

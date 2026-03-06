package unidad06.clasesanonimas.ejemplo01;

public class Persona {
    String nombre;
    String apodo;
    String dni;
    String direccion;

    public Persona(String nombre,
                   String apodo,
                   String dni,
                   String direccion) {

        if (datoVacio(nombre)) {
            throw new IllegalArgumentException("Error! Nombre nulo");
        }
        if (datoVacio(dni)) {
            throw new IllegalArgumentException("Error! Dni nulo");
        }
        if (datoVacio(direccion)) {
            throw new IllegalArgumentException("Error! Sin dirección");
        }

        this.nombre = nombre;
        this.apodo = apodo;
        this.dni = dni;
        this.direccion = direccion;
    }

    private static boolean datoVacio(String dato) {
        return dato == null || dato.isBlank();
    }

    @Override
    public String toString() {
        return String.format("""
                - Nombre: %s
                - Apodo: %s
                - Dni: %S
                - Direccion: %s
                """, nombre, apodo, dni, direccion);
    }
}

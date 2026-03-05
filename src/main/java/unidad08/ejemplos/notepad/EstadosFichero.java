package unidad08.ejemplos.notepad;

public enum EstadosFichero {
    FICHERO_ABIERTO("Fichero abierto"),
    FICHERO_GUARDADO("Fichero guardado"),;

    private String descripcion;

    private EstadosFichero(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString() {
        return descripcion;
    }
}

package unidad07.clasesAnonimas.paraOtrasClases;

public class Alumno {
    private String nombre;
    private double notaActividades;
    private double notaExamen;

    public Alumno(String nombre, double notaActividades, double notaExamen) {
        this.nombre = nombre;
        this.notaActividades = notaActividades;
        this.notaExamen = notaExamen;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaActividades() {
        return notaActividades;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    /**
     * Está aprobado si supera el examen.
     * @return
     */
    public boolean aprobado() {
        return notaExamen >= 5;
    }
}

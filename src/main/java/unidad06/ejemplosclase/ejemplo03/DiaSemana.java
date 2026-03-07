package unidad06.ejemplosclase.ejemplo03;

/**
 *
 * @author diego
 */
public enum DiaSemana {
    LUNES(true, "lunes", 'L'),
    MARTES(true, "martes", 'M'),
    MIERCOLES(true, "miércoles", 'X'),
    JUEVES(true, "jueves", 'J'),
    VIERNES(true, "viernes", 'V'),
    SABADO(false, "sábado", 'S'),
    DOMINGO(false, "domingo", 'D');
    
    private boolean esLaborable;
    private String nombre;
    private char abreviatura;
    
    private DiaSemana(boolean esLaborable, String nombre, char abreviatura) {
        this.esLaborable = esLaborable;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }
    
    public boolean esLaborable(){
        return this.esLaborable;
    }
    
    public String nombre() {
        return nombre;
    }
    
    public char abreviatura() {
        return abreviatura;
    }
    
    public String toString() {
        return nombre;
    }
}

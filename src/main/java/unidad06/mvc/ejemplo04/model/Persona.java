package unidad06.mvc.ejemplo04.model;

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
    
    
}

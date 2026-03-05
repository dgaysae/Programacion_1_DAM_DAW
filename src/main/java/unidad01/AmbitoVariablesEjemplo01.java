package unidad01;

/**
 * En esta ocasión vemos que en main no hay ninguna variable.
 * <br/>
 * Desde esa función se llama a dos funciones, pasando a una de ellas la constante 5.
 *
 * @author dgs
 */
public class AmbitoVariablesEjemplo01 {
    
    public static void main(String[] args) {
        
        saludar();
        mostrarAreaCircunferencia(5);
        
    }

    public static void saludar() {
        System.out.println("*******************************");
        System.out.println("*** WELCOME TO THIS PROGRAM ***");
        System.out.println("*******************************");
    }
    
    public static void mostrarAreaCircunferencia(int radio) {
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("Radio de la circunferencia: " + radio);
        System.out.println("Área de la circunferencia: " + area);
    }
}


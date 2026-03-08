package unidad05.enumerados;

/**
 * 
 * @author diego
 */
public class Main01 {
    public static final int NUM_LUNES = 1;
    public static final int NUM_MARTES = 2;
    public static final int NUM_MIERCOLES = 3;
    public static final int NUM_JUEVES = 4;
    public static final int NUM_VIERNES = 5;
    public static final int NUM_SABADO = 6;
    public static final int NUM_DOMINGO = 7;
    
    public static void main(String[] args) {
        int numDiaSemana = 0;
        System.out.printf("Día de la semana %d = %s %n",
                numDiaSemana,
                getNombreDia(numDiaSemana));
    }
    
    public static String getNombreDia(int numDia) {
        switch (numDia) {
            case NUM_LUNES:
                return "Lunes";
            case NUM_MARTES:
                return "Martes";
            case NUM_MIERCOLES:
                return "Miércoles";
            case NUM_JUEVES:
                return "Jueves";
            case NUM_VIERNES:
                return "Viernes";
            case NUM_SABADO:
                return "Sábado";
            case NUM_DOMINGO:
                return "Domingo";
            default:
                return "Nº día incorrecto";
        }
    }
}

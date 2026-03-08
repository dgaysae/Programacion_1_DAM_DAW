package unidad05.enumerados;

/**
 * La diferencia con el ejemplo anterior es que aquí todas las constantes las
 * englobamos en el enum DiasSemana.
 * @see DiasSemana
 * @author diego
 */
public class Main02 {
    public static void main(String[] args) {
        System.out.println(DiasSemana.VIERNES.getNombre());
        System.out.println(DiasSemana.VIERNES.getNombreCorto());
        
        System.out.println("------------");
        for (int i = 0; i < DiasSemana.values().length; i ++) {
            System.out.println(DiasSemana.values()[i]);
        }
        System.out.println("------------");
        for (DiasSemana dia : DiasSemana.values()) {
            System.out.println(dia);
        }
        
        System.out.println(
                getNombreDia(DiasSemana.MARTES)
        );
        
        
    }

    /**
     * @deprecated
     * Este método no sería necesario, ya que podemos obtener el nombre
     * del día mediante el método getNombre() del enum.
     *
     * @param dia Día de la semana a evaluar.
     * @return Nombre del día introducido.
     */
    @Deprecated
    public static String getNombreDia(DiasSemana dia) {
        switch (dia) {
            case LUNES:
                return "Lunes";
            case MARTES:
                return "Martes";
            default:
                return "Error";
        }
    }
}

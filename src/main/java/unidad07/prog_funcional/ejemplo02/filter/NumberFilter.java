package unidad07.prog_funcional.ejemplo02.filter;

/**
 * La intención de esta interfaz es diseñar clases que la implementen para filtrar un número, cada
 * una según su criterio. Todas ellas tendrán en común esta interfaz, que servirá para generalizar.
 */
public interface NumberFilter {
    boolean validar(Integer numero);
}

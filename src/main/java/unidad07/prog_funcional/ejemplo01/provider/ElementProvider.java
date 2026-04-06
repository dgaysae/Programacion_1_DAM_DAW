package unidad07.prog_funcional.ejemplo01.provider;

/**
 * La intención de esta interfaz es diseñar clases que la implementen para proporcionar números, cada
 * una según su criterio. Todas ellas tendrán en común esta interfaz, que servirá para generalizar.
 */
public interface ElementProvider {
    Integer get();
}

package unidad07.prog_funcional.ejemplo04.reduce;

/**
 * Podemos distinguir los tipos de datos de cada operador, por si el algún caso necesitamos hacer operaciones.
 * @param <T> Tipo de dato genérico para el primer argumento.
 * @param <U> Tipo de dato genérico para el segundo argumento.
 * @param <R> Tipo de dato genérico para el retorno.
 */
public interface Reductor<T, U, R> {
    R reduce(T previous, U value);
}

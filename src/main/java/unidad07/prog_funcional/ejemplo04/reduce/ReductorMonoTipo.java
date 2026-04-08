package unidad07.prog_funcional.ejemplo04.reduce;

/**
 * Esta es una especialización de {@link Reductor}, donde el tipo de dato será el mismo para los argumentos de entrada
 * y para el retorno.
 * @param <T>
 */
public interface ReductorMonoTipo<T> extends Reductor<T, T, T>{
}

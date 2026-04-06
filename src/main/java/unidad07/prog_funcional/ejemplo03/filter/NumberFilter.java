package unidad07.prog_funcional.ejemplo03.filter;

/**
 * Usamos genéricos para ampliar los tipos con los que realizar la operación de validar.
 */
public interface NumberFilter<T> {
    boolean validar(T numero);
}

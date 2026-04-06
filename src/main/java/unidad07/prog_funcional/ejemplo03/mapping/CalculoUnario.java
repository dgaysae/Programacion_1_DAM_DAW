package unidad07.prog_funcional.ejemplo03.mapping;

import unidad07.prog_funcional.ejemplo03.mapping.Calculo;

/**
 * Si queremos indicar que la operación se va a realizar con un sólo tipo de datos no hay que repetir el código de
 * {@link unidad07.prog_funcional.ejemplo03.mapping.Calculo}. Sólo hay que heredar de dicho interfaz indicando para él
 * el mismo tipo genérico para entrada y retorno.
 * @param <T>
 */
public interface CalculoUnario<T> extends Calculo<T, T> {
}

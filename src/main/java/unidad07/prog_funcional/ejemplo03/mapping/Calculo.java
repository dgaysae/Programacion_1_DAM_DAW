package unidad07.prog_funcional.ejemplo03.mapping;

/**
 * Con los dos genéricos indicamos que podemos tener dos tipos distintos para el argumento y el retorno.
 * @param <T> Tipo de dato genérico para el argumento.
 * @param <R> Tipo de dato genérico que devolvería el método.
 */
public interface Calculo<T, R> {
    R calcular(T numero);
}

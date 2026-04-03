package unidad07.prog_funcional.ejemplo01.mapping;

/**
 * En lugar de {@link Cuadrado} o {@link Cubo}, podemos hacer una genérica que admita el exponente.
 */
public class Potencia implements Calculo {
    private int exponente;

    public Potencia(int exponente) {
        this.exponente = exponente;
    }

    public Potencia() {
        this(1);
    }

    @Override
    public Integer calcular(Integer numero) {
        return (int) Math.pow(numero, exponente);
    }
}

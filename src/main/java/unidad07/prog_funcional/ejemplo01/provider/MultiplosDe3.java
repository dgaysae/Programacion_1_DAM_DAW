package unidad07.prog_funcional.ejemplo01.provider;

public class MultiplosDe3 implements IntegerProvider {
    private static int next = 3;

    /**
     * Simulamos un pos-acumulador en el método get para que el primer valor ofrecido sea 3.
     * @return Múltiplo de 3.
     */
    @Override
    public Integer get() {
        return (next += 3) - 3;
    }
}

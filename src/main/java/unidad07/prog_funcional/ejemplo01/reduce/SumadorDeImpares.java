package unidad07.prog_funcional.ejemplo01.reduce;

public class SumadorDeImpares implements Reductor {
    @Override
    public Integer reduce(Integer previous, Integer value) {
        return (value % 2 != 0)
                ? previous + value
                : previous;
    }
}

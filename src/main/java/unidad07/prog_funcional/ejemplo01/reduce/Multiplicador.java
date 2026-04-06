package unidad07.prog_funcional.ejemplo01.reduce;

public class Multiplicador implements Reductor {
    @Override
    public Integer reduce(Integer previous, Integer value) {
        return previous * value;
    }
}

package unidad07.prog_funcional.ejemplo03.interfaces;

@FunctionalInterface
public interface Reductor {
    Integer reduce(Integer previous, Integer value);
}

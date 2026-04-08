package unidad07.prog_funcional.ejemplo03.interfaces;

@FunctionalInterface
public interface NumberFilter {
    boolean validar(Integer numero);
}

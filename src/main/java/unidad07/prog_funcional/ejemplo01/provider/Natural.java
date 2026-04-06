package unidad07.prog_funcional.ejemplo01.provider;

public class Natural implements ElementProvider {
    private static int next = 0;

    @Override
    public Integer get() {
        return ++next;
    }
}

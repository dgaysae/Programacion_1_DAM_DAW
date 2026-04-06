package unidad07.prog_funcional.ejemplo01.provider;

public class InitializeTo implements ElementProvider {
    private int initNumber;

    public InitializeTo(int initNumber) {
        this.initNumber = initNumber;
    }

    @Override
    public Integer get() {
        return initNumber;
    }
}

package unidad07.prog_funcional.ejemplo01.provider;

import unidad07.prog_funcional.ejemplo01.mapping.Calculo;

public class InitializeTo implements IntegerProvider {
    private int initNumber;

    public InitializeTo(int initNumber) {
        this.initNumber = initNumber;
    }

    @Override
    public Integer get() {
        return initNumber;
    }
}

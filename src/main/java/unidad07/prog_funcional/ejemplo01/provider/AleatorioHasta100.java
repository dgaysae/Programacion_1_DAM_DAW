package unidad07.prog_funcional.ejemplo01.provider;

import java.util.Random;

public class AleatorioHasta100 implements ElementProvider {
    @Override
    public Integer get() {
        return (new Random()).nextInt(101);
    }
}

package unidad07.prog_funcional.ejemplo01;

public class NumeroMultiploDe5 implements NumberFilter {
    @Override
    public boolean validar(Integer numero) {
        return numero % 5 == 0;
    }
}

package unidad07.prog_funcional.ejemplo01;

public class NumeroMultiploDe7 implements NumberFilter {
    @Override
    public boolean validar(Integer numero) {
        return numero % 7 == 0;
    }
}

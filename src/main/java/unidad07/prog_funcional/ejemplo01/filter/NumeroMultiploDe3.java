package unidad07.prog_funcional.ejemplo01.filter;

public class NumeroMultiploDe3 implements NumberFilter {
    @Override
    public boolean validar(Integer numero) {
        return numero % 3 == 0;
    }
}

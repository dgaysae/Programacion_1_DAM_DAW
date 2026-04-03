package unidad07.prog_funcional.ejemplo01.filter;

public class NumeroImpar implements NumberFilter {
    @Override
    public boolean validar(Integer numero) {
        return numero % 2 != 0;
    }
}

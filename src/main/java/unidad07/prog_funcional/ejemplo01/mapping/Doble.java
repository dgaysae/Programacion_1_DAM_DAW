package unidad07.prog_funcional.ejemplo01.mapping;

public class Doble implements Calculo {
    @Override
    public Integer calcular(Integer numero) {
        return numero * 2;
    }
}

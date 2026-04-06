package unidad07.genericos.ejemplo01;

import java.util.HashSet;
import java.util.Set;

public class Contabilidad<T extends ProductoFinanciero> {
    Set<T> elementosContables = new HashSet<>();

    public void add(T elementoContable) {
        elementosContables.add(elementoContable);
    }

    public double balance() {
        double saldo = 0;
        for(T e : elementosContables) {
            saldo += e.getSaldo();
        }
        return saldo;
    }
}

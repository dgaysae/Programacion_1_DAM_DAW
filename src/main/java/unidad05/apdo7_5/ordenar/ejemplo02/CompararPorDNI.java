package unidad05.apdo7_5.ordenar.ejemplo02;

import java.util.Comparator;

public class CompararPorDNI implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDni().compareTo(o2.getDni());
    }
}

package unidad05.apdo7_5.ordenar.ejemplo02;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}

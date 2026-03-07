package unidad06.mvc.ejemplo02.model;

import java.util.ArrayList;

public class Personas {
    private ArrayList<Persona> personas;
    
    public Personas() {
        personas = new ArrayList<Persona>();
    }
    
    public ArrayList<Persona> getPersonas() {
        return (ArrayList<Persona>) personas.clone();
    }
    
    public Persona getPersonaById(int id) {
        if (id < 0 || id >= personas.size()) {
            return null;
        }
        return personas.get(id);
    }
    
    public void connectBBDD() {
        for (int i = 0; i < 10; i++) {
            personas.add(new Persona("Nombre" + i, "Apellidos " + i, (i + 10*2)));
        }
    }

    public static String[] getColumnNames() {
        return new String[]{"Nombre", "Apellidos", "Edad"};
    }
}

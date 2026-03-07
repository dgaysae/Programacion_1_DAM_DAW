package unidad06.mvc.ejemplo05.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class PersonasModel {
    private List<Persona> personas;

    public PersonasModel() {
        personas = generate();
    }
    
    public List<Persona> select() {
        return personas;
    }
    
    public void insert(Persona p) {
        personas.add(p);
    }
    
    public String[] getColumns() {
        return new String[]{"Nombre", "Edad", "Altura"};
    }
        
    private List<Persona> generate() {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Anselmo", 20, 1.80));
        listaPersonas.add(new Persona("Fran", 20, 1.80));
        listaPersonas.add(new Persona("Pepe", 32, 1.75));
        listaPersonas.add(new Persona("José", 42, 2.10));
        listaPersonas.add(new Persona("África", 77, 1.80));
        listaPersonas.add(new Persona("Joaquín", 52, 1.78));
        listaPersonas.add(new Persona("Jordan", 85, 1.98));
        listaPersonas.add(new Persona("Iván", 44, 1.78));
        listaPersonas.add(new Persona("Joel", 54, 1.57));
        listaPersonas.add(new Persona("Lucas", 52, 1.78));
        listaPersonas.add(new Persona("Perales", 85, 1.98));
        listaPersonas.add(new Persona("Ángel", 44, 1.78));
        listaPersonas.add(new Persona("Rafa", 54, 1.57));
        listaPersonas.add(new Persona("Miguel", 85, 1.98));
        
        return listaPersonas;
    }

}

package unidad06.mvc.ejemplo03.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author diego
 */
public class Personas {

    ArrayList<Persona> personas = new ArrayList<>();

    public Personas() {
        loadData();
    }
    
    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    
    public Persona getPersona(int index) {
        return personas.get(index);
    }
    
    public String[] getPersonaColumnNames() {
        return new String[]{
            "Nombre", "Apellido1", "Apellido2", "DNI", "Edad"
        };
    }
    
    public void remove(int index) {
        personas.remove(index);
    }

    private void loadData() {
        Random random = new Random();
        List<String> nombres = Arrays.asList("José", "Juan", "Bel",
                "Stefan", "Joaquín", "Miguel",
                "Francisco", "Antonio", "Diego");

        List<String> apellidos = Arrays.asList("López", "Pérez", "Sánchez",
                "Martínez", "Peláez", "Sáez",
                "Mínguez", "Prieto", "Guerrero");
        
        for (int i = 0; i < 20; i++) {
            personas.add(
                    new Persona(
                            nombres.get(random.nextInt(nombres.size())),
                            apellidos.get(random.nextInt(apellidos.size())),
                            apellidos.get(random.nextInt(apellidos.size())),
                            getRandomDni(),
                            random.nextInt(15, 99)
                    )
            );
        }
        System.out.println("PERSONAS: " + personas);
    }
    
    private String getRandomDni() {
        Random random = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String dni = Integer.toString(random.nextInt(10000000, 99999999));
        int posicionLetra = random.nextInt(0, letras.length());
        Character letra = letras.charAt(posicionLetra);
        return dni + letra;
    }
}

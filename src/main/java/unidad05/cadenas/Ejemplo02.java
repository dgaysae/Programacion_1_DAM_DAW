package unidad05.cadenas;

/**
 *
 * @author diego
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        String saludo = "Hola";
        System.out.println(saludo.length());
        System.out.println(saludo);
        System.out.println(saludo.concat(", caracola!"));
        System.out.println(saludo);
        
        String c1 = new String("hola");
        String c2 = new String("hola");
        
        if (c1.equals(c2)) {
            System.out.println("Son iguales!!!!!!!!!!!!!!");
        }
        
        System.out.println("A".compareTo("B"));
        System.out.println("rwx".compareTo("Ahora"));
        System.out.println("B".compareTo("A"));
        
        System.out.print("         hola, caracola          ".trim().replace('o', 'X'));
        System.out.println("<-");
        
        
        String texto = "hola adiós|pepe juan pito jp";
        String[] cachos = texto.split("\\|");
        for(String cacho : cachos) {
            System.out.println(cacho);
        }
        
        
        StringBuilder texto1 = new StringBuilder("asdf");
        System.out.println(texto1);
        texto1.append(" esto es nuevo");
        System.out.println(texto1);
    }
}

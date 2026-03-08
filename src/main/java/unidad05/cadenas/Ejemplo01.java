package unidad05.cadenas;

/**
 * <p>
 *     En este apartado se estudian las cadenas de texto: String vs StringBuffer vs StringBuilder
 * </p>
 * <p>
 *     String es inmutable. En cambio StringBuffer y StringBuilder no. Ambos son similares, pero  a StringBuilder pero
 *     StringBuffer es más seguro que StringBuilder cuando se usan con hilos (threads).
 * </p>
 * <p>
 *     Por ahora, como los hilos no se verán hasta el curso que viene, vamos a usar preferiblemente StringBuilder. Hasta
 *     entonces es indiferente a usar StringBuffer.
 * </p>
 * @author diego
 */
public class Ejemplo01 {
    public static void main(String[] args) {
        /*
        String es inmutable. La concatenación es, en realidad, la creación de otra cadena, desreferenciando la
        anterior. Esto, cuando se hacen muchas, tiene un coste añadido para el garbage collector que se puede
        evitar usando StringBuilder/StringBuffer.
        */
        String texto = "hola"; // {'h', 'o', 'l', 'a'}
        
        System.out.println("String----------");
        
        texto += ", Pepe";
        
        System.out.println(texto);
        System.out.println("StringBuffer ----------");
        
        StringBuffer texto2 = new StringBuffer("hola");
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        // Añadimos texto al final:
        texto2.append(", Pepe");
        
        System.out.println(texto2);
        System.out.println("----------");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        
        System.out.println("----------");
        // Añadimos texto al final:
        texto2.append("1 2 3 4 5 ");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        System.out.println("----------");

        // Añadimos texto al final:
        texto2.append("6 ");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());

        System.out.println("----------");
        
        texto2.delete(0, 5);
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        System.out.println("----------");
        
        texto2.insert(0, "hola,");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        System.out.println("----------");
        
        texto2.reverse();
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
    }
}

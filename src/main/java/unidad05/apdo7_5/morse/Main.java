package unidad05.apdo7_5.morse;

/**
 * 
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        
        Morse m1 = new Morse();
        
        m1.descifrar("...- .- .. ...   .-   -- --- .-. .. .-.");
        m1.cifrar("vais a morir");
        
    }
}

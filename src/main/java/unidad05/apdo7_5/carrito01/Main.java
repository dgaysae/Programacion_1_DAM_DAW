package unidad05.apdo7_5.carrito01;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo básico de implementación de un carrito de compra online.
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        
        HashMap<Producto, Integer> carrito = new HashMap<>();
        
        carrito.put(
                new Producto("Casita de muñecas", "Famosa 001", "Famosa", 100),
                1
        );
        carrito.put(
                new Producto("bicicleta", "explorer", "bh", 1200),
                1
        );
        
        for(Map.Entry<Producto, Integer> productoEnCarrito : carrito.entrySet()) {
            System.out.println("Producto: " + productoEnCarrito.getKey());
            System.out.println("Nº de artículos: " + productoEnCarrito.getValue());
            System.out.println("-----");
        }
        
        System.out.println("------------------------------------");
        Producto p1 = new Producto("Casita de muñecas", "Famosa 001", "Famosa", 100);
        if (carrito.containsKey(p1)) {
            carrito.put(p1, carrito.get(p1) + 1);
        }
        else {
            carrito.put(p1, 1);
        }
        for(Map.Entry<Producto, Integer> productoEnCarrito : carrito.entrySet()) {
            System.out.println("Producto: " + productoEnCarrito.getKey());
            System.out.println("Nº de artículos: " + productoEnCarrito.getValue());
            System.out.println("-----");
        }
        
        
        
//        Producto p1 = new Producto("Casita de muñecas", "Famosa 001", "Famosa", 100);
//        Producto p2 = new Producto("bicicleta", "explorer", "bh", 1200);
        
    }
}

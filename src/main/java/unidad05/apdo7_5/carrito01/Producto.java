package unidad05.apdo7_5.carrito01;

/**
 * 
 * @author diego
 */
public class Producto {
    private String nombre;
    private String modelo;
    private String marca;
    private double precio;
    
    public Producto(
            String nombre,
            String modelo,
            String marca,
            double precio)
    {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto{nombre: " + nombre
                + ", modelo: " + modelo
                + ", marca: " + marca
                + ", precio: " + precio + "}";
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        
        Producto producto = (Producto) o;
        
        return this.nombre.equals(producto.nombre)
                && this.marca.equals(producto.marca)
                && this.modelo.equals(producto.modelo);
    }
    
    @Override
    public int hashCode() {
        int resultado = 17;
        int primo = 23;
        
        if (nombre != null) {
            resultado = resultado * primo + nombre.hashCode();
        }
        
        if (marca != null) {
            resultado = resultado * primo + marca.hashCode();
        }
        
        if (modelo != null) {
            resultado = resultado * primo + modelo.hashCode();
        }
        
        return resultado;
    }
}

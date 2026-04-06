package unidad07.genericos.ejemplo01;

public class SimuladorBeneficio<T extends ProductoFinanciero> {
    private T producto;

    public SimuladorBeneficio(T producto) {
        this.producto = producto;
    }

    public void imprimirProyeccion() {
        // Gracias a 'extends', Java sabe que 'producto' tiene el método calcularInteres()
        double interes = producto.calcularInteres();
        System.out.println("Titular: " + producto.getTitular());
        System.out.println("Beneficio estimado: " + interes + "€");
    }
}

package unidad07.genericos.ejemplo01;

public class Cuenta extends ProductoFinanciero {
    public Cuenta(String numeroId, String titular, double saldo) {
        super(numeroId, titular, saldo);
    }

    @Override
    public double calcularInteres() {
        return saldo * 0.01;
    }
}

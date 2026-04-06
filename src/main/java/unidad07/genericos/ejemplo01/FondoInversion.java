package unidad07.genericos.ejemplo01;

public class FondoInversion extends ProductoFinanciero {

    public FondoInversion(String numeroId, String titular, double saldo) {
        super(numeroId, titular, saldo);
    }

    @Override
    public double calcularInteres() {
        return saldo * 0.05;
    }
}

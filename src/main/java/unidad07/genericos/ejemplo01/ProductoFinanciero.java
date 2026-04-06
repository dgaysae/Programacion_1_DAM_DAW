package unidad07.genericos.ejemplo01;

public abstract class ProductoFinanciero {
    private String numeroId;
    private String titular;
    protected double saldo;

    public ProductoFinanciero(String numeroId, String titular, double saldo) {
        this.numeroId = numeroId;
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract double calcularInteres();

    public String getTitular() {
        return titular;
    }

    public String getNumeroId() {
        return numeroId;
    }

    public double getSaldo() {
        return saldo;
    }
}

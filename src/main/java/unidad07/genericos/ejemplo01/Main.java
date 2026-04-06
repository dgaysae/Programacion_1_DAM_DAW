package unidad07.genericos.ejemplo01;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("ES00000000001", "Anselmo Pérez", 1234.56);
        Cuenta c2 = new Cuenta("ES00000000001", "Francisca Solez", -1000000);
        FondoInversion fi1 = new FondoInversion("FI00000000001", "Benancio López", 4434321.98);

        Contabilidad contabilidad = new Contabilidad();
        contabilidad.add(c1);
        System.out.println("Balance inicial: " + contabilidad.balance());

        contabilidad.add(c2);
        System.out.println("Balance de cuentas: " + contabilidad.balance());

        contabilidad.add(fi1);
        System.out.println("Balance final: " + contabilidad.balance());

    }
}

package unidad06.clasesanonimas.ejemplo02;

/**
 * Otro ejemplo de clases anónimas.
 * Supongamos que, en lugar de una suma o resta, que son operaciones triviales, queremos hacer
 * algo más complejo pero sólo lo queremos implementar una vez y sólo aquí, en este código.
 *
 * No es necesario, por tanto, hacer una clase para eso en un fichero .java. Lo hacemos aquí y listo.
 */
public class Main {
    public static void main(String[] args) {
        Calculadora sumar = new Calculadora() {
            @Override
            public double operar(double num1, double num2) {
                return num1 + num2;
            }
        };

        Calculadora restar = new Calculadora() {
            @Override
            public double operar(double num1, double num2) {
                return num1 - num2;
            }
        };

        double suma = sumar.operar(34, 67);
        double resta = restar.operar(34, 67);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
}

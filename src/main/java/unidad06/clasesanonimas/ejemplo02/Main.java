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
        /*
        Instanciamos un objeto sumar con una clase anónima (no existe).
        Al indicar "new Calculadora()" realmente estamos diciendo que el objeto
        implementa la interfaz Calculadora.
         */
        Calculadora sumar = new Calculadora() {
            @Override
            public double operar(double... numeros) {
                double suma = 0.0;
                for(double numero : numeros) {
                    suma += numero;
                }
                return suma;
            }
        };

        Calculadora restar = new Calculadora() {
            @Override
            public double operar(double... numeros) {
                if (numeros.length == 0) {
                    return 0.0;
                }
                double resta = numeros[0];
                for (int i = 1; i < numeros.length; i++) {
                    resta -= numeros[i];
                }
                return resta;
            }
        };

        double suma = sumar.operar(34, 11, 22);
        double resta = restar.operar(34, 11, 2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
}

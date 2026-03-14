package unidad07.clasesInternas;

import unidad07.clasesAnonimas.paraInterfaces.ejemplo01.Boton;
import unidad07.clasesAnonimas.paraInterfaces.ejemplo01.EventoBoton;

public class Main {
    public static void main(String[] args) {

        // ************************************************
        // Clases internas (no estáticas)
        // ************************************************
        Coche coche1 = new Coche("Mercedes", 220);
        coche1.darContacto();
        coche1.mostrarInformacionMotor();
        coche1.quitarContacto();

        coche1.mostrarMotor();


        // ************************************************
        // Clases anidadas (estáticas)
        // ************************************************
        System.out.println(Calculadora.Operaciones.sumar(3, 2, 9, 8));
        System.out.println(Calculadora.Operaciones.restar(3, 2, 9, 8));
        System.out.println(Calculadora.getNumOperaciones());


        // ************************************************
        // Clases anónimas
        // ************************************************
        Boton boton = new Boton();
        boton.setEvento(new EventoBoton() {
            @Override
            public void onClick() {
                System.out.println("¡Botón pulsado!");
            }
        });
    }
}

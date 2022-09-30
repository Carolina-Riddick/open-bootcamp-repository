/* Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto. */
package Exercises;

import java.util.ArrayList;

public class Exercise02 {

    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.numeroPuertas();
        System.out.println("La cantidad de puertas es de : ");
        System.out.println(miCoche.puertas);

    }

    public static class Coche {

        int puertas = 0;

        public void numeroPuertas() {
            this.puertas++;
        }

    }

}

/* Crear una función con tres parámetros que sean números que se suman entre sí. 
Llamar a la función en el main y darle valores. */
package Exercises;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = 10, b = 23, c = 5, resultado;
        resultado = suma(10, 23, 5);
        System.out.println("El resultado es : " + resultado);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

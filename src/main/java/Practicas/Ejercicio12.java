package Practicas;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner comparacion = new Scanner(System.in);

        System.out.println("Escribe una palabra");
        String palabra1 = comparacion.next();

        System.out.println("Escribe otra palabra");
        String palabra2 = comparacion.next();

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras no son iguales");


        }
    }
}

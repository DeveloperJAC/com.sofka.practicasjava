package Practicas;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        int numElegido;

        int numero = 0;


        do {

            System.out.println("Pulse 1 para imprimir los números pares o"

                    + " pulse 2 para imprimir los números impares: ");

            numElegido = miScanner.nextInt();

            if (numElegido == 1) {

                for(numero = 0; numero <= 100; numero++) {
                    if (numero % 2 == 0) {
                        System.out.println(numero);

                    }
                }

            }
            if (numElegido == 2) {

                for(numero = 0; numero <= 100; numero++) {
                    if (numero % 2 != 0) {
                        System.out.println(numero);
                    }

                }

            }

        } while (numElegido != 1 && numElegido != 2);

    }
    }


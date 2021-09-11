package Practicas;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner frase = new Scanner(System.in);
        String fraserecibida = frase.nextLine();

        System.out.println("La cadena tiene " + fraserecibida.length() + " caracteres");

        int contador=0;
        for (int i=0;i<fraserecibida.length();i++){

            if(fraserecibida.charAt(i)=='a' ||
                    fraserecibida.charAt(i)=='e' ||
                    fraserecibida.charAt(i)=='i' ||
                    fraserecibida.charAt(i)=='o' ||
                    fraserecibida.charAt(i)=='u'){
                contador++;
            }
        }
        System.out.println("Y su frace tiene "+contador+" vocales");
    }

}

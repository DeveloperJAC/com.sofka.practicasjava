package Practicas;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner frase = new Scanner(System.in);
        String rcb = frase.nextLine();

        String modfrase = rcb.replace(" ","");

        System.out.println(modfrase);




    }
}

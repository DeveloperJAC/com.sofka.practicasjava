package Practicas;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero;
        Scanner mn = new Scanner(System.in);
        do{
            System.out.println("Escriba un numero mayor que 0");
            numero=mn.nextInt();
        }while(numero<=0);

        System.out.println(numero);
    }

}



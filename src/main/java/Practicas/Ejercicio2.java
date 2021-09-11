package Practicas;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int num1, num2;

        System.out.println("Ingrese un numero");
        num1 = numero.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = numero.nextInt();

        if (num1>=num2){
            if(num1==num2){
                System.out.println("Los numeros "+num1+" y "+num2+" son iguales");
            }else{
                System.out.println("El número "+num1+" es mayor que el número "+num2);
            }
        }else{
            System.out.println("El número "+num1+" es menor que el número "+num2);
        }
    }
}

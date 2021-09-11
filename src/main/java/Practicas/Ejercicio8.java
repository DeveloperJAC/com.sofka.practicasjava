package Practicas;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sem = new Scanner(System.in);
        System.out.println("Escriba un dia de la semana ");
        String dia = sem.next();

        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es fin de semana");
            default:
                System.out.println("Escriba un dia de la semana ");

        }
    }
}

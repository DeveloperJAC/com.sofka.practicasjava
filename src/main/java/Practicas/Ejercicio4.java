package Practicas;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double numero;

        System.out.println("Ingresar el precio de un producto");
        numero = num.nextDouble();

        double iva = numero * 0.21;

        double preciofinal = numero + iva;

        System.out.println("El precio final con iva es de : " +preciofinal);
    }
}

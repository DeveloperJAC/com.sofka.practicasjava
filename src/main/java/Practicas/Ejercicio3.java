//Calcular el àrea de un círculo

package Practicas;

import java.util.Scanner;

public class Ejercicio3 {
    public static  void main(String[] args){
        Scanner ac = new Scanner(System.in);
        System.out.println("ingrese el radio del circulo");
        double radio = ac.nextDouble();
        double area = Math.PI*Math.pow(radio, 2);

        System.out.println("El radio del circulo es "+area);

        }

    }


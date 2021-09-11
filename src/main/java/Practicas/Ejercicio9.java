package Practicas;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String cadena="La sonrisa sera la mejor arma contra la tristeza";
        String modCadena = cadena.replace('a', 'e');
        System.out.println("A esta frase," + modCadena + ", adicione otra que usted desee");

        Scanner frase = new Scanner(System.in);
        String adicion = frase.next();
        System.out.println("la frase quedo asi: " +modCadena + " " + adicion);


    }
}

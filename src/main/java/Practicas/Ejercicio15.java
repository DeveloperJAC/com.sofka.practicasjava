package Practicas;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("A continuacion vera un menu Cinematografica ");
        Scanner pl = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do{
            System.out.println("1. NUEVO ACTOR");
            System.out.println("2. BUSCAR ACTOR");
            System.out.println("3. ELIMINAR ACTOR");
            System.out.println("4. MODIFICAR ACTOR");
            System.out.println("5. VER TODOS LOS ACTORES");
            System.out.println("6. VER PELICULAS DE LOS ACTORES");
            System.out.println("7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8. SALIR");
            System.out.println("Escribe una de las opciones");
            opcion = pl.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5");
                    break;
                case 6:
                    System.out.println("Has seleccionado la opcion 6");
                    break;
                case 7:
                    System.out.println("Has seleccionado la opcion 6");
                    break;
                case 8:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 8");
            }
        }
        while(!salir);
    }
}

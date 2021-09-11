package Practicas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio13 {
    public static void main(String[] args) {

        Date fecha = new Date();
        DateFormat horayfecha = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        System.out.println("Hora y fecha: "+horayfecha.format(fecha));
    }
}

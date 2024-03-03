package org.CCristian.DateTime.Ejemplo;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ejemplo_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("\t\t\t\tLocalDateTime.now()");
        System.out.println("fechaTiempo = " + fechaTiempo);

        LocalDateTime fechaTiempo_2 = LocalDateTime.of(2020, Month.DECEMBER, 24, 20, 45, 59);
        System.out.println("\n\t\t\t\tLocalDateTime.of()");
        System.out.println("fechaTiempo_2 = " + fechaTiempo_2);

        LocalDateTime fechaTiempo_3 = LocalDateTime.parse("2020-12-25T21:45:59.614025900");
        System.out.println("\n\t\t\t\tLocalDateTime.parse()");
        System.out.println("fechaTiempo_3 = " + fechaTiempo_3);

         LocalDateTime fechaTiempo_4 = fechaTiempo.plusDays(1).plusHours(2);
        System.out.println("\n\t\t\t\tfechaTiempo.plusDays(1).plusHours(2)");
        System.out.println("fechaTiempo = " + fechaTiempo);
        System.out.println("fechaTiempo_4 = " + fechaTiempo_4);
        fechaTiempo_4 = fechaTiempo.minusHours(5);
        System.out.println("\n\t\t\t\tfechaTiempo.minusHours(5)");
        System.out.println("fechaTiempo = " + fechaTiempo);
        System.out.println("fechaTiempo_4 = " + fechaTiempo_4);

        Month mes = fechaTiempo.getMonth();
        int dia = fechaTiempo.getDayOfMonth();
        int anio = fechaTiempo.getYear();
        System.out.println("\n\tfechaTiempo.getMonth() - fechaTiempo.getDayOfMonth() - fechaTiempo.getYear()");
        System.out.println("mes = " + mes);
        System.out.println("mes = " + mes.getDisplayName(TextStyle.FULL, Locale.getDefault()).toUpperCase());
        System.out.println("dia = " + dia);
        System.out.println("año = " + anio);

        System.out.println("\n\t\t\t\tDateTimeFormatter");
        System.out.println("fechaTiempo = " + fechaTiempo);
        String formato_1 = fechaTiempo.format(DateTimeFormatter.ISO_DATE);
        System.out.println("ISO_DATE ---> formato_1 = " + formato_1);
        formato_1 = fechaTiempo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("ISO_LOCAL_DATE_TIME ---> formato_1 = " + formato_1);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        String formato_2 = fechaTiempo.format(df);
        System.out.println("fechaTiempo.format(df) ---> formato_2 = " + formato_2);
        String formato_3 = df.format(fechaTiempo);
        System.out.println("formato_3 = " + formato_3);
    }
}

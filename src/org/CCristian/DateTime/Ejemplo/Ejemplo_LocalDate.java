package org.CCristian.DateTime.Ejemplo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Ejemplo_LocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("LocalDate.now ---> fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2020, 1, 25);
        /*Formato fecha (AÑO - MES - DIA)*/
        System.out.println("\nLocalDate.of(200, 1, 25) ---> fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2020, Month.NOVEMBER, 11);
        System.out.println("\nLocalDate.of(2020, Month.NOVEMBER, 11) ---> fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2020-02-01");
        System.out.println("\nLocalDate.pase(\"2020-02-01\") ---> fechaActual = " + fechaActual);

        LocalDate diaDeMañana = LocalDate.now().plusDays(1);
        System.out.println("\nLocalDate.now().plusDays ---> diaDeMañana = " + diaDeMañana);

        LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
        System.out.println("\nLocalDate.now().minusMonths ---> mesAnteriorMismoDia = " + mesAnteriorMismoDia);

        mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("\nLocalDate.now().minus(1, ChronoUnit.MONTHS) ---> mesAnteriorMismoDia = " + mesAnteriorMismoDia);

        DayOfWeek diaDeLaSemana = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("\nLocalDate.parse(\"2020-11-11\").getDayOfWeek() ---> diaDeLaSemana = " + diaDeLaSemana);
        diaDeLaSemana = LocalDate.now().getDayOfWeek();
        System.out.println("LocalDate.now().getDayOfWeek() ---> diaDeLaSemana = " + diaDeLaSemana);

        int diaDelMes = LocalDate.of(2020,11,11).getDayOfMonth();
        System.out.println("\nLocalDate.of(2020,11,11).getDayOfMonth() ---> diaDelMes = " + diaDelMes);
        diaDelMes = LocalDate.now().getDayOfMonth();
        System.out.println("LocalDate.of().getDayOfMonth() ---> diaDelMes = " + diaDelMes);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("\nLocalDate.now().isLeapYear() ---> esBisiesto = " + esBisiesto);
        esBisiesto = LocalDate.of(2019, 11, 11).isLeapYear();
        System.out.println("LocalDate.of(2019, 11, 11).isLeapYear() ---> esBisiesto = " + esBisiesto);

        System.out.println("\n================================Comparando Fechas================================");

        boolean esAntes = LocalDate.of(2020, 11, 11).isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("LocalDate.of(2020-11-11).isBefore(LocalDate.parse(2020-11-10)) ---> esAntes = " + esAntes);
        esAntes = LocalDate.now().isBefore(LocalDate.parse("2025-11-11"));
        System.out.println("LocalDate.now().isBefore(LocalDate.parse(2025-11-11)) ---> esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2020-11-11").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("\nLocalDate.parse(2020-11-11).isAfter(LocalDate.parse(2020-11-10)) ---> esDespues = " + esDespues);
        esDespues = LocalDate.now().isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("LocalDate.now().isAfter(LocalDate.parse(2020-11-10)) ---> esDespues = " + esDespues);
        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("LocalDate.now().isAfter(LocalDate.now().minusDays(1)) ---> esDespues = " + esDespues);

        System.out.println("\n================================Obtener parámetros de las fechas================================");

        LocalDate fechaActual_2 = LocalDate.now();
        System.out.println("fechaActual_2 = " + fechaActual_2);
        System.out.println("fechaActual_2.getDayOfMonth() ---> Día = " + fechaActual_2.getDayOfMonth());
        System.out.println("fechaActual_2.getMonth() ---> Mes = " + fechaActual_2.getMonth());
        System.out.println("fechaActual_2.getYear() ---> Año = " + fechaActual_2.getYear());
        System.out.println("fechaActual_2.getDayOfYear() ---> Día del año = " + fechaActual_2.getDayOfYear());
        System.out.println("fechaActual_2.getEra() ---> Era = " + fechaActual_2.getEra());

        System.out.println("\n================================Obtener parámetros en ESPAÑOL de las fechas================================");
        
        Month mes = LocalDate.now().getMonth();
        System.out.println("mes = " + mes);
        System.out.println("mes.getValue() ---> N° del mes = " + mes.getValue());
        System.out.println("mes.getDisplayName(TextStyle.FULL, Locale.getDefault()).toUpperCase() ---> mes en ESPAÑOL = " + mes.getDisplayName(TextStyle.FULL, Locale.getDefault()).toUpperCase());

        DayOfWeek dia = LocalDate.now().getDayOfWeek();
        System.out.println("\ndia = " + dia);
        System.out.println("dia.getValue() ---> N° del dia = " + dia.getValue());
        System.out.println("dia.getDisplayName(TextStyle.FULL, Locale.getDefault()).toUpperCase() ---> dia en ESPAÑOL = " + dia.getDisplayName(TextStyle.FULL, Locale.getDefault()).toUpperCase());
    }
}

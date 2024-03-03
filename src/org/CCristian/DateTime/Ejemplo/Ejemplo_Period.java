package org.CCristian.DateTime.Ejemplo;

import java.time.LocalDate;
import java.time.Period;

public class Ejemplo_Period {
    public static void main(String[] args) {

        LocalDate fecha_1 = LocalDate.of(2011, 9, 23);
        LocalDate fecha_2 = LocalDate.of(2020, 11, 25);

        Period period = Period.between(fecha_1, fecha_2);

        System.out.println("\t\t\tPeriodo entre fecha_1 y fecha_2");
        System.out.println("fecha_1 = " + fecha_1);
        System.out.println("fecha_2 = " + fecha_2);
        System.out.println("period = " + period);
        System.out.println("period.getYears() = " + period.getYears());
        System.out.println("period.getMonths() = " + period.getMonths());
        System.out.println("period.getDays() = " + period.getDays());
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d días",
                fecha_1, fecha_2, period.getYears(), period.getMonths(), period.getDays());

        LocalDate fecha_3 = fecha_2.withMonth(12).withDayOfMonth(28);
        period = Period.between(fecha_1, fecha_3);
        System.out.println("\n\n\t\t\tPeriodo entre fecha_1 y fecha_3");
        System.out.println("fecha_1 = " + fecha_1);
        System.out.println("fecha_2 = " + fecha_3);
        System.out.println("period = " + period);
        System.out.println("period.getYears() = " + period.getYears());
        System.out.println("period.getMonths() = " + period.getMonths());
        System.out.println("period.getDays() = " + period.getDays());
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d días",
                fecha_1, fecha_3, period.getYears(), period.getMonths(), period.getDays());
    }
}

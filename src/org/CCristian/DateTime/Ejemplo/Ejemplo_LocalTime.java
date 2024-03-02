package org.CCristian.DateTime.Ejemplo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ejemplo_LocalTime {
    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println("ahora = " + ahora);
        System.out.println("ahora.getHour() ---> Hora = " + ahora.getHour());
        System.out.println("ahora.getMinute() ---> Minutos = " + ahora.getMinute());
        System.out.println("ahora.getSecond() ---> Segundos = " + ahora.getSecond());

        LocalTime seisConTreinta = LocalTime.of(18, 30, 59);
        System.out.println("\nLocalTime.of(18, 30, 59) ---> seisConTreinta = " + seisConTreinta);
        seisConTreinta = LocalTime.parse("18:30");
        System.out.println("LocalTime.parse(\"18:30\") ---> seisConTreinta = " + seisConTreinta);


        LocalTime sieteConTreinta = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println("\nLocalTime.of(6, 30).plus(1, ChronoUnit.HOURS) ---> sieteConTreinta = " + sieteConTreinta);

        boolean esAnterior = LocalTime.of(6, 30, 59).isBefore(LocalTime.parse("07:30"));
        System.out.println("\nLocalTime.of(6, 30, 59).isBefore(LocalTime.parse(\"07:30\"))");
        System.out.println("esAnterior = " + esAnterior);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("\nDateTimeFormatter.ofPattern(\"hh:mm:ss a\")");
        System.out.println("ahora.format(df): " + ahora.format(df));
        System.out.println("seisConTreinta.format(df): " + seisConTreinta.format(df));

        String ahoraFormateado = df.format(ahora);
        System.out.println("ahora = " + ahora);
        System.out.println("df.format(ahora)");
        System.out.println("ahoraFormateado = " + ahoraFormateado);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        System.out.println("\nmax = " + max);
        System.out.println("min = " + min);
    }
}

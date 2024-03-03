package org.CCristian.DateTime.Ejemplo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Ejemplo_ZonedDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaLocal = LocalDateTime.now();
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal,newYork);
        System.out.println("zonaNy = " + zonaNy);

        System.out.println("\t\t\tHorario NewYork ---> Horario Madrid");
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid);
        System.out.println("zonaMadrid = " + zonaMadrid);

        System.out.println("\n\t\t\tVuelo NewYork ---> Madrid");
        ZonedDateTime zonaMadrid_2 = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("Horario de partida en NewYork: " + zonaNy);
        System.out.println("Horario de partida en NewYork: " + zonaNy.getHour());
        System.out.println("Horario de llegada en Madrid: " + zonaMadrid_2);
        System.out.println("Horario de llegada en Madrid: " + zonaMadrid_2.getHour());

        System.out.println("\n\t\t\tDateTimeFormatter.ofPattern");
        LocalDateTime fechaLocal_2 = LocalDateTime.parse("2021/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        System.out.println("fechaLocal_2 = " + fechaLocal_2);

        System.out.println("\n\t\t\tDetalles del viaje a España:");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM, yyyy");
        zonaNy = ZonedDateTime.of(fechaLocal_2,newYork);
        System.out.println("Partida NY: " + f.format(zonaNy));
        System.out.println("LLegada a Madrid: " + f.format(zonaMadrid_2));

        System.out.println("\n\t\t\tUTC");
        ZonedDateTime zonaNy_UTC = ZonedDateTime.of(fechaLocal_2, ZoneId.of("-04:00"));
        ZonedDateTime zonaMadrid_UTC = zonaNy_UTC.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Partida NY: " + f.format(zonaNy_UTC));
        System.out.println("LLegada a Madrid: " + f.format(zonaMadrid_UTC));

        System.out.println("\n\t\t\tZonas Id disponibles");
        Set<String> zonas = ZoneId.getAvailableZoneIds();
        zonas.forEach(System.out::println);

        System.out.println("\n\t\t\tatZone( )");
        ZonedDateTime zonaNy_atZone = fechaLocal_2.atZone(newYork);
        System.out.println("zonaNy_atZone = " + zonaNy_atZone);
        zonaNy_atZone = fechaLocal_2.atZone(ZoneOffset.of("-04:00"));
        System.out.println("zonaNy_atZone = " + zonaNy_atZone);
    }
}

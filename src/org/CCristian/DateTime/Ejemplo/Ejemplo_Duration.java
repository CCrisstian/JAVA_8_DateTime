package org.CCristian.DateTime.Ejemplo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ejemplo_Duration {
    public static void main(String[] args) {

        LocalDateTime fecha_1 = LocalDateTime.now();
        LocalDateTime fecha_2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);
        System.out.println("\t\t\tDuración entre fecha_1 y fecha_2");
        Duration lapsus = Duration.between(fecha_1, fecha_2);
        System.out.println("fecha_1 = " + fecha_1);
        System.out.println("fecha_2 = " + fecha_2);
        System.out.println("lapsus = " + lapsus);
        System.out.println("lapsus.getSeconds() = " + lapsus.getSeconds());
        System.out.println("lapsus.toHours() = " + lapsus.toHours());
        System.out.println("lapsus.toDays() = " + lapsus.toDays());
        System.out.println("lapsus.toMinutes() = " + lapsus.toMinutes());
        System.out.println("lapsus.plusHours(5) = " + lapsus.plusHours(5));

    }
}

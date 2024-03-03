package org.CCristian.DateTime.Ejemplo;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Ejemplo_Instant {
    public static void main(String[] args) throws InterruptedException {
        Instant instant_1 = Instant.now();

        TimeUnit.SECONDS.sleep(3);

        Instant instant_2 = Instant.now();

        Duration tiempo = Duration.between(instant_1, instant_2);
        System.out.println("\t\t\tInstante entre instant_1 y instant_2");
        System.out.println("instant_1 = " + instant_1);
        System.out.println("instant_1 = " + instant_1);
        System.out.println("instant_2 = " + instant_2);
        System.out.println("tiempo = " + tiempo);
        System.out.println("tiempo.getSeconds() = " + tiempo.getSeconds());
    }
}

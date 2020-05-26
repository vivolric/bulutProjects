package JavaTechnoStudy.day35.periodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class JavaDuration {   // saat, dakika, saniye ve salise icin kullanilir

    public static void main(String[] args) {
        LocalTime midnight = LocalTime.of(0, 0);
        LocalTime onePM = LocalTime.of(13, 0);

        Duration between = Duration.between(midnight, onePM);
        long seconds = between.getSeconds();

        System.out.println(seconds);


        Duration durationJavaCourse = Duration.ofHours(3);

        LocalTime startOfJavaCourse = LocalTime.of(10, 00);
        LocalTime endOfJavaCourse = startOfJavaCourse.plus(durationJavaCourse);

        System.out.println(endOfJavaCourse);
    }
}

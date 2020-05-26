package JavaTechnoStudy.day35.creatingAndFormatting;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDate {

    public static void main(String[] args) {
        // LocalDate - Contains just a date, no time and no time zone. (19/12/1989, birthday this year)

        LocalDate currentDate = LocalDate.now();   // currentDate yerine localDate yazmistik

        LocalDate localDate1 = LocalDate.of(2020, 05, 24);
        LocalDate localDate2 = LocalDate.of(2020, Month.MAY, 24);

        int dayOfMonth = currentDate.getDayOfMonth();   // int i cevirmek icin kullandigimiz method
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        int dayOfYear = currentDate.getDayOfYear();

        Month month = currentDate.getMonth();         //
        int monthValue = currentDate.getMonthValue();

        int year = currentDate.getYear();


        System.out.println("Short Date: " + currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("Medium Date: " + currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("Long Date: " + currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Full Date: " + currentDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("MM dd yyy: " + currentDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd"))); // bunu kullaniciya standardin disinda tarih yazimi imkani vermek icin kullaniyoruz


        //just fyi coders/programmes/ developers day => 256th of year


    }
}

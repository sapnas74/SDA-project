package sdaakademija.fundamentals.datetime;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Example1 {

    public static void main(String[] args) {

        Date now = new Date();
        // arba
        long millis = System.currentTimeMillis(); // Pasiimam esama sistemos laika millisekundem.
        now = new Date(millis);                   // konvertuojam is millisekundziu

        System.out.println(now);

        Calendar cal = Calendar.getInstance();  //  Kolendoriaus objektas , pasiima esama masinos data
        Date date = cal.getTime(); //konvertuojamas Calendar objektas i Date objekta
        System.out.println(date);

        cal.setTime(now); // konvertuojamas Date objektas i Calendar objekta
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

        String dateInText = "2019-02-18";
        LocalDate localDate= LocalDate.parse(dateInText);
        System.out.println(localDate);
        System.out.println(localDate.plusDays(2));

    }
}

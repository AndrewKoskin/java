package Module5.Time.Lesson;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Excercise1 {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.of(1999, Month.DECEMBER, 8, 0, 0);
        LocalDateTime d2 = LocalDateTime.of(2007, 9, 12, 0,0);
        System.out.println(d1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(d2.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
        System.out.println("Days between: " + ChronoUnit.DAYS.between(d1, d2));
        System.out.println("Years between: " + ChronoUnit.YEARS.between(d1, d2));
        System.out.println("Hours between: " + ChronoUnit.HOURS.between(d1, d2));
        System.out.println("Seconds between: " + ChronoUnit.SECONDS.between(d1, d2));
    }
}

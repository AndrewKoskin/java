package Module5.Time.Homework2;

import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();

        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Yerevan"));
        System.out.println(now.minusDays(dayNum).format(DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm a")));
    }
}

package Module5.Time.Homework1;

import java.security.cert.LDAPCertStoreParameters;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = Year.now().getValue();
        LocalDate base = LocalDate.of(year, month,1);
        for (int i = 1; i <= base.lengthOfMonth(); i++) {
            System.out.println(LocalDate.of(2024, month, i).format(DateTimeFormatter.ofPattern("d,MMM,yyyy")));

        }
    }
}

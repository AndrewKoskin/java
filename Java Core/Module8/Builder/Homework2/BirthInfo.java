package Module8.Builder.Homework2;

import lombok.Value;

import java.time.LocalDate;
import java.time.LocalTime;

@Value
public class BirthInfo {
    LocalDate birthday;
    LocalTime birthTime;
    String birthplace;
    Double weight;
    Double height;
}

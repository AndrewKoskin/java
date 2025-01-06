package Module7.StreamAPI.Homework2;

import java.util.stream.Stream;

public class Homework2 {
    public static void main(String[] args) {
        System.out.printf("Суммарное значение: %f", Stream.iterate(2, x -> x += 2)
                .peek(x -> System.out.printf("Значение %f в сантиметрах %d\n", x / 2.54, x))
                .limit(10)
                .mapToDouble(x -> x / 2.54) // Значения в сантиметрах
                .sum());
    }
}

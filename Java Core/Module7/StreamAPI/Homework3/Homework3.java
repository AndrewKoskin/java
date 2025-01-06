package Module7.StreamAPI.Homework3;

import java.util.List;
import java.util.stream.Stream;

public class Homework3 {
    static List<Integer> generateList(int minValue, int maxValue) {
        return Stream.iterate(minValue, x -> x + 1)
                .peek(x -> {
                            if (x == minValue) {
                                System.out.print("Делятся на 5 и 3: ");
                            }
                            if (x % 3 == 0 && x % 5 == 0) {
                                System.out.printf("%d ", x);
                            }
                            if (x == maxValue) {
                                System.out.println();
                            }
                        }
                )
                .limit(maxValue - minValue + 1)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(generateList(1, 20));
        System.out.println(generateList(1, 40));
        System.out.println(generateList(-10, 20));

    }
}

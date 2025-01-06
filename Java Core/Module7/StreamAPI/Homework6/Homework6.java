package Module7.StreamAPI.Homework6;

import java.util.stream.IntStream;

public class Homework6 {
    public static Integer getInt(int n) {
        // Генерация потока четных чисел с условием фильтрации
        return IntStream.iterate(2, x -> x + 2) // Начинаем с 2 и увеличиваем на 2
                .peek(x -> System.out.printf("x: %d, x * 2: %d, n: %d\n", x, x * 2, n))  // Для отладки
                .limit(n / 2)
                .filter(x -> x * 2 <= n)
                .filter(x -> x > 10)
                .mapToObj(x -> (Integer) x)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(getInt(60));
        System.out.println(getInt(0));

    }
}

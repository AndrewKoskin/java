package First;

import java.util.Scanner;

public class Homework9 {
    /**
     * Имеется прямоугольное отверстие
     * размерами a и b, где a и b – целые числа. Определить, можно ли его полностью
     * закрыть круглой картонкой
     * радиусом r (тоже целое число).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkRadius(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

    public static boolean checkRadius(int a, int b, int r) {
        return ((float) (Math.sqrt(a * a + b * b) / 2)) < r;
    }
}

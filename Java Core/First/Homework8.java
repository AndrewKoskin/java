package First;

import java.util.Scanner;

public class Homework8 {
    /**
     * Создайте метод с одним целочисленным параметром.
     * Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(checkLastDigit(number));
    }

    public static boolean checkLastDigit(int number) {
        if (number % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }
}

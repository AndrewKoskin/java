package Module1.First;

import java.util.Scanner;

public class Homework6 {
    /**
     * 1. Написать метод, принимающий на вход 5ти-значное число и возвращающий 3юю цифру.
     * 2. При тестировании метода, число вводить с клавиатуры
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(method(number));
    }

    public static byte method(int number) {
        return (byte) ((number / 100) % 10);
    }
}

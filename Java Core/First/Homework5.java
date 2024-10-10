package First;

import java.util.Scanner;

public class Homework5 {
    /**
     * 1. Написать метод, принимающий на вход четырехзначное число abcd и возвращающий сумму ab + cd
     * 2. Получать число abcd через scanner в методе main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(method(number));
    }

    public static short method(int number) {
        return (short) ((number / 100) + (number % 100));
    }
}

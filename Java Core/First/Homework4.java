package First;

import java.util.Scanner;

public class Homework4 {
    /**
     * 1. Написать метод getLastDigit(int number), который принимает на вход число, а возвращает последнюю цифру этого числа.
     * 2. В методе main получить число, введенное с клавиатуры, затем вызвать метод getLastDigit, передав ему это число.
     * Вывести на экран результат выполнения метода.
     * Подсказка:
     * Прочитать число, введенное с клавиатуры:
     * Scanner sc= new Scanner(System.in);
     * int number = sc.nextInt();
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number);
        System.out.println(getLastDigit(number));
    }

    public static byte getLastDigit(int number) {
        return (byte) (number % 10);
    }
}

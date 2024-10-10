package Cycles;

import java.util.Scanner;

public class Homework4 {
    /**
     * Поделить пиццу.
     * 1. Через System.in вводить:
     * - количество людей
     * - количество кусков в одной пицце
     * 2. Вывести на экран минимальное количество пицц, чтобы у всех было одинаковое количество кусков и ни одного не осталось лишнего в коробке.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей: ");
        int people = scanner.nextInt();
        System.out.println("Введите количество кусочков пиццы: ");
        int pieces = scanner.nextInt();
        int i = 0;
        while (true) {
            i++;
            if ((i % people == 0) && (i % pieces == 0)) {
                break;
            }
        }
        System.out.println(i);

    }
}

package Module1.First;

import java.util.Scanner;

public class Homework11 {
    /**
     * Написать метод, который выводит расписание на неделю.
     * Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ruble(scanner.nextInt()));
    }

    public static String ruble(int weekDay) {
        switch (weekDay % 10) {
            case 1:
                return "Рубль";
            case 2:
                return "Рубля";
            case 3:
                return "Рубля";
            case 4:
                return "Рубля";
            case 5:
                return "Рублей";
            case 6:
                return "Рублей";
            case 7:
                return "Рублей";
            case 8:
                return "Рублей";
            case 9:
                return "Рублей";
            default:
                return "Рублей";
        }
    }
}

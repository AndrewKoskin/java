package First;

import java.util.Scanner;

public class Homework10 {
    /**
     * Написать метод, который выводит расписание на неделю.
     * Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(weekSchedule(scanner.nextInt()));
    }
    public static String weekSchedule(int weekDay) {
        switch (weekDay) {
            case 1:
                return "Поспать";
            case 2:
                return "Поесть";
            case 3:
                return "Потренироваться";
            case 4:
                return "Погулять";
            case 5:
                return "Погладить кота";
            case 6:
                return "Решить задачку по Java Core";
            case 7:
                return "Отдохнуть после тяжелой недели";
            default:
                return "Дни недели бывают от 1 до 7";
        }
    }
}

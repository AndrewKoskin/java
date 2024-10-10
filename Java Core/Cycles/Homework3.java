package Cycles;

public class Homework3 {
    //Найти среди чисел от 50 до 70 второе простое число и завершить цикл с  использованием break.
    public static void main(String[] args) {
        byte prime_number = 0;
        for (int i = 50; i <= 70; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                prime_number += 1;
            }
            if (prime_number == 2) {
                System.out.println(i);
                break;
            }
        }
    }
}

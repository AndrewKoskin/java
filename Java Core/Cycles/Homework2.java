package Cycles;

public class Homework2 {
    //Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
    public static void main(String[] args) {
    long i = 7_893_823_445L;
    byte result = 0;
    do {
        result += i % 10;
        i /= 10;
    } while (i > 0);
    System.out.println(result);
    }
}

package Cycles;

public class Homework1 {
    public static void main(String[] args) {
        int i = 1;
        int factorial = 1;
        while (i <= 10) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}

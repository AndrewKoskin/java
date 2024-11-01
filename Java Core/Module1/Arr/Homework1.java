package Module1.Arr;

import java.util.Random;

public class Homework1 {
    // Создать массив на 10 целых чисел, заполнить рандомом, вывести, вывести четные
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        for (int elem : array) {
            if (elem % 2 == 0) {
                System.out.print(elem + ", ");
            }
        }
    }
}

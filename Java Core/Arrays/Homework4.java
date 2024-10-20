package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Homework4 {
    // Исключить одинаковые элементы массива (элементы должны быть уникальны)
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

package Module1.Arr;

import java.util.Arrays;
import java.util.Random;

public class Homework3 {
    /* Создать двумерный массив и заполнить его так
     * 1 1 1 1 1
     * 0 1 1 1 0
     * 0 0 1 0 0
     * 0 1 1 1 0
     * 1 1 1 1 1
     */
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10);
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i <= j && i <= array.length - 1 - j) || (i >= j && i >= array.length - 1 - j)) {
                    array[i][j] = 1;
                }
            }
        }
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    // Сделать array[10], заполнить рандомом, вывести наибольшее число
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
        }
       // Путь 1 - поиск максимального перебором
        int max = 0;
        for (int elem : array) {
            if (elem > max){
                max = elem;
            }

        }
        Arrays.sort(array);
        int max2 = array[9];
        System.out.println(Arrays.toString(array));
        System.out.println(max + " " +  max2);
        System.out.println(array.length);
    }

}

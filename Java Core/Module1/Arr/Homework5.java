package Module1.Arr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    /**
     * 1. Получить через Scanner размер тестового массива
     * 2. Заполнить массив случайными целочисленными значениями
     * 3. Написать метод, удаляющий из массива локальные максимумы.
     * 4. Вывести на экран изначальный массив и массив после удаления локальных максимумов
     * Локальный максимум - элемент, который больше предыдущего и следующего, если элемент стоит в начале или в конце массива, то больше только следующего или только предыдущего соответственно.
     * Пример:
     * Изначальный массив: [5, 3, -10, 4, -4, 80, 20]
     * Поcле удаления локальных максимумов: [3, -10, -4, 20]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        boolean b = true;
        double d = 2.5;
        float f = 2.5f;
        int i = 1;
        System.out.println(d == f && (!b || i <f));
        deleteLocalMaxes(array);
    }

    public static void deleteLocalMaxes(int[] array) {
        System.out.println(Arrays.toString(array));
        int min = Integer.MIN_VALUE;
        int counter = 0; // счетчик локальных максимумов
        if (array[0] > array[1]) { // Первый элемент
            array[0] = min;
            counter ++;
        }
        if (array[array.length - 1] > array[array.length - 2]) { // Последний элемент
            array[array.length - 1] = min;
            counter ++;
        }
        for (int i = 1; i < array.length - 1; i++) { // Все остальные элементы
            if (array[i] == min || array[i - 1] == min || array[i + 1] == min) { // Если где-то натыкаемся на минус, то не считаем локаль
                continue;
            } else {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]){ // В остальных случаях если элемент больше соседей, ставим его отрицательным
                    array[i] = min;
                    counter ++;
                }
            }
        }
        int[] result = new int[array.length - counter]; // Начальная длинна массива уменьшится на количество локалей
        int res_index = 0; // Счетчик индексов дочернего массива
        for (int elem : array) {
            if (elem > min) {
                result[res_index] = elem;
                res_index++;
        }
        }
        System.out.println(Arrays.toString(result));
    }

}

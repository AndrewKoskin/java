package Module2.Regexp.Regexp;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    // Подсчитать слова во введенном тексте. Слова могут быть разбиты несколькими пробелами
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        String[] arr = str.split("\s+");
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество слов в тексте: " + arr.length);
    }
}

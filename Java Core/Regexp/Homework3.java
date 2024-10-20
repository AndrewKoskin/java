package Regexp;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    // Вывести на экран текст, составленный из последних букв каждого слова
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        String[] arr = str.split("\\s+");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i].charAt(arr[i].length() - 1));
        }
    }
}

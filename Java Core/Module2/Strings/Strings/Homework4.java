package Module2.Strings.Strings;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(palindrome1(scanner.nextLine()));
        }
    }

    public static boolean palindrome(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome1(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                // Впервые натыкаемся на ошибку, даем шанс
                return (palindrome(str.substring(0, i) + str.substring(i + 1)) || palindrome(str.substring(0, str.length() - i - 1) + str.substring(str.length() - i)));
            }
        }
        return true;

    }
}

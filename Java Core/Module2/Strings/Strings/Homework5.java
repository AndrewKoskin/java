package Module2.Strings.Strings;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int middle = str.length() / 2;
        System.out.println(str.substring(middle, middle + 2));
    }
}

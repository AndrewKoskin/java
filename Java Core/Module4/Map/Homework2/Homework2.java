package Module4.Map.Homework2;

import java.util.HashMap;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        HashMap<String, Integer> chars = new HashMap<>();
        for (String i : text.split(" ")) {
            System.out.println(i);
            if (chars.containsKey(i)) {
                chars.put(i, chars.get(i) + 1);
            } else {
                chars.put(i, 1);
            }
        }
        System.out.println(chars);
    }
}

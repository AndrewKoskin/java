package Module4.Map.Homework3;

import java.util.HashMap;
import java.util.Map;

public class Homework3 {
    public static Map<Character, Integer> getCharCount(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        for (char i : s.toCharArray()) {
            System.out.println(i);
            if (chars.containsKey(i)) {
                chars.put(i, chars.get(i) + 1);
            } else {
                chars.put(i, 1);
            }
        }
        return chars;
    }

    public static void main(String[] args) {
        System.out.println(getCharCount("asdfasdasa"));
    }
}
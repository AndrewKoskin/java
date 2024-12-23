package Module4.Map.Homework4;

import java.util.HashMap;

public class Homework4 {


    private static int romaToArab(String romanNumber) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        char[] romanChar = romanNumber.toUpperCase().toCharArray();
        int previousValue = 0;
        int total = 0;
        int currentValue = 0;
        for (int i = romanChar.length - 1; i >= 0; i--) {
            currentValue = hashMap.get(romanChar[i]);
            if (currentValue >= previousValue) {
                total += currentValue;
            } else {
                total -= currentValue;
            }
            previousValue = currentValue;
        }
        return total;
    }


    public static void main(String[] args) {
        System.out.println(romaToArab("I"));
        System.out.println(romaToArab("IV"));
        System.out.println(romaToArab("IVX"));
        System.out.println(romaToArab("IVXX"));
        System.out.println(romaToArab("IVXXI"));
        System.out.println(romaToArab("IVXXIV"));
        System.out.println(romaToArab("IVL"));
        System.out.println("ASD".compareTo("asdf"));
    }
}

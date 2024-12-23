package Module4.Map.LessonExercise;

import java.lang.reflect.Array;
import java.util.*;

public class LessonExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(5);
        }

        for (int elem: array){
            if (hashMap.containsKey(elem)){
                hashMap.put(elem, hashMap.get(elem) + 1);
            }
            else{
                hashMap.put(elem, 1);
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(hashMap);
        for (Map.Entry<Integer, Integer> pair: hashMap.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }


    }
}

package Module4.CollectionsLessonExercise.Homework2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(30);
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            arrayList.add(i, random.nextInt(10));
        }
        System.out.println(arrayList);

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (hashSet.contains(arrayList.get(i))) {
                arrayList.remove(i);
                i--;
            } else {
                hashSet.add(arrayList.get(i));
            }
        }
        System.out.println(arrayList);
    }
}

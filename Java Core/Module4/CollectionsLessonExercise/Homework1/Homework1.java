package Module4.CollectionsLessonExercise.Homework1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        ArrayList<Integer> marksList = new ArrayList<>(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            marksList.add(i, random.nextInt(100));
        }
        System.out.println(marksList);
        for (int i = 0; i < marksList.size(); i++) {
            if (marksList.get(i) <= 20){
                marksList.remove(i);
                i--;
            }
        }
        System.out.println(marksList);
        Iterator<Integer> marksIterator = marksList.iterator();
        int maxElem = 0;
        while (marksIterator.hasNext()){
            int currentIterator = marksIterator.next();
            if (currentIterator > maxElem) {
                maxElem = currentIterator;
            }
        }
        System.out.println(maxElem);

    }
}

package Module4.CollectionsLessonExercise;

import java.util.*;

public class LessonExercise {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 20; i >= 0; i --){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        for (int i = 20; i >= 0; i --){
            linkedList.add(i);
        }
        System.out.println(linkedList);
        Iterator<Integer> arrayIterator = arrayList.iterator();
        Iterator<Integer> linkedIterator = linkedList.iterator();

        while (arrayIterator.hasNext()){
            if (arrayIterator.next() % 2 == 0){
                arrayIterator.remove();
            }
        }
        System.out.println(arrayList);
        while (linkedIterator.hasNext()){
            if (linkedIterator.next() % 2 == 0){
                linkedIterator.remove();
            }
        }
        System.out.println(linkedList);

        TreeSet<Integer> treeSet = new TreeSet<>(arrayList);
        System.out.println(treeSet);
    }
}

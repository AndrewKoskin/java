package Module7.Lambda.Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Object>> arrays = new ArrayList<>();
        arrays.add(new ArrayList<Object>(List.of(new Object[]{1, 2, 3})));
        arrays.add(new ArrayList<Object>(List.of(new Object[]{1, 2, 2})));
        arrays.add(new ArrayList<Object>(List.of(new Object[]{1, 2})));
        arrays.add(new ArrayList<Object>(List.of(new Object[]{1})));
        Comparator<ArrayList<Object>> comparator = (o1, o2) -> o1.size() - o2.size();
        arrays.forEach(ar -> System.out.println(ar));
        arrays.sort(comparator);
        arrays.forEach(ar -> System.out.println(ar));
    }
}

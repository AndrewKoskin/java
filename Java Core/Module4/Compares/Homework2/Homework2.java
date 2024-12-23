package Module4.Compares.Homework2;

import java.util.*;

public class Homework2 {

    private static Map<String, Integer> sortByValue(Map<String, Integer> map){
        Comparator<Map.Entry<String, Integer>> comparator = new HomeworkComparator();
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet()); // Отсортировать сможем в List
        sortedList.sort(comparator);
        TreeMap<String, Integer> result = new TreeMap<>(Comparator.comparing(map::get));
        for (Map.Entry<String, Integer> elem: sortedList){
            result.put(elem.getKey(), elem.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("two", 2, "three", 3, "four", 4, "one", 1, "five", 5);
        System.out.println(map.entrySet());
        System.out.println(sortByValue(map));
    }
}

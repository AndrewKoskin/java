package Module4.Compares.Homework2;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class HomeworkComparator implements Comparator<Map.Entry<String, Integer>>{
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }

    public static void main(String[] args) {

    }
}

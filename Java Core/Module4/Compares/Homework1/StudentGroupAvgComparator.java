package Module4.Compares.Homework1;

import java.util.Comparator;

public class StudentGroupAvgComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2){
        int result = o1.group.compareTo(o2.group);
        if (result == 0){
            return o1.avgMark.compareTo(o2.avgMark);
        }
        return result;
    }
}

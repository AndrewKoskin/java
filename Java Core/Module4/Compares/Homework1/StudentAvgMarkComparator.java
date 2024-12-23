package Module4.Compares.Homework1;


import java.util.Comparator;

public class StudentAvgMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.avgMark.compareTo(o2.avgMark);
    }
}

package Module4.Compares.Homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable<Student> {
    public String name;
    public Integer group;
    public Float avgMark;

    Student(String name, Integer group, Float avgMark) {
        this.name = name;
        this.group = group;
        this.avgMark = avgMark;
    }

    private static void removeBadStudents(ArrayList<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().avgMark < 3) {
                iterator.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", avgMark=" + avgMark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return -this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ArrayList<Student> studentCollection = new ArrayList<>();

        studentCollection.add(new Student("Andrew", 25, 4.5f));
        studentCollection.add(new Student("Andrew", 25, 3.5f));
        studentCollection.add(new Student("Andrew", 20, 2.5f));
        studentCollection.add(new Student("Dmitry", 20, 2.5f));
        studentCollection.add(new Student("Dmitry", 20, 4.5f));

        StudentGroupComparator studentAgeComparator = new StudentGroupComparator();
        studentCollection.sort(studentAgeComparator);
        System.out.println(studentCollection);


        StudentAvgMarkComparator studentAvgMarkComparator = new StudentAvgMarkComparator();
        studentCollection.sort(studentAvgMarkComparator);
        System.out.println(studentCollection);

        StudentGroupAvgComparator studentGroupAvgComparator = new StudentGroupAvgComparator();
        studentCollection.sort(studentGroupAvgComparator);
        System.out.println(studentCollection);

        Collections.sort(studentCollection);
        System.out.println(studentCollection);

        removeBadStudents(studentCollection);
        System.out.println(studentCollection);

    }
}

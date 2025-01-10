package Module8.Reflection.Homework3;

import java.util.Arrays;
import java.util.LinkedList;

public class Homework3 {
    public static void main(String[] args) {
        Class<LinkedList> c = LinkedList.class;
        System.out.println(Arrays.toString(c.getDeclaredFields()));
        System.out.println(c.getSuperclass().getName());
        System.out.println(Arrays.toString(c.getDeclaredMethods()));
        System.out.println(Arrays.toString(c.getConstructors()));
        System.out.println(Arrays.toString(c.getDeclaredClasses()));
    }
}

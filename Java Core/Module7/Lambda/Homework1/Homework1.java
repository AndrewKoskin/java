package Module7.Lambda.Homework1;

import java.util.Objects;
import java.util.function.Predicate;

public class Homework1 {
    static Predicate<String> predicateNull = Objects::isNull;
    static Predicate<String> predicateEmpty = String::isEmpty;

    static boolean checkString(String s){
        if (!(predicateNull.test(s) && predicateEmpty.test(s))){
            char[] chars = s.toCharArray();
            return (chars[0] == 'J' || chars[0] == 'N') && chars[chars.length - 1] == 'A';
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "NIGGA";
        String s2 = "JIGGA";
        String s3 = "MIGGA";
        System.out.println(checkString(s1));
        System.out.println(checkString(s2));
        System.out.println(checkString(s3));
    }
}

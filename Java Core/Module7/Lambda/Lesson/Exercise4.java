package Module7.Lambda.Lesson;

import java.util.List;

public class Exercise4 {
    static Meow exerciseMeow(List<Integer> l) {
        Meow meowResult;
        if (l.size() > 20) {
            meowResult = list -> {
                int result = 0;
                for (Integer i : list) {
                    result += i;
                }
                return result;
            };
        } else if (l.size() > 10) {
            meowResult = list -> {
                StringBuilder result = new StringBuilder();
                for (Integer i : list) {
                    result.append(i);
                }
                return result.toString();
            };
            return meowResult;

        } else {
            meowResult = list -> {
                int result = 1;
                for (Integer i : list) {
                    result *= i;
                }
                return result;
            };
        }
        return meowResult;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
        List<Integer> list2 = List.of(1,1,1,1,1,1);
        List<Integer> list3 = List.of(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
        System.out.println(exerciseMeow(list1).meow(list1));
        System.out.println(exerciseMeow(list2).meow(list2));
        System.out.println(exerciseMeow(list3).meow(list3));
    }
}

@FunctionalInterface
interface Meow {
    Object meow(List<Integer> list);
}

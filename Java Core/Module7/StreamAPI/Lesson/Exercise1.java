package Module7.StreamAPI.Lesson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1","a2","a3","a4","a1","a6");
        Stream<String> stream = list.stream();
        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = list.stream();
        Stream<String> stream3 = list.stream();
        Stream<String> stream4 = list.stream();
        Stream<String> stream5 = list.stream();
        System.out.println("Количество вхождений объекта a1: " + stream.filter("a1"::equals).count());
        System.out.println("Если коллекция пуста, то будет 0: " + stream1.limit(0).findFirst().orElse("0"));
        System.out.println("Если коллекция пуста, то будет 0: " + stream2.skip(list.size()).findFirst().orElse("0"));
        System.out.println("Ищем элемент a3: " + stream3.filter("a3"::equals).findFirst().get());
        System.out.println("Ищем третий элемент коллекции: " + stream4.skip(2).findFirst().orElse("3"));
        System.out.println("Два элемента, начиная со второго: " + stream5.skip(1).limit(2).toList());
    }
}

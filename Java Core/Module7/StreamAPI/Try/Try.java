package Module7.StreamAPI.Try;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Try {
    public static void main(String[] args) {
        System.out.println(Stream.of(1,2,3).filter(x -> x > 1).count());
        System.out.println(Stream.of("1", "2", "3").map(s -> Integer.parseInt(s)+ 1).collect(Collectors.toList()));
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).peek(System.out::print).collect(Collectors.toList()));
        Collection<Integer> collection = List.of(1,2,3);
        collection.stream().reduce(Integer::sum);
    }
}

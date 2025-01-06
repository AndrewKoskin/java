package Module7.StreamAPI.Homework4;

import java.util.Random;
import java.util.stream.Collectors;

public class Homework4 {

    public static void main(String[] args) {

        System.out.println(new Random()
                .ints(10, 1, 11)
                .filter(x -> x % 2 == 0)
                .mapToObj(Integer::toString)
                .collect(Collectors.toSet()));

    }
}

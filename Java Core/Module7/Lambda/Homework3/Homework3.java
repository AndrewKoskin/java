package Module7.Lambda.Homework3;

import java.util.Random;
import java.util.function.Supplier;

public class Homework3 {
    public static void main(String[] args) {
        Supplier<Integer> sup = () -> {
            Random r = new Random();
            return r.nextInt(11);
        };
        System.out.println(sup.get());
    }
}

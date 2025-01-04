package Module7.Lambda.Homework2;

import java.util.function.Function;

public class Homework2 {
    static Function<Integer, String> func = (n) -> {
        if (n < 0){
            return "Отрицательное число";
        }else if (n == 0){
            return "Ноль";
        }else{
            return "Положительное число";
        }
    };
    public static void main(String[] args) {
        System.out.println(func.apply(1));
        System.out.println(func.apply(-1));
        System.out.println(func.apply(0));
    }
}

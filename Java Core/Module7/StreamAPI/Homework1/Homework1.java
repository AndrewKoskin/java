package Module7.StreamAPI.Homework1;

import java.util.Arrays;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {
        List<String> col = Arrays.asList("Meow", "login is meow", "Andrew Koskin", "Vladimir Vladimirovich Putin", "Meow ");

        System.out.println("Строка, содержащая логин");
        System.out.println(col.stream().filter(x -> x.contains("login")).findFirst().get());

        System.out.println("Самая длинная строка");
        System.out.println(col.stream()
                .filter(x -> x.length() == col.stream()
                        .mapToInt(String::length)
                        .max()
                        .getAsInt())
                .findFirst()
                .get());

        System.out.println("Самая маленькая строка");
        System.out.println(col.stream()
                .filter(x -> x.length() == col.stream()
                        .mapToInt(String::length)
                        .min()
                        .getAsInt())
                .findFirst()
                .get());

        System.out.println("Строки из одного слова");
        System.out.println(col.stream().filter(x -> x.matches("^\\w+$")).toList());

        System.out.println("Все используемые в строках слова");
        List<List<String>> l = col.stream().map(x -> x.split("\\W")).map(List::of).peek(System.out::println).toList();

    }
}

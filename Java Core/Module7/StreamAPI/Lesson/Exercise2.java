package Module7.StreamAPI.Lesson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Exercise2 {
    public static void main(String[] args) {
        List<People> list = Arrays.asList(
                new People("Vasiliy", 16, Sex.Man),
                new People("Petya", 23, Sex.Man),
                new People("Elena", 42, Sex.Woman),
                new People("Ivan", 69, Sex.Man)
        );
        double avgYears = list.stream().filter(x -> x.sex.equals(Sex.Man)).mapToInt(x -> x.age).average().getAsDouble();
        System.out.println("Мужчины призывного возраста: " + list.stream().filter(x -> x.age >= 18 && x.age <= 30).toList());
        System.out.println("Средний возраст среди мужчин: " + avgYears);
        Predicate<People> checkWorkingCapacity = x -> {
            if (x.sex.equals(Sex.Man)) {
                if (x.age >= 18 && x.age <= 60)
                    return true;
            } else {
                if (x.age >= 18 && x.age <= 55)
                    return true;
            }
            return false;
        };
        System.out.println("Количество работоспособных людей: " + list.stream().filter(checkWorkingCapacity).count());
        System.out.println("Отсортированные по имени: " + list.stream().sorted(Comparator.comparing(x -> x.name)).toList());
        System.out.println("Отсортированные по возрасту: " + list.stream().sorted(Comparator.comparing(x -> -x.age)).toList());
        System.out.println("Отсортированные по полу: " + list.stream().sorted(Comparator.comparing(x -> x.sex.name())).toList());
    }
}


enum Sex {
    Man, Woman;
}

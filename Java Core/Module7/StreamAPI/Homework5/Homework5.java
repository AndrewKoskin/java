package Module7.StreamAPI.Homework5;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {
        Random r = new Random();
        String[] names = new String[]{"Andrew", "Dmitry", "Sofi", "Elena"};
        String[] surnames = new String[]{"Koskin", "Barsukov", "Radionova", "Dyachuk"};
        People[] people = new People[100];
        for (int i = 0; i < people.length; i++) {
            people[i] = new People(
                    names[r.nextInt(0, 4)],
                    surnames[r.nextInt(0, 4)],
                    r.nextInt(1, 100)
            );
        }
        System.out.println(Arrays.stream(people)
                .filter(x -> x.age < 21)
                .sorted(Comparator.comparing((People x) -> x.surname).thenComparing(x -> x.name))
                .limit(4)
                .map(x -> x.surname)
                .toList());
    }
}

class People {
    String name;
    String surname;
    int age;

    public People(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
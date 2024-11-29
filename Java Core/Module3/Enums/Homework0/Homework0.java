package Module3.Enums.Homework0;

public class Homework0 {
    public static void main(String[] args) {
        Pair<Day, Integer>[] pairs = new Pair[3];

        pairs[0] = new Pair<>(Day.MONDAY, Day.MONDAY.getWorkingHours());
        pairs[1] = new Pair<>(Day.TUESDAY, Day.TUESDAY.getWorkingHours());
        pairs[2] = new Pair<>(Day.SUNDAY, Day.SUNDAY.getWorkingHours());
        for (Day day : Day.values()) {
            System.out.println(day.name() + " " + day.getWorkingHours() + " ");
        }
        for (Pair pair : pairs)
            System.out.println(pair.getKey() + " " + pair.getValue());

    }
}


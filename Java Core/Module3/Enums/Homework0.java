package Module3.Enums;

public class Homework0 {
    public static void main(String[] args) {
        Pair<Day, Integer>[] scheduler = new Pair[4];
        scheduler[0] = new Pair<>(Day.MONDAY.getWorkingHours(), Day.MONDAY);
        scheduler[1] = new Pair<>(Day.TUESDAY.getWorkingHours(), Day.TUESDAY);
        scheduler[2] = new Pair<>(Day.WEDNESDAY.getWorkingHours(), Day.WEDNESDAY);
        scheduler[3] = new Pair<>(Day.SUNDAY.getWorkingHours(), Day.SUNDAY);
        for (Pair ch: scheduler){
            System.out.println(ch.getKey() + " " + ch.getValue());
        }
    }
}

enum Day {
    MONDAY(true, 8), TUESDAY(true, 8),
    WEDNESDAY(true, 8), THURSDAY(true, 8),
    FRIDAY(true, 8), SATURDAY(false, 0),
    SUNDAY(false, 0);

    private boolean isWorkingDay;
    private int workingHours;

    Day(boolean isWorkingDay, int workingHours) {
        this.isWorkingDay = isWorkingDay;
        this.workingHours = workingHours;
    }

    int getWorkingHours(){
        return workingHours;
    }
}

class Pair<V, T> {
    private T key;
    private V value;

    public Pair(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }
}

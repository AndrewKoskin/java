package Module3.Enums.Homework0;

public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int workingHours;

    Day(int workingHours) {
        this.workingHours = workingHours;
    }

    int getWorkingHours(){
        return this.workingHours;
    }

}

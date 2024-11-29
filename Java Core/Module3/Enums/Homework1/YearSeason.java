package Module3.Enums.Homework1;

public enum YearSeason {
    WINTER("Cold", 89), SPRING("Happy", 91),
    SUMMER("Warm", 94), AUTUMN("Sad", 91),
    UNKNOWN_SEASON("Unknown", 0);

    private String description;
    private int countOfDays;

    YearSeason(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public int getCountOfDays() {
        return this.countOfDays;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static YearSeason getNextSeason(YearSeason yearSeason) {
        switch (yearSeason) {
            case WINTER -> {
                return SPRING;
            }
            case SPRING -> {
                return SUMMER;
            }
            case SUMMER -> {
                return AUTUMN;
            }
            case AUTUMN -> {
                return WINTER;
            }
            default -> {
                return UNKNOWN_SEASON;
            }
        }
    }

    public static YearSeason getNextSeasonByOrdinal(YearSeason yearSeason){
        int number = yearSeason.ordinal();
        int nextNumber = number >=  YearSeason.values().length - 2 ? 0 : number + 1;
        return YearSeason.values()[nextNumber];
    }

    public static void main(String[] args) {
        for (YearSeason yearSeason : Module3.Enums.Homework1.YearSeason.values()) {
            System.out.println("Current season: " + yearSeason.name() + " " + yearSeason.description + " " + yearSeason.countOfDays);
            System.out.println(YearSeason.getNextSeasonByOrdinal(yearSeason).name());
        }
        System.out.println(YearSeason.getNextSeason(SUMMER).name());
    }
}

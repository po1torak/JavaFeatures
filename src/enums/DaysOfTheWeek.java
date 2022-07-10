package enums;

public enum DaysOfTheWeek {
    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(8),
    FRIDAY(10),
    SATURDAY(9),
    SUNDAY(6);

    private final int levelOfHappiness;

    DaysOfTheWeek(int levelOfHappiness) {
        this.levelOfHappiness = levelOfHappiness;
    }

    public int getLevelOfHappiness() {
        return levelOfHappiness;
    }
}

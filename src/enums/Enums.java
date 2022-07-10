package enums;

public class Enums {

    public static void enums() {
        DaysOfTheWeek myDay = DaysOfTheWeek.FRIDAY;
        if (myDay == DaysOfTheWeek.FRIDAY) {
            System.out.println("Yay, it's finally Friday");
        }

        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println(day);
        }
    }
}

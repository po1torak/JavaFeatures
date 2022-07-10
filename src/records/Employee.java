package records;

public record Employee(String name, int employeeNumber) {

    public String nameToUpperCase() {
        return name.toUpperCase();
    }

    public static void doSmth() {
        System.out.println("I'm doing smth!");
    }
}

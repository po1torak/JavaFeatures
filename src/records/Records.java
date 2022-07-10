package records;

public class Records {

    public static void records() {
        Employee employee = new Employee("John", 22);
        System.out.println(employee.name());
        System.out.println(employee);
        System.out.println(employee.nameToUpperCase());
        Employee.doSmth();
    }
}

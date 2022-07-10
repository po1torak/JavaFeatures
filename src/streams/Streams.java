package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Streams {

    public static void steams() {
        List<String> names = List.of("John", "Randy", "Rey", "Jeff", "Chris");
        List<Integer> salaries = List.of(1000, 2000, 5000);
        Map<String, Integer> employeeSalaries = new HashMap<>();
        employeeSalaries.put("John", 1000);
        employeeSalaries.put("Randy", 2000);
        employeeSalaries.put("Rey", 5000);

        System.out.println(names.stream()
                .allMatch(name -> name.startsWith("R")));

        System.out.println(salaries.stream()
                .mapToInt(salary -> salary).average().getAsDouble());

        System.out.println(employeeSalaries.keySet().stream()
                .anyMatch(name -> name.endsWith("y")));
    }
}

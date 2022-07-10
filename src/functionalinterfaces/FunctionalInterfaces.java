package functionalinterfaces;

import java.security.SecureRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.of;

public class FunctionalInterfaces {

    public static void functionalInterfaces() {
        //Predicate --> returns boolean result
        //Method name --> test()
        //Used to check if test case has bug issue tag value -> value.contains(PRODUCT_BUG.getName())
        Predicate<String> checkLength = string -> string.length() > 5;
        System.out.println(of("abc", "abcd", "abcde", "abcdef").filter(checkLength).collect(toList()));

        //Consumer --> doesn't return data, mostly used for data modifications
        //Method name --> accept()
        //Used to add resolved issues to resolvedIssues holder
        Person person = new Person();
        Consumer<Person> personConsumer = p -> p.setName("Consumer test");
        personConsumer.accept(person);
        System.out.println(person.getName());

        //Function --> has input and output
        //Method name --> apply()
        //Used to get info about bug from Jira (Response) based on ticket id (String)
        Function<Person, String> nameChanger = p -> p.getName().toUpperCase();
        System.out.println(nameChanger.apply(person));

        //Supplier --> no input, only output
        //Method name --> get()
        //Used in HasGlobalMessages interface to get SelenideElement for message
        Supplier<Integer> randomInt = () -> new SecureRandom().nextInt();
        System.out.println(randomInt.get());
    }
}

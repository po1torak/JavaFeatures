package optionals;

import generics.Cat;

import java.util.Optional;

public class Optionals {

    public static void optional() {
        Optional<Cat> optionalCat = findCatByName("Fred");

        optionalCat.ifPresentOrElse(cat -> System.out.println(cat.getName()),
                () -> System.out.println("Cat wasn't found"));

    }

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name);
        return Optional.ofNullable(null);
    }
}

package generics;

import java.util.List;

public class Generics {

    public static void generics() {
        //Generics are used to create general classed
        Walker<Cat> catWalker = new Walker<>(new Cat("Thomas"));
        Walker<Dog> dogWalker = new Walker<>(new Dog());
        catWalker.walk();
        dogWalker.walk();
        //And methods
        shout("First", new Dog());
        //Also ? wildcard can be used
        List<Dog> dogs = List.of(new Dog(), new Dog());
        wildcard(dogs);
    }

    private static <K, V extends Animal> void shout(K firstThing, V secondThing) {
        System.out.println(firstThing + "!!!!!!");
        System.out.println(secondThing + "!!!!!!");
    }

    private static void wildcard(List<? extends Animal> list) {
        System.out.println(list);
    }
}

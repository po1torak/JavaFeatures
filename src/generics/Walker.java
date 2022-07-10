package generics;

public class Walker<T extends Animal> {

    private final T animal;

    public Walker(T animal) {
        this.animal = animal;
    }

    public void walk() {
        animal.walk();
    }
}

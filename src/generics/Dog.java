package generics;

public class Dog implements Animal {

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public String toString() {
        return "I am a dog";
    }
}

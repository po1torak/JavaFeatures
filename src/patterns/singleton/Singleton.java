package patterns.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    // synchronized keyword helps to get one instance for all threads
    synchronized public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void print() {
        System.out.println("Hi, I'm Singleton");
    }
}

package patterns;

import patterns.prototype.Prototype;
import patterns.singleton.Singleton;

public class Patterns {

    public static void patterns() throws CloneNotSupportedException {
        Singleton.getInstance().print();
        Singleton.getInstance().print();
        Prototype.prototype();
    }
}

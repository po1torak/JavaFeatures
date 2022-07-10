package patterns.prototype;

public class Prototype {

    public static void prototype() throws CloneNotSupportedException {
        ObjectToClone object1 = new ObjectToClone("A", "B", "C");
        ObjectToClone object2 = object1.clone();
        System.out.println(object1);
        System.out.println(object2);
    }
}

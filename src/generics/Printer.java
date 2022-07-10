package generics;

public class Printer<T> {

    private T valueToPrint;

    public Printer(T valueToPrint) {
        this.valueToPrint = valueToPrint;
    }

    public void print() {
        System.out.println(valueToPrint);
    }
}

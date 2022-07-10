package generics;

import annotations.AnimalAnnotation;
import annotations.FieldAnnotation;
import annotations.MethodAnnotation;
import lombok.Getter;

@AnimalAnnotation
@Getter
public class Cat implements Animal {

    @FieldAnnotation
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    @MethodAnnotation(times = 2)
    public void walk() {
        System.out.println("Cat is walking");
    }

    @MethodAnnotation
    public void meow() {
        System.out.println("Meeeeeooooow");
    }
}

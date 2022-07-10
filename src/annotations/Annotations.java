package annotations;

import generics.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Annotations {

    public static void annotations() throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("Thomas");
        if (cat.getClass().isAnnotationPresent(AnimalAnnotation.class)) {
            System.out.println("It's definitely an animal");
        }
        for (Method method : cat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodAnnotation.class)) {
                MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(cat);
                }
            }
        }
        for (Field field : cat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(FieldAnnotation.class)) {
                field.setAccessible(true);
                if (field.get(cat) instanceof String) {
                    System.out.println((String) field.get(cat));
                }
            }
        }

    }
}

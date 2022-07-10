import annotations.Annotations;
import collections.Collections;
import enums.Enums;
import exceptions.Exceptions;
import functionalinterfaces.FunctionalInterfaces;
import generics.Generics;
import lombok.Lombok;
import optionals.Optionals;
import patterns.Patterns;
import patterns.singleton.Singleton;
import patterns.singleton.ThreadLocalSingleton;
import records.Records;
import streams.Streams;

import java.lang.reflect.InvocationTargetException;

public class MainClass {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, CloneNotSupportedException {
        FunctionalInterfaces.functionalInterfaces();
        Generics.generics();
        Enums.enums();
        Annotations.annotations();
        Lombok.lombok();
        Optionals.optional();
        Records.records();
        Exceptions.exceptions();
        Streams.steams();
        Collections.collections();
        Patterns.patterns();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> System.out.println(Singleton.getInstance())).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(() -> System.out.println(ThreadLocalSingleton.getInstance())).start();
        }
    }
}

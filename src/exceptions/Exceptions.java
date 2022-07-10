package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exceptions {

    public static void exceptions() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int age = scanner.nextInt();
//
//        try {
//            checkAge(age);
//        } catch (Exception e) {
//            System.out.println("A problem occur: " + e);
//        }

    }

    private static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Your age is less then 18!");
        } else {
            System.out.println("You're signed up");
        }
    }

    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Hey, we don't have that file");
        }
    }

    private static void readFile2(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader(fileName);
    }

    private static void printLength(String string) {
        System.out.println(string.length());
    }
}

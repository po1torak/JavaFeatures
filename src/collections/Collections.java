package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Collections {

    public static void collections() {
        list();
        map();
    }

    private static void list() {
        //each element called node and has reference to next and prev node
        //get is slow
        //add or remove is fast
        LinkedList<String> namesLinkedLink = new LinkedList<>();
        namesLinkedLink.add("John");
        namesLinkedLink.add("Jeff");
        namesLinkedLink.add("Ringo");
        System.out.println(namesLinkedLink.get(2));

        //just array inside String[] - fixed length
        //ArrayList automatically adds capacity, default capacity = 10
        //get is fast
        //add or remove is slow
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Jeff");
        namesArrayList.add("Ringo");
        System.out.println(namesLinkedLink.get(2));
    }

    private static void map() {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("Ukraine", "Kyiv");
        countries.put("The United States", "Washington DC");
        countries.put("The United Kingdon", "London");
        System.out.println(countries);
        countries.remove("The United States");
        System.out.println(countries);
        System.out.println(countries.get("Ukraine"));
        countries.clear();
        System.out.println(countries.size());
    }
}

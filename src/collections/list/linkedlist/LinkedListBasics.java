package collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListBasics {
    public static void main(String[] args) {
        /*
            Question:
            Create a LinkedList of String.

            Add:

            Java
            Python
            C++
            JavaScript

            Print:

            - All elements
            - First element
            - Last element
            - Total size

            Output:

            Languages:
            Java
            Python
            C++
            JavaScript

            First Element: Java
            Last Element: JavaScript
            Size: 4
        */

        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Languages: ");
        for (String lang: languages){
            System.out.println(lang);
        }

        System.out.printf("First Elements: %s%n", languages.getFirst());
        System.out.printf("Last Elements: %s%n", languages.getLast());
        System.out.printf("Size: %d%n", languages.size());
    }
}

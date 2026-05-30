package collections.list.arraylist;

import java.util.ArrayList;

public class SearchElementDemo {
    public static void main(String[] args) {

        /*
        Question:
        Create an ArrayList of String.

        Add:
        Java
        Python
        C++
        JavaScript

        Check:

        1. Does "Python" exist?
        2. Does "Ruby" exist?

        Print appropriate messages.

        Output:

        Python found.
        Ruby not found.
    */

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");


        if (languages.contains("Python")) {
            System.out.println("Python found");
        } else {
            System.out.println("Python not found");
        }

        if (languages.contains("Ruby")) {
            System.out.println("Ruby found");
        } else {
            System.out.println("Ruby not found");
        }




    }
}

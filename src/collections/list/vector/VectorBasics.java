package collections.list.vector;

import java.util.Vector;

public class VectorBasics {
    public static void main(String[] args) {

                /*
            Question:
            Create a Vector<String>

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

            Java
            Python
            C++
            JavaScript

            First Element: Java
            Last Element: JavaScript
            Size: 4
        */

        Vector<String> languages = new Vector<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Languages:");
        for (String lang: languages){
            System.out.println(lang);
        }

        System.out.printf("First element: %s%n",languages.firstElement());
        System.out.printf("Last element: %s%n",languages.lastElement());
        System.out.printf("Size: %d%n",languages.size());

    }
}

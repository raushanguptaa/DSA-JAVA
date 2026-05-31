package collections.set.hashset;

import java.util.HashSet;

public class HashSetBasics {
    public static void main(String[] args) {
                /*
            Question:
            Create a HashSet<String>

            Add:

            Java
            Python
            Java
            C++
            Python

            Print:

            - All elements
            - Total size

            Observe:
            Duplicate values should not be stored.

            Example Output:

            Java
            Python
            C++

            Size: 3
        */

        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");


        System.out.println("ELements: ");
        for (String lang: languages){
            System.out.println(lang);
        }
        System.out.printf("Size: %d%n", languages.size());

    }
}

package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetBasics {
    public static void main(String[] args) {
        /*
    Question:
    Create a LinkedHashSet<String>

    Add:

    Java
    Python
    Java
    C++
    Python

    Print all elements.

    Also print the size.

    Observe:
    Duplicates are removed,
    but insertion order is maintained.
*/

        LinkedHashSet<String> languages  = new LinkedHashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        System.out.println("Elements:");
        for (String lang: languages){
            System.out.println(lang);
        }
        System.out.printf("Size: %d", languages.size());
    }
}

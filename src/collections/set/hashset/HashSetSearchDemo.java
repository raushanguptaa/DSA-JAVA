package collections.set.hashset;

import java.util.HashSet;

public class HashSetSearchDemo {
    public static void main(String[] args) {
        /*
    Question:
    Create a HashSet<String>

    Add:

    Java
    Python
    C++
    JavaScript

    Check:

    1. Does Python exist?
    2. Does Ruby exist?

    Print appropriate messages.

    Also print the size.
*/

        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        String findLanguage = "Ruby";

        if (languages.contains(findLanguage)){
            System.out.printf("%s found%n", findLanguage);
        }else {
            System.out.printf("%s not found%n", findLanguage);
        }

        System.out.printf("Size: %d", languages.size());
    }
}

package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetSearchDemo {
    public static void main(String[] args) {
        /*
    Question:
    Create a LinkedHashSet<String>

    Add:

    Java
    Python
    C++
    JavaScript

    Check:

    1. Does Python exist?
    2. Does Ruby exist?

    Print appropriate messages.

    Also print all elements.
*/
        LinkedHashSet<String> languages  = new LinkedHashSet<>();
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

        System.out.print("Elements: ");
        for (String lang : languages){
            System.out.print(lang+" ");
        }
    }
}

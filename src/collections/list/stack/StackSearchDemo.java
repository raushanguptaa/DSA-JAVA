package collections.list.stack;

import java.util.Stack;

public class StackSearchDemo {
    public static void main(String[] args) {
        /*
    Question:
    Create a Stack<String>

    Push:

    Java
    Python
    C++
    JavaScript

    Search for:

    Python
    Ruby

    Print:

    Python found
    Ruby not found

    Also print the position returned by search().
*/

        Stack<String> languages = new Stack<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        String findLanguage = "Python"; // Ruby/Python
        int position = languages.search(findLanguage);

        if (position != -1){
            System.out.printf("%s found at position %d from top%n",findLanguage, position);
        }else {
            System.out.printf("%s not found at position%n", findLanguage);
        }




    }
}

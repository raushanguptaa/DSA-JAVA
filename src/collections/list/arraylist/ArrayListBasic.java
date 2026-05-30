package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBasic {
    public static void main(String[] args) {


    /*
        Question:
        Create an ArrayList of String.

        Add:
        Java
        Python
        C++

        Print:
        - All elements
        - First element
        - Total size

        Output:

        Languages:
        Java
        Python
        C++

        First Element: Java
        Size: 3
    */


        ArrayList<String> languages = new ArrayList<>();

        //add element
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // displaying by for each
        System.out.println("languages: ");
        for (String language : languages){
            System.out.println(language);
        }

        //displaying by Iterator()
        System.out.println("Iterator method");
        Iterator<String> itr = languages.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //first element
        System.out.println("First element: "+ languages.get(0));

        //size of arraylist
        System.out.printf("Size: %s\n", languages.size());

    }
}

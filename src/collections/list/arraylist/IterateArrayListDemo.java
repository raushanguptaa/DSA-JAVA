package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListDemo {
    public static void main(String[] args) {
        /*
            Question:
            Create an ArrayList of Integer.

            Add:
            10
            20
            30
            40
            50

            Print the elements using:

            1. For Loop
            2. Enhanced For Loop
            3. Iterator

            Output:

            10
            20
            30
            40
            50
        */

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // for loop
        System.out.println("Using For Loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Enhanced for loop
        System.out.println("Using Enhanced For Loop:");
        for (Integer num: numbers){
            System.out.println(num);
        }

        //Iterator methods
        System.out.println("Using Iterator:");
        Iterator<Integer> num = numbers.iterator();
        while (num.hasNext()){
            System.out.println(num.next());
        }
    }
}

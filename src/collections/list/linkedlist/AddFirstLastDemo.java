package collections.list.linkedlist;

import java.util.LinkedList;

public class AddFirstLastDemo {
    public static void main(String[] args) {
        /*
        Question:
        Create a LinkedList of Integer.

        Add:

        20
        30
        40

        Then:

        Add 10 at the beginning.
        Add 50 at the end.

        Print the final LinkedList.

        Output:

        [10, 20, 30, 40, 50]
    */
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        //adding 10 at the beginning
        numbers.addFirst(10);

        // adding 50 at the end
        numbers.addLast(50);

        System.out.printf("Elements: %s%n",numbers );
    }
}

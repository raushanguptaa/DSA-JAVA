package collections.list.linkedlist;

import java.util.LinkedList;

public class RemoveFirstLastDemo {
    public static void main(String[] args) {
        /*
            Question:
            Create a LinkedList of Integer.

            Add:

            10
            20
            30
            40
            50

            Then:

            Remove the first element.
            Remove the last element.

            Print:

            Removed First Element
            Removed Last Element
            Final LinkedList

            Output:

            Removed First: 10
            Removed Last: 50

            [20, 30, 40]
        */

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        //removing first element
        System.out.printf("Removed First: %d%n",numbers.removeFirst());

        //removing last element

        System.out.printf("Removed Last: %d%n",numbers.removeLast());
        System.out.printf("Elements: %s%n",numbers );
    }
}

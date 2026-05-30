package collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
                /*
            Question:

            Create a LinkedList<Integer>

            Perform:

            addFirst(20)
            addFirst(10)

            addLast(30)
            addLast(40)
            addLast(50)

            Remove first element.
            Remove last element.

            Check if 30 exists.

            Print:

            Final LinkedList
            First Element
            Last Element
            Size

            Output:

            30 found

            Elements: [20, 30, 40]

            First: 20
            Last: 40
            Size: 3
        */

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.addFirst(20);
        numbers.addFirst(10);
        numbers.addLast(30);
        numbers.addLast(40);
        numbers.addLast(50);


        int removedFirst = numbers.removeFirst();
        int removedLast = numbers.removeLast();
        System.out.printf("Removed first: %d%nRemoved last: %d%n", removedFirst, removedLast);

        int findNum = 30;
        if (numbers.contains(findNum)){
            System.out.printf("%d is found%n", findNum);
        }else {
            System.out.printf("%d is not found%n", findNum);
        }

        System.out.printf("Elements: %s%n", numbers);

        int firstElement = numbers.getFirst();
        int lastElement = numbers.getLast();

        System.out.printf("First: %d%nLast: %d%n",firstElement, lastElement);

        System.out.printf("Size: %d%n", numbers.size());
    }
}

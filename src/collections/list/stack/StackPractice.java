package collections.list.stack;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
                /*
            Question:

            Create a Stack<Integer>

            Push:

            10
            20
            30
            40
            50

            Print:

            Top Element

            Pop two elements.

            Print:

            Removed Elements
            Current Stack
            Is Stack Empty?
            Stack Size

            Output:

            Top: 50

            Removed: 50
            Removed: 40

            Stack: [10, 20, 30]

            Empty: false

            Size: 3
        */

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);
        numbers.push(50);

        System.out.printf("Top Element: %d%n", numbers.peek());

        System.out.printf("Popped Element: %d%n", numbers.pop());
        System.out.printf("Popped Element: %d%n", numbers.pop());

        System.out.printf("Current Stack: %s%n", numbers);
        System.out.printf("isEmpty: %b%n", numbers.isEmpty());
        System.out.printf("Stack Size: %d", numbers.size());



    }
}

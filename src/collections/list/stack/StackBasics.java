package collections.list.stack;

import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
                /*
            Question:
            Create a Stack<Integer>

            Push:

            10
            20
            30
            40

            Print:

            Stack
            Top Element
            Size

            Output:

            Stack: [10, 20, 30, 40]

            Top Element: 40

            Size: 4
        */

        Stack<Integer> numbers = new Stack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);

        System.out.printf("Stack: %s%n", numbers);
        System.out.printf("Top Element: %d%n", numbers.peek());
        System.out.printf("Size: %d%n", numbers.size());
    }
}

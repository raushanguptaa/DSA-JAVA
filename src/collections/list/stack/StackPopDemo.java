package collections.list.stack;

import java.util.Stack;

public class StackPopDemo {
    public static void main(String[] args) {

        /*
    Question:
    Create a Stack<Integer>

    Push:

    10
    20
    30
    40

    Remove the top element.

    Print:

    Removed Element
    Current Stack
    Top Element

    Output:

    Removed: 40

    Stack: [10, 20, 30]

    Top Element: 30
*/

        Stack<Integer> numbers = new Stack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);

        System.out.printf("Removed: %d%n", numbers.pop());
        System.out.printf("Current Stack: %s%n", numbers);
        System.out.printf("Top Element: %d%n",numbers.peek());

    }
}

package collections.set.treeset;

import java.util.TreeSet;

public class TreeSetMethodsDemo {
    public static void main(String[] args) {
        /*
    Question:
    Create a TreeSet<Integer>

    Add:

    50
    10
    40
    20
    30

    Print:

    First Element
    Last Element

    Check if 40 exists.

    Print all elements.

    Output:

    First: 10
    Last: 50

    40 found

    Elements:
    10 20 30 40 50
*/

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.printf("First Element: %d%n", numbers.first());
        System.out.printf("Last Element: %d%n", numbers.last());

        int findNum = 40;
        if (numbers.contains(findNum)){
            System.out.printf("%d found.%n", findNum);
        }else {
            System.out.printf("%d is not found.%n", findNum);
        }

        System.out.print("Elements: ");
        for (Integer num : numbers){
            System.out.printf("%d ", num);
        }
    }
}

package collections.set.treeset;

import java.util.TreeSet;

public class TreeSetBasics {
    /*
    Question:
    Create a TreeSet<Integer>

    Add:

    50
    10
    40
    20
    30
    20

    Print all elements.

    Also print the size.

    Observe:

    Duplicates are removed.
    Elements are automatically sorted.

    Output:

    10
    20
    30
    40
    50

    Size: 5
*/
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        System.out.print("Elements: ");
        for (Integer num : numbers){
            System.out.printf("%d ", num);
        }
        System.out.printf("%nSize: %d", numbers.size());
    }

}

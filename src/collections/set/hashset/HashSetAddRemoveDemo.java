package collections.set.hashset;

import java.util.HashSet;

public class HashSetAddRemoveDemo {
    public static void main(String[] args) {
        /*
    Question:
    Create a HashSet<Integer>

    Add:

    10
    20
    30
    40

    Then:

    Remove 20

    Add 50

    Print:

    Elements
    Size

    Observe:
    HashSet does not maintain insertion order.
*/

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.remove(20);
        numbers.add(50);
        System.out.print("Elements: ");
        for (Integer num:numbers){
            System.out.printf("%d ", num);
        }

        System.out.printf("%nSize: %d", numbers.size());
    }
}

package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayListDemo {
    public static void main(String[] args) {
        /*
            Question:
            Create an ArrayList<Integer>.

            Add:

            50
            10
            40
            20
            30

            Sort the list in ascending order.

            Print the sorted list.

            Output:

            [10, 20, 30, 40, 50]
        */

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        //sorting
//       numbers.sort(null);
        Collections.sort(numbers);
        System.out.printf("Sorted Number in ascending order: %s%n", numbers);

        //sorting descending order
        numbers.sort(Collections.reverseOrder());
        System.out.printf("Sorted Number in descending order: %s%n", numbers);

    }
}

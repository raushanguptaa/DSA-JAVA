package collections.list.vector;

import java.util.Vector;

public class VectorMethodsDemo {
    public static void main(String[] args) {
                /*
            Question:
            Create a Vector<Integer>

            Add:

            10
            20
            30
            40

            Perform:

            1. Add 50
            2. Remove 20
            3. Update 30 to 35
            4. Check if 40 exists

            Print final Vector.

            Output:

            40 found

            [10, 35, 40, 50]
        */

        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.add(50);

        numbers.remove(Integer.valueOf(20));
        numbers.setElementAt(35,1);

        int findNum = 40;
        if (numbers.contains(findNum)){
            System.out.printf("%d is found.%n", findNum);
        }else{
            System.out.printf("%d is not found.%n", findNum);
        }

        System.out.println("Elements: "+numbers);
    }
}

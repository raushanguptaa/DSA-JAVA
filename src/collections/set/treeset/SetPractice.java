package collections.set.treeset;

import java.util.TreeSet;

public class SetPractice {
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
    20
    10

    Print:

    All Elements
    First Element
    Last Element

    Remove 30

    Check if 40 exists

    Print:

    Updated Elements
    Size

    Output:

    Elements:
    10 20 30 40 50

    First: 10
    Last: 50

    40 found

    Updated Elements:
    10 20 40 50

    Size: 4
*/

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.print("Elements: ");
        for (Integer num: numbers){
            System.out.printf("%d ",num);
        }

        System.out.printf("%nFirst Element: %d%n", numbers.first());
        System.out.printf("Last Element: %d%n", numbers.last());

        System.out.printf("Removed Element: %b%n",numbers.remove(30));

        int findNum = 40;
        if (numbers.contains(findNum)){
            System.out.printf("%d found.%n", findNum);
        }else {
            System.out.printf("%d is not found.%n", findNum);
        }

        System.out.print("Updated Elements: ");
        for (Integer num: numbers){
            System.out.printf("%d ",num);
        }

        System.out.printf("%nSize %d", numbers.size());
    }
}

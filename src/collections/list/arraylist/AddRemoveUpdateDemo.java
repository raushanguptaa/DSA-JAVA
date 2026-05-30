package collections.list.arraylist;

import java.util.ArrayList;

public class AddRemoveUpdateDemo {
    public static void main(String[] args) {

        /*
        Question:
        Create an ArrayList of Integer.

        Add:
        10
        20
        30
        40

        Perform:

        1. Add 50
        2. Remove 20
        3. Update 30 to 35

        Print final list.

        Output:

        [10, 35, 40, 50]
    */

        ArrayList<Integer> number = new ArrayList<>();

        //add
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        number.add(50);
        //remove by value 20
        number.remove(Integer.valueOf(20));
        //update 30 to 35
        number.set(1, 35);

        //print arraylist
        System.out.println("number: "+number);
    }
}

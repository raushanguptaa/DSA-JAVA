package collections.map.hashmap;

import java.util.HashMap;

public class HashMapSearchDemo {
    public static void main(String[] args) {
        /*
    Question:
    Create a HashMap<Integer, String>

    Add:

    101 -> John
    102 -> Alice
    103 -> Bob

    Search for:

    Key 102
    Key 105

    Print:

    102 found -> Alice
    105 not found

    Also print total size.
*/

        HashMap<Integer, String> person = new HashMap<>();
        person.put(101, "John");
        person.put(102, "Alice");
        person.put(103, "Bob");

        int findPerson = 101;
        if (person.containsKey(findPerson)){
            System.out.printf("%d found -> %s%n", findPerson, person.get(findPerson));
        }else {
            System.out.printf("%d not found%n", findPerson);
        }

        System.out.printf("Size: %d",person.size());
    }
}

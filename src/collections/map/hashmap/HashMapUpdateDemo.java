package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUpdateDemo {
    public static void main(String[] args) {
        /*
    Question:
    Create a HashMap<Integer, String>

    Add:

    101 -> John
    102 -> Alice
    103 -> Bob

    Update:

    102 -> Alice Smith

    Remove:

    103

    Print all key-value pairs.

    Also print size.

    Expected Output:

    101 -> John
    102 -> Alice Smith

    Size: 2
*/

        HashMap<Integer, String> person = new HashMap<>();
        person.put(101, "John");
        person.put(102, "Alice");
        person.put(103, "Bob");

        person.replace(102, "Alice Smith");

        person.remove(103);

        System.out.print("Updated Elements: \n");
        for (Map.Entry<Integer, String> entry: person.entrySet()){
            System.out.printf("%d -> %s%n", entry.getKey(),entry.getValue());
        }

        System.out.printf("Size: %d",person.size());
    }
}

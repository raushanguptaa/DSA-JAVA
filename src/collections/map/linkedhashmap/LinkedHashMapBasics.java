package collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapBasics {
    public static void main(String[] args) {
        /*
    Question:
    Create a LinkedHashMap<Integer, String>

    Add:

    101 -> John
    102 -> Alice
    103 -> Bob

    Print all key-value pairs.

    Also print size.

    Observe:
    Insertion order should be maintained.
*/
        LinkedHashMap<Integer, String> person = new LinkedHashMap<>();
        person.put(101, "John");
        person.put(102, "Alice");
        person.put(103, "Bob");

        for (Map.Entry<Integer, String> entry: person.entrySet()){
            System.out.printf("Id: %d, Name: %s%n", entry.getKey(), entry.getValue());
        }

        System.out.printf("Size: %d", person.size());
    }
}

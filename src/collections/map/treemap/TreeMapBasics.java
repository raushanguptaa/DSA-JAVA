package collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapBasics {
    public static void main(String[] args) {
        /*
    Question:
    Create a TreeMap<Integer, String>

    Add:

    103 -> Bob
    101 -> John
    102 -> Alice
    105 -> David
    104 -> Charlie

    Print all entries.

    Also print size.

    Observe:
    Keys should be automatically sorted.

    Output:

    101 -> John
    102 -> Alice
    103 -> Bob
    104 -> Charlie
    105 -> David

    Size: 5
*/

        TreeMap<Integer, String> person = new TreeMap<>();
        person.put(103, "Bob");
        person.put(101, "John");
        person.put(102, "Alice");
        person.put(105, "David");
        person.put(104, "Charlie");

        System.out.print("Entries: \n");
        for (Map.Entry<Integer, String> entry: person.entrySet()){
            System.out.printf("Id: %d, Name: %s%n", entry.getKey(), entry.getValue());
        }

        System.out.printf("Size: %d", person.size());

    }
}

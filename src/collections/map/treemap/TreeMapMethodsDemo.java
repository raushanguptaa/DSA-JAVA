package collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMethodsDemo {
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

    Print:

    First Key
    Last Key

    Search for key 102.

    Remove key 103.

    Print updated entries.

    Also print size.
*/

        TreeMap<Integer, String> person = new TreeMap<>();
        person.put(103, "Bob");
        person.put(101, "John");
        person.put(102, "Alice");
        person.put(105, "David");
        person.put(104, "Charlie");

        System.out.printf("First Key: %d%n", person.firstKey());
        System.out.printf("Last Key: %d%n", person.lastKey());

        int findPersonById = 102;
        if (person.containsKey(findPersonById)){
            System.out.printf("%d found%n", findPersonById);
        }else {
            System.out.printf("%d not found%n", findPersonById);
        }

        person.remove(103);

        System.out.print("Updated Entries: \n");
        for (Map.Entry<Integer, String> entry: person.entrySet()){
            System.out.printf("Id: %d, Name: %s%n", entry.getKey(), entry.getValue());
        }

        System.out.printf("Size: %d", person.size());

    }
}

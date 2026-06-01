package collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        /*
    Question:

    Create a LinkedHashMap<Integer, String>

    Add:

    101 -> John
    102 -> Alice
    103 -> Bob
    104 -> David

    Search for key 103.

    Update:

    104 -> David Smith

    Remove:

    101

    Print:

    Updated Entries
    Size

    Observe:
    Insertion order should still be maintained.
*/
        LinkedHashMap<Integer, String> person = new LinkedHashMap<>();
        person.put(101, "John");
        person.put(102, "Alice");
        person.put(103, "Bob");
        person.put(104, "David");

        int findPersonbyId = 103;
        if (person.containsKey(findPersonbyId)){
            System.out.printf("%d found%n", findPersonbyId);
        }else {
            System.out.printf("%d not found%n", findPersonbyId);
        }

        person.replace(104, "David Smith");
        person.remove(101);

        System.out.print("Updated Entries: \n");
        for (Map.Entry<Integer, String> entry: person.entrySet()){
            System.out.printf("Id: %d, Name: %s%n", entry.getKey(), entry.getValue());
        }

        System.out.printf("Size: %d", person.size());
    }

}

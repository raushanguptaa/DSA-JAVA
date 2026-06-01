package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    /*
    Question:

    Create a HashMap<Integer, String>

    Add:

    101 -> John
    102 -> Alice
    103 -> Bob
    104 -> David

    Print all entries.

    Search for key 102.

    Update:

    104 -> David Smith

    Remove:

    101

    Print:

    Updated Entries
    Total Size

    Expected Output:

    102 found -> Alice

    Updated Entries:

    102 -> Alice
    103 -> Bob
    104 -> David Smith

    Size: 3
*/

    public static void main(String[] args) {
        HashMap<Integer, String> person = new HashMap<>();
        person.put(101, "John");
        person.put(102, "Alice");
        person.put(103, "Bob");
        person.put(104, "David");

        person.replace(104, "David Smith");
        int findPerson = 102;
        if (person.containsKey(findPerson)){
            System.out.printf("%d found -> %s%n", findPerson, person.get(findPerson));
        }else {
            System.out.printf("%d not found%n", findPerson);
        }
        person.remove(101);
        System.out.println("Updated Entries: ");
        for (Map.Entry<Integer, String> entry: person.entrySet()){
            System.out.printf("%d -> %s%n", entry.getKey(),entry.getValue());
        }

        System.out.printf("Size: %d",person.size());
    }
}

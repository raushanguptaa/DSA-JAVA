package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        /*
    Question:
    Create a HashMap<Integer, String>

    Add:

    101 -> John
    102 -> Alice
    103 -> Bob

    Print:

    All key-value pairs

    Also print:

    Size

    Expected Output:

    101 -> John
    102 -> Alice
    103 -> Bob

    Size: 3
*/

        HashMap<Integer, String> person = new HashMap<>();

        person.put(101, "John");
        person.put(102, "Alice");
        person.put(103, "Bob");

        for (Map.Entry<Integer,String> entry: person.entrySet()){
            System.out.printf("%d -> %s%n",entry.getKey(), entry.getValue());
        }
        System.out.printf("Size: %d%n",person.size());
    }
}

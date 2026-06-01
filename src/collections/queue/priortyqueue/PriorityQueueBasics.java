package collections.queue.priortyqueue;

import java.util.PriorityQueue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        /*
    Question:
    Create a PriorityQueue<Integer>

    Add:

    30
    10
    50
    20
    40

    Print:

    Queue
    Head Element
    Size

    Observe:
    PriorityQueue automatically sorts elements.
*/

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(30);
        numbers.offer(10);
        numbers.offer(50);
        numbers.offer(20);
        numbers.offer(40);

        for (Integer num : numbers){
            System.out.printf("%d%n", num);
        }

        System.out.printf("Head Element: %d", numbers.peek());
        System.out.printf("%nSize: %d", numbers.size());
    }
}

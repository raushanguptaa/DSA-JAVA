package collections.queue.priortyqueue;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
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

    Print Head Element.

    Remove two elements using poll().

    Print:

    Removed Elements
    Remaining Queue
    Size
*/


        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(30);
        numbers.offer(10);
        numbers.offer(50);
        numbers.offer(20);
        numbers.offer(40);

        System.out.printf("Head: %d%n", numbers.peek());
        System.out.printf("Removed element: %d%n", numbers.poll());
        System.out.printf("Removed element: %d%n", numbers.poll());
        System.out.print("Remaining Queue: \n");
        for (Integer num : numbers){
            System.out.printf("%d ", num);
        }
        //current head elements
        System.out.printf("%nHead: %d%n", numbers.peek());
        System.out.printf("Size: %d", numbers.size());
    }
}

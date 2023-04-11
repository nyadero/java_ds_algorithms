package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        FIFO linear data structure. First In First Out
        /*
        enqueue(), offer() - adds element
        dequeue(), poll() - removes element
        peek()
         */

        Queue<String> customers = new LinkedList<String>();
//        add
        customers.offer("James");
        customers.offer("Brian");
        customers.offer("Lydia");

        System.out.println(customers.peek());

        System.out.println(customers.poll());
        System.out.println(customers);

//        check if queue is empty
        System.out.println(customers.isEmpty());

//        size of queue
        System.out.println(customers.size());

//        check if queue contains an element
        System.out.println(customers.contains("Lydia"));

        /*
          uses of queues
          1. key buffers letters appear on the screen in the sequence they are typed in
          2 printer jobs
          3 used in linkedLists, PriorityQueues, Breadth-first search
         */
    }
}

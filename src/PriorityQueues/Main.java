package PriorityQueues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*
        Priority queue is a dta structure that serves elements with the highest priority first before elements with lower priority
         */

        Queue<Double> grades = new PriorityQueue<>(Collections.reverseOrder());

        grades.offer(89.0);
        grades.offer(73.6);
        grades.offer(67.8);
        grades.offer(90.6);

        System.out.println(grades);
    }
}

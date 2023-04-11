package LinkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<String>();

//        queue
        students.offer("James");
        students.offer("Anne");
        students.offer("Bowers");
        students.offer("Karen");

//        poll
        students.poll();

//        add first
        students.addFirst("Brian");
//        add last
        students.addLast("Justina");
//        peek first  item
        System.out.println(students.peekFirst());
//        peek last
        System.out.println(students.peekLast());

//        add at a given index
        students.add(2, "Vincent");

//        remove
        students.remove("Karen");

//        search
        System.out.println(students.indexOf("Vincent"));

//        remove first
        students.removeFirst();
//        remove last
        students.removeLast();

        System.out.println(students);

    }
}

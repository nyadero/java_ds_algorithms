package stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        stacks data structures is LIFO structure.Stores object in form of a vertical tower push() to add to the top,
//        pop() to remove from the top

    /*
    * uses of stacks
    * redo/undo features in text editors
    * moving back and forward through browser history
    * backtracking algorithms ie maze, file directories
    * calling functions
    * */

        Stack<String> movies = new Stack<String>();
//        add to the stack
        movies.push("The Godfather");
        movies.push("The Good Doctor");
        movies.push("3 Idiots");

//        check if the stack is empty
        System.out.println(movies.empty());

//        return the first item in the stack
        System.out.println(movies.peek());

//        remove top item in the stack
        movies.pop();

//        search item in the stack
        System.out.println(movies.search("The Godfather"));
        System.out.println(movies);
    }
}
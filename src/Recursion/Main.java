package Recursion;

public class Main {
    public static void main(String[] args) {
        // Recursion - when a thing is defined in terms of itself
        // Apply the result of a procedure to a procedure
        // Commonly used with advanced sorting algorithms and navigating trees
        // Advantages - Easier to read and write, Easier to debug
        // Disadvantages - Uses mre memory and sometimes slow

        walk(5);
        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return 1; // base case
        return base * power(base, exponent - 1);
    }

    private static int factorial(int num) {
        if(num < 1) return 1; // base case
        return num * factorial(num - 1);
    }

    private static void walk(int steps) {
        if(steps < 1) return; // base case
        System.out.println("You have taken a step");
        walk(steps - 1);
    }
}

package BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        * Binary search is a search algorithm that finds the position of a target value within a sorted array.
        * Half of the array is eliminated through each step
        */

        int[] array = new int[1_000_000];
        int targetValue = 900_000;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

//        int index = Arrays.binarySearch(array, targetValue);
        int index = binarySearch(array, targetValue);

        if(index != -1){
            System.out.println("Element found at index " + index);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] array, int targetValue) {
        int low = 0;
        int high = array.length -1;
        while (low <= high){
            int middle = low + (high - low) /2;
            int value = array[middle];
            System.out.println("Middle value is " + value);
            if(value < targetValue) low = middle + 1;
            else if (value > targetValue) high = middle -1;
            else return middle; // targetValue has been found
        }
        return -1;
    }
}

package LinearSearch;

public class Main {
    public static void main(String[] args) {
        /*
        * linear search - iterate through a collection one element at a time.
        * runtime complexity O(n)
        * disadvantages - slow for large data sets
        * advantages - fast for small to medium data sets
        *             -does not need to be sorted
        *             -useful for data structures that do not have random access (linkedlists)
        * */

        int[] array = {10, 50, 60, 20, 2, 7, 99};

        int index = linearSearch(array, 20);

        if (index != -1){
            System.out.println("Element found at index " + index);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
//        loop
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}

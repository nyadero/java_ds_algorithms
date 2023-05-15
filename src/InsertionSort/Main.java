package InsertionSort;

public class Main {
    public static void main(String[] args) {
      // Insertion sort -> compare elements to the left and shift elements to the right to make room for value insertion
        // less steps than bubble sort, bad for large data

        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);

        for (int i: array) {
            System.out.println(i + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
           int temp = array[i];
           int j = i - 1;
           while(j >= 0 && array[j] > temp){
               array[j+1] = array[j];
               j--;
           }

           array[j+1] = temp;
        }
    }
}

package BubbleSort;

public class Main {
    public static void main(String[] args) {
        /*
        Bubble sort - pairs of adjacent elements are compared, and the elements are swapped if they are not in order
        okay for small data sets
        takes quadratic time 0(n^2)
         */

        int[] array = {9,3,8, 4, 6, 1, 7, 2, 5};
        System.out.println(array);
        bubbleSort(array);
        for (int i: array) {
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1 ; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}

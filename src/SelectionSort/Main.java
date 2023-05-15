package SelectionSort;

public class Main {
    public static void main(String[] args) {
     // Selection sort - search through an array and keep track of the minimum value during each iteration. At the end of each iteration, variables are swapped. Takes quadratic  time O(n^2). Okay for small data

        int[] array = {8, 3, 2, 4, 9, 5, 3, 6, 1, 7};

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(i);
//        }

        selectionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(i);
        }

    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = 0; j < array.length; j++) {
                if (array[min] > array[j]){
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}

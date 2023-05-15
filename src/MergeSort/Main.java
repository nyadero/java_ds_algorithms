package MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length <= 1 ) return;
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        for (; i < length; i++) {
           if(i < middle){
               leftArray[i] = array[i];
           }else{
               rightArray[j] = array[i];
               j++;
           }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){
       int leftSize = array.length / 2;
       int rightSize = array.length - leftSize;
       int l = 0, r = 0, i = 0;
       while(l < leftSize && r < rightSize ){
           if(leftArray[l] < rightArray[r]){
               array[i] = leftArray[l];
               l++;
               i++;
           }else{
               array[i] = rightArray[r];
               i++;
               r++;
           }
       }
       while(l < leftSize){
           array[i] = leftArray[l];
           i++;
           l++;
       }

       while(r < rightSize){
           array[i] = rightArray[r];
           i++;
           r++;
       }
    }
}

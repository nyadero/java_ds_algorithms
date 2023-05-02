package InterpolationSearches;

public class Main {
    public static void main(String[] args) {
        /*
          Interpolation searches are an improvement of the binary search that are best suited for uniformly distributed data
          guesses where a value might be based on calculated probe results. If a probe is incorrect, search are is narrowed and
          a new probe is calculated

         */

        int[] array = {1,2,4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int index = interpolationSearch(array, 256);

        if (index != -1){
            System.out.println("Element found at index " + index);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int low = 0, high = array.length - 1;
        while (value >= array[low] && value <= array[high] && low <= high){
           int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("Probe " + probe);
            if(array[probe] == value) return probe;
            else if (array[probe] < value) low = probe + 1;
            else high = probe -1;
        }
        return -1;
    }
}

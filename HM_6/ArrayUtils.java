package HM_6;

public class ArrayUtils {

    // Method for filling an array with random integer
    public static void arrayWithRandomNumbers(int[] array){

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100) + 1;
        }
    }

    // Method for sorting an array using an algorithm
    public static void insertionSort(int[] array){

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;


        // Move elements that are larger than current
        while (j >= 0 && array[j] > current){
            array[j + 1] = array[j];
            j--;
        }
        // Insert the current element into the correct position
        array[j + 1] = current;
        }
    }

    // Method for binary  search of a number in an array
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == target) {

                // Return the index if the element is found
                return middle;
            }
            if (array[middle] < target) {

                // We are looking in the right half
                left = middle + 1;
            } else {

                // We are looking in the left half
                right = middle - 1;
            }
        }

        // if the item is not found
        return -1;
    }

    // Method for outputting array elements
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

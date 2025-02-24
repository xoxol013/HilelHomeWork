package HM_6;

import java.util.Scanner;

public class MainArray {

    public static void main(String[] args) {

        // Creating an array of integers
        int[] numbers = new int[15];

        // Fill the array with random numbers
        ArrayUtils.arrayWithRandomNumbers(numbers);

        // We output the initial form on the array
        System.out.println("initial form on the array: ");
        ArrayUtils.printArray(numbers);

        // Sorting an array using an algorithm
        ArrayUtils.insertionSort(numbers);

        // Output the sorted array
        System.out.println("The sorted array: ");
        ArrayUtils.printArray(numbers);

        // Ask the user to enter a number to search for in the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        // We use the binary search algorithm
        int result = ArrayUtils.binarySearch(numbers, target);

        if (result != -1){
            System.out.println("Number " + target + " found in array by index " + result);
        } else {
            System.out.println("Number " + target + " not found in array ");
        }
        scanner.close();
    }
}

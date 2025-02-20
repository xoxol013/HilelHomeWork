package HM_5;

public class ArrayMain {

    public static void main(String[] args) {
        // Create an array with 20 elements
        int[] array1 = ArrayOperations.createArray();
        System.out.print("Масив 1: ");
        ArrayOperations.printArray(array1);

        // Create an array of random integers
        int[] array2 = ArrayOperations.generateRandomArray();
        System.out.print("Масив 2: ");
        ArrayOperations.printArray(array2);

        // Find and print the sum of all negative numbers in an array
        int negativeSum = ArrayOperations.sumNegativeNumbers(array2);
        System.out.println("Сума від'ємних чисел в масиві: " + negativeSum);

        // Find and display the number of even and odd numbers in an array
        ArrayOperations.countEvenOddNumbers(array2);

        // Find and display the largest and smallest elements of an array and their indices
        ArrayOperations.findMinMax(array2);

        // Find and display the arithmetic mean of the numbers after the first negative number
        ArrayOperations.averageAfterFirstNegative(array2);
    }
}

package HM_5;

public class ArrayOperations {

    // Method for creating an array with 20 elements
    public static int[] createArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i; // Fill in the values
        }
        return array;
    }

    // Method for creating an array filled with random numbers
    public static int[] generateRandomArray() {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }

        return array;
    }

    // Method for finding and outputting the sum of all negative numbers in an array
    public static int sumNegativeNumbers(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) { // negative number
                sum += array[i];
            }
        }

        return sum;
    }

    // Method for finding and deriving the number of even and odd numbers
    public static void countEvenOddNumbers(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // Checking if the number is even
                evenCount++;
            } else { // if odd
                oddCount++;
            }
        }

        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
    }

    // Method for finding the largest and smallest element of an array and their indices
    public static void findMinMax(int[] array) {
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Updating the maximum value
                maxIndex = i; // Update the index of the maximum element
            }
            if (array[i] < min) {
                min = array[i]; // Updating the minimum value
                minIndex = i; // Update the index of the minimum element
            }
        }

        System.out.println("Найбільший елемент: " + max + " (індекс: " + maxIndex + ")");
        System.out.println("Найменший елемент: " + min + " (індекс: " + minIndex + ")");
    }

    // Method for finding the arithmetic mean of numbers after the first negative number in an array
    public static void averageAfterFirstNegative(int[] array) {
        int firstNegativeIndex = -1;

        // Looking for the first negative number
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        // If no negative numbers are found
        if (firstNegativeIndex == -1) {
            System.out.println("В масиві немає від'ємних чисел.");
            return;
        }

        // If there are elements after the first negative number
        int sum = 0;
        int count = 0;
        for (int i = firstNegativeIndex + 1; i < array.length; i++) {
            sum += array[i];
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + average);
        } else {
            System.out.println("Немає елементів після першого від'ємного числа для обчислення середнього арифметичного.");
        }
    }

    // Method for outputting array elements
    public static void printArray(int[] array) {
        System.out.print("Елементи масиву: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}


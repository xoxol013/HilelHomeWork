package HM_4;

public class SumOfNumber {
    public static void main(String[] args) {

        // Variable for accumalating the amount
        int totalSum = 0;

        for (int num = 1; num <= 6; num++) {
            totalSum += num; // Add the current number to the total
            System.out.println(num + ") Num is " + num + ", sum is " + totalSum);
        }

        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + totalSum);
    }
}


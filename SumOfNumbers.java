import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Read n numbers from the user
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum using the sumOfNumbers method
        int sum = sumOfNumbers(numbers);

        // Display the sum
        System.out.println("Sum of the numbers: " + sum);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the sum of an array of numbers
    public static int sumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

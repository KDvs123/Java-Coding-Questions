import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the user
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a new number");

        // Read the integer input from the user
        int number = s.nextInt();

        // Check if the entered number is prime and print the result
        System.out.println(isPrime(number) ? "is prime number" : "is not prime number");
    }

    // Method to determine if a number is prime
    private static boolean isPrime(int number) {
        // Check if the number is less than or equal to 1 (not prime)
        if (number <= 1) {
            return false;
        }

        // Loop from 2 to the square root of the number
        // This reduces the number of iterations needed for checking divisibility
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by any number in this range, it is not prime
            if (number % i == 0) {
                return false;
            }
        }

        // If no divisors were found, the number is prime
        return true;
    }
}

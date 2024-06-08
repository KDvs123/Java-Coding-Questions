import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number");
        
        // Read the integer input from the user
        int number = input.nextInt();

        // Initialize a variable to store the factorial result
        int factorial = 1;

        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Multiply the current value of factorial by i
            factorial *= i;
        }

        // Print the factorial of the entered number
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

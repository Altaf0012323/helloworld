package operators;
import java.util.Scanner;

public class Arithematicoperation {

	public static void main(String[] args) {
		//Author : Altaf Dar
		// Script:30
		// Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take first number input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); //Reads an integer value from the user and store it in num1

        // Take second number input
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();//Read an integer value from the user and store it in num2

        // Perform operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int division = num1 / num2;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);

        // Close scanner
        sc.close();
    }}



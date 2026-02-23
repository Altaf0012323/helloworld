package operators;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take first number input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Take second number input
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Display original values
        System.out.println("Before Swapping:");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);

        // Using third variable for swapping
        int temp = num1;   // Store num1 value in temp
        num1 = num2;       // Assign num2 value to num1
        num2 = temp;       // Assign temp value to num2

        // Display swapped values
        System.out.println("After Swapping:");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);

        // Close scanner
        sc.close();
    }
}



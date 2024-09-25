package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            double num1, num2, result;
            switch (choice) {
                case 1:
                    // Square root function
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        result = squareRoot(num1);
                        System.out.println("√" + num1 + " = " + result);
                    } else {
                        System.out.println("Error! Cannot calculate square root of a negative number.");
                    }
                    break;

                case 2:
                    // Factorial function
                    System.out.print("Enter a non-negative integer: ");
                    int number = scanner.nextInt();
                    if (number >= 0) {
                        result = factorial(number);
                        System.out.println(number + "! = " + (int) result);
                    } else {
                        System.out.println("Error! Factorial of a negative number is not defined.");
                    }
                    break;

                case 3:
                    // Natural logarithm function
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 > 0) {
                        result = naturalLog(num1);
                        System.out.println("ln(" + num1 + ") = " + result);
                    } else {
                        System.out.println("Error! Natural logarithm is not defined for non-positive numbers.");
                    }
                    break;

                case 4:
                    // Power function x^b
                    System.out.print("Enter the base number (x): ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent (b): ");
                    num2 = scanner.nextDouble();
                    result = power(num1, num2);
                    System.out.println(num1 + "^" + num2 + " = " + result);
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    // Factorial function for non-negative integers
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Square root method
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    // Natural logarithm method
    public static double naturalLog(double num) {
        return Math.log(num);
    }

    // Power function
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

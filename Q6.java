/*Simple Calculator:
Q6: Implement a simple calculator that performs addition, subtraction, multiplication, or division based on user input. Use if-else to decide the operation. 
 */

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            System.out.print("Enter operation (+, -, *, /): ");
            char operation = sc.next().charAt(0);
            double result;

            if (operation == '+') {
                result = num1 + num2;
            } else if (operation == '-') {
                result = num1 - num2;
            } else if (operation == '*') {
                result = num1 * num2;
            } else if (operation == '/') {
                result = num1 / num2;
            } else {
                System.out.println("Invalid operation.");
                return;
            }

            System.out.println("Result: " + result);
        }
    }
}

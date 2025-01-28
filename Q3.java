/*Largest of Three Numbers:
Q3: Write a program that takes three integers as input and determines the largest among them using if-else.  */

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter third number: ");
            int num3 = sc.nextInt();

            if (num1 >= num2 && num1 >= num3) {
                System.out.println("The largest number is: " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("The largest number is: " + num2);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        }
    }
}

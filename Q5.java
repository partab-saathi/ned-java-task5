/*Positive, Negative, or Zero:
Q5: Write a program that takes a number as input and checks whether it is positive, negative, or zero. */

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                System.out.println(num + " is positive.");
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
    }
}

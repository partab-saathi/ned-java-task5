/*Q1: Odd or Even Checker:
Write a program that takes an integer as input and checks if it is odd or even. */

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }
    }
}

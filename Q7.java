/*Eligibility for Voting:
Q7: Create a program that takes a person's age as input and checks if they are eligible to vote (age 18 or older). */

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        }
    }
}

/*Leap Year Checker:
Q4:  Create a program that checks if a given year is a leap year.  */

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}

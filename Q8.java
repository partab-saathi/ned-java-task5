/*Q8: Day of the Week:
Create a program that takes an integer (1 to 7) and prints the corresponding day of the week (Monday to Sunday) using if-else. */
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number (1 to 7): ");
            int day = sc.nextInt();

            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else if (day == 7) {
                System.out.println("Sunday");
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
            }
        }
    }
}

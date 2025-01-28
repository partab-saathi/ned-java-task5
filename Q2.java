/*Grade Calculator:
Q2:  Create a program that takes a student's score as input and assigns a grade (A, B, C, etc.) based on predefined ranges using if-else statements. 
 */
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter student's score: ");
            int score = sc.nextInt();
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Grade: " + grade);
        }
    }
}

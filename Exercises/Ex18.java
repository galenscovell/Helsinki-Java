
// Given points, prints the course grade.

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Points earned [0-100]: ");
        int points = Integer.parseInt(reader.nextLine());

        if (points >= 0 && points <= 59) {
            System.out.println("Grade: F");
        } else if (points >= 60 && points <= 69) {
            System.out.println("Grade: D");
        } else if (points >= 70 && points <= 79) {
            System.out.println("Grade: C");
        } else if (points >= 80 && points <= 89) {
            System.out.println("Grade: B");
        } else if (points >= 90 && points <= 100) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Invalid score.");
        }
    }
}
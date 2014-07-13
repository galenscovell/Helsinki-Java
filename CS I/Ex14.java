
// Asks user for number and prints whether it is positive or negative.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        if (num > 0) {
            System.out.println("Number is positive.");
        } else if (num == 0) {
            System.out.println("Number is zero.");
        } else {
            System.out.println("Number is negative.");
        }
    }
}
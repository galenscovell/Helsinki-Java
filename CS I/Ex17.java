
// Asks for two numbers then prints which is greater.

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First number: ");
        int a = Integer.parseInt(reader.nextLine());

        System.out.print("Second number: ");
        int b = Integer.parseInt(reader.nextLine());

        int largerNum = Math.max(a, b);

        if (a == b) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("Greater number: " + largerNum);
        }
    }
}

// Given two user-defined numbers, prints the larger.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("\nFirst number: ");
        int a = Integer.parseInt(reader.nextLine());

        System.out.print("Second number: ");
        int b = Integer.parseInt(reader.nextLine());

        System.out.println("\nMax(" + a + "," + b + ") is " + Math.max(a, b) + "\n");

    }
}
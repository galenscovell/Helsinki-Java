
// Circumference of a circle is 2 * pi * radius. 
// Given a user defined radius, prints the circumference.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("\nWhat is the radius? > ");
        int radius = Integer.parseInt(reader.nextLine());
        double circumference = 2 * radius * Math.PI;

        System.out.println("\nCircumference of the circle is: " + circumference);

    }
}
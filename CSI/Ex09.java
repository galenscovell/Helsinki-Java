
// Asks user for input of two numbers, then prints the result of their division

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is the numerator? > ");
        double a = Integer.parseInt(reader.nextLine());
        System.out.print("What is the denominator? > ");
        int b = Integer.parseInt(reader.nextLine());

        double result = (double)a / (double)b;

        System.out.println(a + " divided by " + b + " equals " + result);

    }
}
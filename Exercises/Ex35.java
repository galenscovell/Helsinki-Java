
// Calculates sum of 2^0 + 2^1 + ... + 2^n, where n is user-defined.

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("n: ");
        int n = Integer.parseInt(reader.nextLine());
        int sum =  0;

        if (n >= 0) {
            while (n >= 0) {
                sum += (int)Math.pow(2, n);
                n--;
            }
            System.out.println("Sum is: " + sum);

        } else {
            System.out.println("Invalid n.");
        }
    }
}
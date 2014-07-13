
// Calculates factorial of user-defined number n.

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int fac = 1;
        System.out.print("Factorial of: ");
        int num = Integer.parseInt(reader.nextLine());

        while (num >= 1) {
            fac *= num;
            num--;
        }

        System.out.println("Factorial is: " + fac);
    }
}
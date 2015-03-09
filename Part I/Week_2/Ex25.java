
// Asks user for three numbers and prints their sum.

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int read = 0;

        System.out.print("First number: ");
        read += Integer.parseInt(reader.nextLine());

        System.out.print("Second number: ");
        read += Integer.parseInt(reader.nextLine());

        System.out.print("Third number: ");
        read += Integer.parseInt(reader.nextLine());

        System.out.println("Sum: " + read);

    }
}


// Asks user for numbers and prints their running sum until input of 0.

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Number to Add (Zero to Exit): ");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            sum += read;
            System.out.println("Current Sum: " + sum);
        }

        System.out.println("Final Sum: " + sum);
    }

}
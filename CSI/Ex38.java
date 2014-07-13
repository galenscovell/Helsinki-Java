
// Learning how to create and use methods

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How many times to run method? > ");
        int runs = Integer.parseInt(reader.nextLine());

        while (runs > 0) {
            printText();
            runs--;
        }
    }

    public static void printText() {
        System.out.println("\nIn the beginning there were the swamp, the hoe and Java.");
        System.out.println("...What is that supposed to mean?");
    }
}
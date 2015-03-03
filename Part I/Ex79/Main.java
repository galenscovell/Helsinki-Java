
/**
 * Main class for Ex79 implementing a Statistics object.
 * Asks user for number input until -1 is entered.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();

        double input = 0.0;
        while (input != -1.0) {
            System.out.println("Add a value (-1 to end): ");
            input = Double.parseDouble(reader.nextLine());
            if (input != -1.0) {
                stats.addNumber(input);
            }
        }
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average());
    }
}
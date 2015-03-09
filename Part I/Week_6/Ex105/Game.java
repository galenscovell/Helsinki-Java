
/**
 * Game class for Ex105
 */

import java.util.Scanner;

public class Game {

    private Scanner reader;

    public Game() {
        this.reader = new Scanner(System.in);
    }

    public boolean greaterThan(int value) {
        String choice = "";
        while (!choice.equals("Y") && !choice.equals("N")) {
            System.out.print("Is the number greater than " + value + "? (Y/N) > ");
            choice = this.reader.nextLine().toUpperCase();
        }
        if (choice.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }

    public int average(int first, int second) {
        int total = first + second;
        int mean = total / 2;
        return mean;
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int mean;
        int steps = 0;

        while (upperLimit - lowerLimit != 2) {
            steps += 1;
            mean = average(lowerLimit, upperLimit);

            if (greaterThan(mean)) {
                lowerLimit = mean;
            } else {
                upperLimit = mean;
            }
        }
        System.out.println("The number is " + average(lowerLimit, upperLimit) + ".");
        System.out.println("Took " + steps + " turns.\n");
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = halvable(upperLimit - lowerLimit);
        System.out.println("\nThink of a number between " + lowerLimit + " and " + upperLimit + ".");
        System.out.println("This number can be guessed within " + maxQuestions + " guesses.");
        System.out.println("\nAnswer the following questions about the number: ");
    }

    public static int halvable(int number) {
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
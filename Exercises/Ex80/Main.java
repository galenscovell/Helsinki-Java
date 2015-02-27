
/**
 * Main class for Ex80 implementing a dice rolling interface.
 * User defines the type of die to roll.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = 0;

        while (input <= 0) {
            System.out.println("Dice sides: ");
            input = Integer.parseInt(reader.nextLine());
        }
        Dice dice = new Dice(input);

        int i = 0;
        while (i < 10) {
            System.out.println(dice.roll());
            i++;
        }
    }
}
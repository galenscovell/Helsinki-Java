
// Prints user-defined list of words in reversed, shuffled or sorted order

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Ex60 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println();
        boolean running = true;
        while (running) {
            System.out.print("New word(or 'done'): ");
            String userInput = input.nextLine();

            if (userInput.equals("done")) {
                running = false;
            } else if (userInput.length() != 0) {
                words.add(userInput);
            }

        }

        System.out.println();
        boolean choice = true;
        while (choice) {
            System.out.print("Shuffle, reverse, or sort: ");
            String userInput = input.nextLine();

            if (userInput.equals("shuffle")) {
                Collections.shuffle(words);
                choice = false;
            } else if (userInput.equals("reverse")) {
                Collections.reverse(words);
                choice = false;
            } else if (userInput.equals("sort")) {
                Collections.sort(words);
                choice = false;
            }

        }

        System.out.println();
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();

    }
}
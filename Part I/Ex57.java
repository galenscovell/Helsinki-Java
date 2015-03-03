
// Creates arraylist with user entries and returns its contents
// Ends upon blank or repeat entry

import java.util.Scanner;
import java.util.ArrayList;

public class Ex57 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.print("Add to list (blank/repeat to exit): ");
            String userInput = input.nextLine();

            if (userInput.length() == 0 || words.contains(userInput)) {
                running = false;
            } else {
                words.add(userInput);
            }
        }

        System.out.print("\n");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("\n" + words + "\n");
    }
}
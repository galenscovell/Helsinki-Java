
/**
 * Main class for Ex103, a birdwatching database.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Database database = new Database();

        System.out.println("\n[Birdhacking: Bird Database]");

        String input = "";
        while (!input.equals("Quit")) {
            System.out.print("? ");
            input = reader.nextLine();
            if (input.equals("Add")) {
                System.out.print("Common name: ");
                String name = reader.nextLine();
                System.out.print("Latin name: ");
                String latin = reader.nextLine();
                Bird newBird = new Bird(name, latin);
                database.add(newBird);
            } else if (input.equals("Observation")) {
                System.out.print("Common name: ");
                String name = reader.nextLine();
                database.observation(name);
            } else if (input.equals("Statistics")) {
                database.statistics();
            } else if (input.equals("Search")) {
                System.out.print("Common name of bird: ");
                String searchBird = reader.nextLine();
                database.search(searchBird);
            } else if (input.equals("Quit")) {
                System.out.println("Closing the database.\n");
            } else {
                System.out.println("Command must be one of [Add, Search, Observation, Statistics, Quit]");
            }
        }
    }
}
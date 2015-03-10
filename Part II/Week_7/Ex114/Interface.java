
/**
 * Interface class for Ex114
 */

import java.util.Scanner;

public class Interface {
    private Dictionary dict;
    private Scanner reader;

    public Interface(Dictionary dict) {
        this.dict = dict;
        this.reader = new Scanner(System.in);
    }

    public void add() {
        System.out.print("\tAdd word: ");
        String word = this.reader.nextLine();
        if (word.isEmpty()) {
            System.out.println("\tWord required.");
        } else {
            System.out.print("\tWord translation: ");
            String translation = this.reader.nextLine();
            if (translation.isEmpty()) {
                System.out.println("\tTranslation required.");
            } else {
                this.dict.add(word, translation);
            }
        }
    }

    public void translate() {
        System.out.print("\tEnter word to translate: ");
        String word = this.reader.nextLine();
        System.out.println("\t" + this.dict.translate(word));
    }

    public void list() {
        System.out.println(this.dict.list());
    }

    public void start() {
        System.out.println("\nArguments: \n\tquit - quit interface\n\tadd - add new word\n\ttranslate - provide translation\n\tlist - list contents of dictionary\n");

        String input = "";
        boolean running = true;
        while (running) {
            System.out.print(" > ");
            input = this.reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("\tClosing dictionary.");
                running = false;
            } else if (input.equals("add")) {
                add();
            } else if (input.equals("translate")) {
                translate();
            } else if (input.equals("list")) {
                list();
            } else {
                System.out.println("\tCommand unrecognized.");
            }
            System.out.println();
        }
    }
}
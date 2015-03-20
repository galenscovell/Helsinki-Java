
/**
 * Main entry for Ex129, analyzing files
 */

import file.Analysis;


public class Main {

    public static void main(String[] args) {
        Analysis input = new Analysis("test.txt");

        System.out.println("\nFull contents of file: " );
        input.printAll();

        System.out.println("\nLines: " + input.lineCount());
        System.out.println("Words: " + input.wordCount());
        System.out.println("Characters: " + input.charCount());
        System.out.println("\nLine 2: ");
        input.getLine(2);

        System.out.println();
    }
}
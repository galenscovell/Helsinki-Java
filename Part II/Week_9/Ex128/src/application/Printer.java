
/**
 * Printer class for Ex128.
 */

package application;

import java.io.File;
import java.util.Scanner;


public class Printer {
    private File f;
    
    public Printer(String fileName) {
        this.f = new File(fileName);
    }

    public void printLinesContaining(String word) {
        Scanner reader = null;

        // Since Exception is fully handled here, Main doesn't need to throw it!
        try {
            reader = new Scanner(this.f, "UTF-8");
        } catch (Exception e) {
            System.out.println("File not found. Error: " + e.getMessage());
            return;
        }

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word) || word.isEmpty()) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}
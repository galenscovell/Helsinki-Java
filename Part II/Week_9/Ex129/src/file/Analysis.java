
/**
 * Analysis class for Ex129
 */

package file;

import java.io.File;
import java.util.Scanner;


public class Analysis {
    private Scanner reader;
    private File file;

    public Analysis(String fileName) {
        this.file = new File(fileName);
    }

    public int lineCount() {
        try {
            this.reader = new Scanner(this.file, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int total = 0;
        while (this.reader.hasNextLine()) {
            this.reader.nextLine();
            total++;
        }
        this.reader.close();
        return total;
    }

    public int wordCount() {
        try {
            this.reader = new Scanner(this.file, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int words = 0;
        String line;
        while (this.reader.hasNextLine()) {
            line = this.reader.nextLine();
            String[] lineWords = line.split(" ");
            words += lineWords.length;
        }
        this.reader.close();
        return words;
    }

    public int charCount() {
        try {
            this.reader = new Scanner(this.file, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int chars = 0;
        String line;
        while (this.reader.hasNextLine()) {
            line = this.reader.nextLine();
            chars += line.length();
        }
        this.reader.close();
        return chars;
    }

    public void getLine(int number) {
        try {
            this.reader = new Scanner(this.file, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int current = 1;
        String line;
        while (this.reader.hasNextLine()) {
            line = this.reader.nextLine();
            if (current == number) {
                System.out.println("\t" + line);
            }
            current++;
        }
        this.reader.close();
    }

    public void printAll() {
        try {
            this.reader = new Scanner(this.file, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        String line;
        while (this.reader.hasNextLine()) {
            line = this.reader.nextLine();
            System.out.println("\t" + line);
        }
        this.reader.close();
    }
}
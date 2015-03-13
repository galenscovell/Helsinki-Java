
/**
 * Main class for Ex128, basics in working with files.
 */

import application.Printer;


public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer("kalevala.txt");

        printer.printLinesContaining("the");
        System.out.println("---------");
    }
}
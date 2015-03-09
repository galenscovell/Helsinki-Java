
/**
 * Main entry for Ex101, creation of a library system 
 * with book objects and search functionality.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book cheese = new Book("Asiago and You", "Gouda Publishing", 1984);
        library.addBook(cheese);

        Book gymnastics = new Book("Overcoming Gravity", "Stephen Lowe", 2012);
        library.addBook(gymnastics);

        Book programming = new Book("Cracking the Coding Interview", "Scaryface Inc.", 1000);
        library.addBook(programming);

        System.out.println("\nBooks in Library:");
        library.printBooks();

        System.out.println("\n---");
        ArrayList<Book> result = library.searchByTitle("Coding");
        for (Book book: result) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: library.searchByPublisher("Lowe")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: library.searchByYear(1851)) {
            System.out.println(book);
        }
    }
}
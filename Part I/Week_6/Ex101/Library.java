
/**
 * Library class for Ex101
 */

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public void printBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searched = new ArrayList<Book>();
        for (Book book : bookList) {
            if (StringUtils.included(book.title(), title)) {
                searched.add(book);
            }
        }
        return searched;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searched = new ArrayList<Book>();
        for (Book book : bookList) {
            if (book.publisher().contains(publisher)) {
                searched.add(book);
            }
        }
        return searched;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> searched = new ArrayList<Book>();
        for (Book book : bookList) {
            if (book.year() == year) {
                searched.add(book);
            }
        }
        return searched;
    }
}

/**
 * Book class implementing ToBeStored interface for Ex118
 */

public class Book implements ToBeStored {
    private String author;
    private String title;
    private double weight;

    public Book(String author, String title, double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.title;
    }
}
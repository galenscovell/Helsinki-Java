
/**
 * Main class for Ex118, more work with interfaces
 */

public class Main {

    public static void main(String[] args) {
        Box box = new Box(5);

        Book book1 = new Book("John Fowles", "The Magus", 1.5);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("A Storm of Swords", "George R.R. Martin", 2);

        CD cd1 = new CD("Ulrich Schnauss", "Faraway Trains Passing By", 2001);
        CD cd2 = new CD("Radiohead", "Amnesiac", 2001);
        CD cd3 = new CD("David Gray", "Life in Slow Motion", 2005);

        box.add(book1);
        box.add(book2);
        box.add(book3);
        box.add(cd1);
        box.add(cd2);
        box.add(cd3);

        System.out.println(box);
    }
}
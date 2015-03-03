
/**
 * Main entry for Ex94, a phonebook
 */

public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        phonebook.printAll();

        String searched = phonebook.search("Pekka Mikkola");
        System.out.println(searched);
        searched = phonebook.search("Martti Tienari");
        System.out.println(searched);
    }
}
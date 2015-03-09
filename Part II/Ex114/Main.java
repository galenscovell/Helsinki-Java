
/**
 * Main class for Ex114, creation of a translation dictionary
 * with text user interface.
 */

public class Main {

    public static void main(String[] args) {
        Dictionary dict = new Dictionary();

        dict.add("green", "midori");
        dict.add("red", "akai");
        dict.add("blue", "aoi");
        dict.add("brown", "chairo");
        dict.add("white", "shiroi");
        dict.add("black", "kuroi");

        System.out.println("\nAmount of words in dictionary: " + dict.amountOfWords());
        System.out.println(dict.list());
        System.out.println(dict.translate("blue"));
        System.out.println(dict.translate("brown"));

        Interface ui = new Interface(dict);
        ui.start();
    }
}


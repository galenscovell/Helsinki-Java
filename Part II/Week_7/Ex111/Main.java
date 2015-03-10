
/**
 * Main class for Ex111, dealing with multiple class interactions
 */

public class Main {

    public static void main(String[] args) {
        Thing book = new Thing("Happiness is a Warm Pickle", 2);
        Thing mobile = new Thing("Motorola G", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);
        tomsCase.addThing(brick);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(mobile);
        georgesCase.addThing(brick);

        Container container = new Container(50);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println("\nFollowing things in Container: ");
        System.out.println(container);
        System.out.println("\nFollowing things in Suitcases: ");
        container.printThings();
    }
}
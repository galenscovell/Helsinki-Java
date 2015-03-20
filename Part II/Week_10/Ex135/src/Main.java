
/**
 * Main entry for Ex135, working with polymorphism
 */

import movable.Group;
import movable.Organism;
import movable.Movable;


public class Main {

    public static void main(String[] args) {
        Group group = new Group();
        group.add(new Organism(73, 56));
        group.add(new Organism(57, 66));
        group.add(new Organism(46, 52));
        group.add(new Organism(19, 107));
        System.out.println(group);

        System.out.println("\nMove group by [10, 20]");
        group.move(10, 20);
        System.out.println(group);
    }
}

/**
 * Main entry for Ex125, more work with packages and interfaces
 */

import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrush", 1));
        things.add(new Item("dumbbell", 9));
        things.add(new Item("book", 4));
        things.add(new Item("laptop", 6));

        Packer packer = new Packer(10);
        List<Box> boxes = packer.packThings(things);
        System.out.println("\nNumber of boxes: " + boxes.size());
        
        int i = 1;
        for (Box box : boxes) {
            System.out.println("Box [" + i + "]: " + box.getVolume() + " units");
            i++;
        }
    }
}
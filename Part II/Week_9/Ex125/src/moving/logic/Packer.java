
/**
 * Packer class for Ex125.
 */

package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;


public class Packer {
    private int boxVolume;

    public Packer(int volume) {
        this.boxVolume = volume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();

        for (Thing thing : things) {
            System.out.println("\nAdding: " + thing + " to...");
            if (boxes.size() == 0) {
                Box newBox = new Box(this.boxVolume);
                newBox.addThing(thing);
                boxes.add(newBox);
                System.out.println("a new box.");
            } else {
                boolean placed = false;
                for (Box box : boxes) {
                    if (box.addThing(thing)) {
                        System.out.println("an old box.");
                        placed = true;
                    }
                }

                if (!placed) {
                    Box newBox = new Box(this.boxVolume);
                    newBox.addThing(thing);
                    boxes.add(newBox);
                    System.out.println("a new box.");
                }
            } 
        }
        return boxes;
    }
}
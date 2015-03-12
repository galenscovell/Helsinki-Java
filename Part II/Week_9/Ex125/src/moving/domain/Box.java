
/**
 * Box class for Ex125.
 */

package moving.domain;

import java.util.ArrayList;
import java.util.List;


public class Box implements Thing{
    private int capacity;
    private List<Thing> contents;

    public Box(int value) {
        this.capacity = value;
        this.contents = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() <= this.capacity) {
            this.contents.add(thing);
            return true;
        } else {
            return false;
        }
    }

    public int getVolume() {
        int weight = 0;
        for (Thing thing : this.contents) {
            weight += thing.getVolume();
        }
        return weight;
    }
}
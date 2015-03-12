
/**
 * Item class for Ex125.
 */

package moving.domain;


public class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    
    public int getVolume() {
        return this.volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " units)";
    }

    public int compareTo(Item other) {
        if (this.getVolume() < other.getVolume()) {
            return -1;
        } else if (this.getVolume() > other.getVolume()) {
            return 1;
        } else {
            return 0;
        }
    }
}
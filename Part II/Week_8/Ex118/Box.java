
/**
 * Box class stores objects implementing ToBeStored interface
 * for Ex118. Utilizes passing of interface objects as
 * parameters.
 */

import java.util.ArrayList;

public class Box {
    private int capacity;
    private ArrayList<ToBeStored> contents;

    public Box(int weight) {
        this.capacity = weight;
        this.contents = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored toBeStored) {
        if (this.capacity >= toBeStored.weight()) {
            this.contents.add(toBeStored);
        } else {
            System.out.println("Box is too full.");
        }
    }

    public double weight() {
        double total = 0;
        for (ToBeStored toBeStored : contents) {
            total += toBeStored.weight();
        }
        return total;
    }

    public String toString() {
        int items = contents.size();
        double currentWeight = weight();
        return "Box: " + items + " items, total weight: " + currentWeight + "kg";
    }
}
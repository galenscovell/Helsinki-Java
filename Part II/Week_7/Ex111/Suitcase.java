
/**
 * Suitcase class for Ex111
 */

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int weight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = weight;
    }

    public void addThing(Thing thing) {
        if (this.getTotalWeight() + thing.getWeight() <= this.maxWeight) {
            this.things.add(thing);
        } else {
            System.out.println("Suitcase can't hold that much weight.");
        }
        
    }

    public String toString() {
        if (this.things.size() == 0) {
            return "Empty (" + this.getTotalWeight() + "kg)";
        } else if  (this.things.size() == 1) {
            return this.things.size() + " thing (" + this.getTotalWeight() + "kg)";
        } else {
            return this.things.size() + " things (" + this.getTotalWeight() + "kg)";
        }
    }

    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing);
        }
    }

    public int getTotalWeight() {
        int total = 0;
        for (Thing thing : this.things) {
            total += thing.getWeight();
        }
        return total;
    }

    public Thing heaviestThing() {
        if (this.things.size() == 0) {
            return null;
        } else {
            Thing heaviest = this.things.get(0);
            for (Thing thing : this.things) {
                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;
                }
            }
            return heaviest;
        }
    }
}
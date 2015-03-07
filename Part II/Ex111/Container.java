
/**
 * Container class for Ex111
 */

import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Container(int weight) {
        this.suitcases = new ArrayList<Suitcase>();
        this.maxWeight = weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.getTotalWeight() + suitcase.getTotalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        } else {
            System.out.println("Container can't hold that much weight.");
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.getTotalWeight() + "kg)";
    }

    public int getTotalWeight() {
        int total = 0;
        for (Suitcase suitcase : this.suitcases) {
            total += suitcase.getTotalWeight();
        }
        return total;
    }

    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }
}
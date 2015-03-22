
/**
 * Bulk tank class for Ex138
 */

package farmsimulator;


public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
        this.volume = 0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (this.volume + amount <= this.capacity) {
            this.volume += amount;
        } else {
            System.out.println("Tank over capacity.");
        }
    }

    public void getFromTank(double amount) {
        if (this.volume - amount >= 0) {
            this.volume -= amount;
        } else {
            System.out.println("Tank volume less than amount.");
        }
    }

    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
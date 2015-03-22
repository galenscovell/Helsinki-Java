
/**
 * Cow class for Ex138
 */

package farmsimulator;

import java.util.Random;


public class Cow implements Alive, Milkable {
    private String name;
    private double capacity;
    private double amount;
    private static final String[] NAMES = new String[] {
        "Anu", "Arpa", "Essi", "Heluna", "Hely", "Hento", "Hilke", 
        "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo", "Jaana", "Jami", 
        "Jatta", "Laku", "Liekki", "Mainikki", "Mella", "Mimmi", 
        "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi" };

    public Cow() {
        Random random = new Random();
        int nameChoice = random.nextInt(31) - 1;
        this.name = NAMES[nameChoice];
        int capacityChoice = random.nextInt(25 + 1) + 15;
        this.capacity = capacityChoice;
        this.amount = 0;
    }

    public Cow(String name) {
        Random random = new Random();
        int capacityChoice = random.nextInt(25 + 1) + 15;
        this.name = name;
        this.capacity = capacityChoice;
        this.amount = 0;
    }

    public void liveHour() {
        Random random = new Random();
        double produced = random.nextInt(10) - 1;
        if (this.amount + produced <= this.capacity) {
            this.amount += produced;
        } else {
            this.amount = this.capacity;
        }
    }

    public double milk() {
        double produced = this.amount;
        this.amount = 0;
        return produced;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return this.amount;
    }

    public String toString() {
        return this.name + " " + this.amount + "/" + this.capacity;
    }


}
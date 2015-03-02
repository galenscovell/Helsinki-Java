
/**
 * Overloaded Counter object for Ex84
 */

public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        if (check == true) {
            this.check = true;
        } else {
            this.check = false;
        }
    }

    public Counter(int startingValue) {
        this.value = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.value = 0;
        if (check == true) {
            this.check = true;
        } else {
            this.check = false;
        }
    }

    public Counter() {
        this.value = 0;
        this.check = false;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int amount) {
        if (amount > 0) {
            this.value += amount;
        } else {
            System.out.println("Decrement amount must be positive.");
        }
    }

    public void decrease() {
        if (this.check == true && this.value == 0) {
            System.out.println("(Cannot decrement value past 0.)");
        } else {
            this.value--;
        }
    }

    public void decrease(int amount) {
        if (amount > 0) {
            if (this.check == true && this.value < amount) {
                System.out.println("(Cannot decrement value past 0.)");
            } else {
                this.value -= amount;
            }
        } else {
            System.out.println("Decrement amount must be positive.");
        }
    }
}
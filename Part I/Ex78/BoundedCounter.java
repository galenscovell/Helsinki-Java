
/**
 * BoundedCounter object for Ex78
 */

public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void next() {
        if (this.value < this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }
}
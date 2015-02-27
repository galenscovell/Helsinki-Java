
/**
 * Creates 'multiplier' object
 */

public class Multiplier {

    private int component;

    public Multiplier(int component) {
        this.component = component;
    }

    public int multiply(int number) {
        return this.component * number;
    }
}
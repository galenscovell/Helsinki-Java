
/**
 * Calculator class for Ex143
 */

package ui;


public class Calculator {
    private double current;

    public Calculator() {
        this.current = 0;
    }

    public void add(String amount) {
        double value = Double.parseDouble(amount);
        this.current += value;
    }

    public void subtract(String amount) {
        double value = Double.parseDouble(amount);
        this.current -= value;
    }

    public void multiply(String amount) {
        double value = Double.parseDouble(amount);
        this.current *= value;
    }

    public void divide(String amount) {
        double value = Double.parseDouble(amount);
        this.current /= value;
    }

    public void change() {
        if (this.current < 0) {
            this.current = Math.abs(this.current);
        } else if (this.current > 0) {
            this.current = -this.current;
        }
    }

    public void clear() {
        this.current = 0;
    }

    public String getValue() {
        return String.valueOf(this.current);
    }
}
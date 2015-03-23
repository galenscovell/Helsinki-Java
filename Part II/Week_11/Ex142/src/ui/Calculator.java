
/**
 * Calculator class for Ex142
 */

package ui;


public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add() {
        this.value++;
    }

    public void sub() {
        this.value--;
    }

    public String getValue() {
        return "" + this.value;
    }
}
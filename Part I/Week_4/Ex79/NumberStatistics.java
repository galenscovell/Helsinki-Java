
/**
 * NumberStatistics object for Ex79
 */

public class NumberStatistics {

    private int amountOfNumbers;
    private double sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(double number) {
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public double sum() {
        return this.sum;
    }

    public double average() {
        return this.sum / this.amountOfNumbers;
    }
}
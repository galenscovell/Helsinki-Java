
/**
 * NightSky class for Ex100
 */

import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int previousStars;

    public NightSky(double density) {
        this.density = density * 100;
        this.width = 20;
        this.height = 20;
    }

    public NightSky(int width, int height) {
        this.density = 0.1 * 100;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density * 100;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random random = new Random();
        String symbol;

        for (int i = 0; i < this.width; i++) {
            int randomInt = random.nextInt(100) + 1;

            if (randomInt <= this.density){
                symbol = "*";
                this.previousStars += 1;
            } else {
                symbol = " ";
            }

            System.out.print(symbol);
        }
        System.out.println();
    }

    public void print() {
        for (int i = 0; i < this.height; i++) {
            this.printLine();
        }
    }

    public int starsInLastPrint() {
        return this.previousStars;
    }
}
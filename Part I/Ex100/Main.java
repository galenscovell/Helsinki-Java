
/**
 * Main class for Ex100, creating a randomized 'night sky' with arrays
 */

public class Main {

    public static void main(String[] args) {
        NightSky nightsky = new NightSky(0.05, 40, 20);
        nightsky.print();
        System.out.println("Number of stars: " + nightsky.starsInLastPrint());
    }
}
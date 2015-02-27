
/**
 * Main class for Ex74, the creation of 'multiplier' objects
 */

public class Main {

    public static void main(String[] args) {
        Multiplier twoMult = new Multiplier(2);
        Multiplier threeMult = new Multiplier(3);
        Multiplier fourMult = new Multiplier(4);

        System.out.println(twoMult.multiply(8));
        System.out.println(threeMult.multiply(8));
        System.out.println(fourMult.multiply(8));
    }
}
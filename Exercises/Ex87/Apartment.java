
/**
 * Apartment class for Ex87
 */

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment otherApartment) {
        int total1 = this.squareMeters * this.pricePerSquareMeter;
        int total2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if (total1 > total2) {
            return total1 - total2;
        } else {
            return total2 - total1;
        }
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int total1 = this.squareMeters * this.pricePerSquareMeter;
        int total2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if (total1 > total2) {
            return true;
        } else {
            return false;
        }
    }
}
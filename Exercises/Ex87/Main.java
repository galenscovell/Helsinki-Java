
/**
 * Main entry for Ex87, apartment searching
 */

public class Main {

    public static void main(String[] args) {
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println(studioManhattan.larger(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn));

        System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn));

        System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));
    }
}
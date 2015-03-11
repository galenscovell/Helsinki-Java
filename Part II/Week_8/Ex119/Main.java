
/**
 * Main class for Ex119, working with fundamental interfaces.
 */

public class Main {


    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        ShoppingBasket basket = new ShoppingBasket();

        store.add("milk", 3, 10);
        store.add("coffee", 5, 7);

        System.out.println("\nMilk price: " + store.price("milk"));
        System.out.println("Coffee price: " + store.price("coffee"));
        System.out.println("Bread price: " + store.price("bread"));

        System.out.println("\nMilk stock: " + store.stock("milk"));
        System.out.println("Coffee stock: " + store.stock("coffee"));
        System.out.println("Bread stock: " + store.stock("bread"));

        basket.add("milk", 3);
        basket.add("milk", 3);
        basket.add("milk", 3);
        basket.add("coffee", 2);
        System.out.println("Basket price: " + basket.price());
        basket.print();
    }
}
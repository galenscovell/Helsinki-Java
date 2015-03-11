
/**
 * Shopping basket class for Ex119.
 */

import java.util.ArrayList;
import java.util.List;


public class ShoppingBasket {
    private List<Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }

    public void add(String product, int price) {
        boolean found = false;
        for (Purchase purchase : this.purchases) {
            if (purchase.productName().equals(product)) {
                purchase.increaseAmount();
                found = true;
            }
        }

        if (found == false) {
            this.purchases.add(new Purchase(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Purchase purchase : this.purchases) {
            total += purchase.price();
        }
        return total;
    }

    public void print() {
        for (Purchase purchase : this.purchases) {
            System.out.println(purchase);
        }
    }
}
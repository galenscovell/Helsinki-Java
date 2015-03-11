
/**
 * Purchase class for Ex119.
 */

public class Purchase {
    private String product;
    private int amount;
    private int price;


    public Purchase(String product, int amount, int price) {
        this.product = product;
        this.amount = amount;
        this.price = price;
    }

    public String productName() {
        return this.product;
    }

    public int price() {
        return this.amount * this.price;
    }

    public void increaseAmount() {
        this.amount++;
    }

    public String toString() {
        return "(" + this.amount + ") " + this.product;
    }
}
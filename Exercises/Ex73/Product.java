
/**
 * Creates a 'product' object which has a price, amount 
 * and name along with the method printProduct().
 */

public class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void printProduct() {
        System.out.println("Product: " + this.name + ", Price: " + this.price + ", Amount: " + this.amount);
    }
}
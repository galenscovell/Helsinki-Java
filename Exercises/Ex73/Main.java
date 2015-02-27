
/**
 * Main class for Ex73, the creation of 'product' objects
 */

public class Main {

    public static void main(String[] args) {
        Product banana = new Product("Banana", 1.1, 13);
        Product apple = new Product("Apple", 0.8, 25);
        Product avocado = new Product("Avocado", 1.8, 6);

        banana.printProduct();
        apple.printProduct();
        avocado.printProduct();
    }
}
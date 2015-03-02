
/**
 * Main entry to Ex86 utilizing multiple classes
 */

public class Main {

    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();
        System.out.println(unicafeExactum);

        LyyraCard cardOfGalen = new LyyraCard(2);

        System.out.println("Card balance: " + cardOfGalen.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfGalen);
        System.out.println("Payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfGalen, 100);

        succeeded = unicafeExactum.payGourmet(cardOfGalen);
        System.out.println("Payment success: " + succeeded);

        System.out.println("Card balance: " + cardOfGalen.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
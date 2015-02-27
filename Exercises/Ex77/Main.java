
/**
 * Main class for Ex77
 */

public class Main {

    public static void main(String[] args) {
        LyyraCard cardGalen = new LyyraCard(20);
        LyyraCard cardAshley = new LyyraCard(30);

        cardGalen.payGourmet();
        cardAshley.payEconomical();

        System.out.println("Galen: " + cardGalen);
        System.out.println("Ashley: " + cardAshley);

        cardGalen.loadMoney(20);
        cardAshley.payGourmet();

        System.out.println("Galen: " + cardGalen);
        System.out.println("Ashley: " + cardAshley);

        cardGalen.payEconomical();
        cardGalen.payEconomical();
        cardAshley.loadMoney(50);

        System.out.println("Galen: " + cardGalen);
        System.out.println("Ashley: " + cardAshley);
        
    }
}

/**
 * Lyyra card object for Ex77
 */

public class LyyraCard {

    private double balance;

    public LyyraCard(double beginBalance) {
        this.balance = beginBalance;
    }

    public String toString() {
        return "The card has " + this.balance + " euros.";
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        if (this.balance > 150) {
            this.balance = 150;
        }
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        } 
    }

    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance -= 4.0;
        } 
    }
}
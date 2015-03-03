
/**
 * Cash register class for Ex86
 */

public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private double economicalCost = 2.5;
    private double gourmetCost = 4.0;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= economicalCost) {
            this.economicalSold += 1;
            this.cashInRegister += economicalCost;
            return cashGiven - economicalCost;
        } else {
            return 0.0;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= economicalCost) {
            this.economicalSold += 1;
            card.pay(economicalCost);
            return true;
        } else {
            return false;
        }
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= gourmetCost) {
            this.gourmetSold += 1;
            this.cashInRegister += gourmetCost;
            return cashGiven - gourmetCost;
        } else {
            return 0.0;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= gourmetCost) {
            this.gourmetSold += 1;
            card.pay(gourmetCost);
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Money in register: " + cashInRegister + ", Economical lunches sold: " + economicalSold + ", Gourmet lunches sold: " + gourmetSold;
    }
}
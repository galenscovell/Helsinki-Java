
/**
 * Money class for ex95
 */

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money amount) {
        int newEuros = this.euros + amount.euros;
        int newCents = this.cents + amount.cents;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public boolean less(Money compared) {
        if (this.euros == compared.euros) {
            if (this.cents > compared.cents) {
                return false;
            } else {
                return true;
            }
        } else if (this.euros > compared.euros) {
            return false;
        } else if (this.cents > compared.cents) {
            return false;
        } else {
            return true;
        }
    }

    public Money minus(Money amount) {
        int newEuros = this.euros - amount.euros;
        int newCents = this.cents - amount.cents;
        if (newCents < 0) {
            newEuros -= 1;
            newCents += 100;
        }
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
}

/**
 * Storehouse class for Ex119
 */

import java.util.HashMap;
import java.util.Map;


public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public int stock(String product) {
        if (this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (this.stocks.containsKey(product)) {
            this.stocks.put(product, this.stocks.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }

    public void add(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        } else {
            return -99;
        }
    }
}

/**
 * Promissory Note class for Ex113
 */

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Integer> notes;

    public PromissoryNote() {
        this.notes = new HashMap<String, Integer>();
    }

    public void setLoan(String name, int amount) {
        this.notes.put(name, amount);
    }

    public int getDebt(String name) {
        if (this.notes.containsKey(name)) {
            return this.notes.get(name);
        }
        return 0;
    }
}
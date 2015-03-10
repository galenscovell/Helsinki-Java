
/**
 * Main class for Ex113, working more with HashMaps
 */

public class Main {

    public static void main(String[] args) {
        PromissoryNote notes = new PromissoryNote();

        notes.setLoan("Galen", 3250);
        notes.setLoan("Ashley", 15200);

        System.out.println(notes.getDebt("Galen"));
        System.out.println(notes.getDebt("Joel"));

        notes.setLoan("Ashley", 2000);

        System.out.println(notes.getDebt("Ashley"));
    }
}
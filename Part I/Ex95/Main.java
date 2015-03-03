
/**
 * Main entry for ex95 dealing with an accurate, object-based money
 * system.
 */

public class Main {

    public static void main(String[] args) {
        Money a = new Money(10, 50);
        Money b = new Money(5, 25);
        Money c = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = a.plus(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a.less(b));
        System.out.println(b.less(c));

        Money d = a.minus(c);
        System.out.println(d);
    }
}

/**
 * Main entry for Overloaded Counter, Ex84
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("\nCounter [-start value, -check]:");
        Counter overload = new Counter();
        System.out.println("Start: " + overload.value());
        overload.increase(2);
        System.out.println("+2: " + overload.value());
        overload.decrease(3);
        System.out.println("-3: " + overload.value());
        overload.decrease(-2);
        System.out.println("--2: " + overload.value());

        System.out.println("\nCounter [+start value, -check]:");
        Counter overload1 = new Counter(1);
        System.out.println("Start: " + overload1.value());
        overload1.increase();
        System.out.println("+1: " + overload1.value());
        overload1.decrease(3);
        System.out.println("-3: " + overload1.value());
        overload.increase(-2);
        System.out.println("+-2: " + overload1.value());

        System.out.println("\nCounter [-start value, +check]:");
        Counter overload2 = new Counter(true);
        System.out.println("Start: " + overload2.value());
        overload2.increase();
        System.out.println("+1: " + overload2.value());
        overload2.decrease(2);
        System.out.println("-2: " + overload2.value());
        overload.decrease(-2);
        System.out.println("--2: " + overload2.value());

        System.out.println("\nCounter [+start value, +check]:");
        Counter overload3 = new Counter(2, true);
        System.out.println("Start: " + overload3.value());
        overload3.increase();
        System.out.println("+1: " + overload3.value());
        overload3.decrease(4);
        System.out.println("-4: " + overload3.value());
        overload.increase(-2);
        System.out.println("+-2: " + overload3.value());
    }
}
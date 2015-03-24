
/**
 * Main class for Ex147, working with enum and iterators
 */

import personnel.*;


public class Main {

    public static void main(String[] args) {
        Employees university = new Employees();
        university.add(new Person("Galen", Education.BACHELOR));
        university.add(new Person("Ashley", Education.BACHELOR));
        university.add(new Person("Nathan", Education.DOCTOR));
        university.print();

        System.out.println("\nLet's fire the recent grads!\n");
        university.fire(Education.BACHELOR);
        university.print();
    }
}
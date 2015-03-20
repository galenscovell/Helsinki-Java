
/**
 * Professor class for Ex136
 */

package people;


public class Professor extends Person {
    private int salary;

    public Professor(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + "\n\tSalary: $" + this.salary;
    }
}
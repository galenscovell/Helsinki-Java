
/**
 * Student class for Ex136
 */

package people;


public class Student extends Person {
    private double gpa;

    public Student(String name, String address, double gpa) {
        super(name, address);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tGPA: " + this.gpa;
    }
}
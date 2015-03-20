
/**
 * Person class for Ex136
 */

package people;


public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.name + "\n\t" + this.address;
    }
}
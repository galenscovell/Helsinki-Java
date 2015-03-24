
/**
 * Employees class for Ex147
 */

package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    private List<Person> people;

    public Employees() {
        this.people = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public void add(List<Person> persons) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            this.people.add(nextPerson);
        }
    }

    public void print() {
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            System.out.println(nextPerson);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
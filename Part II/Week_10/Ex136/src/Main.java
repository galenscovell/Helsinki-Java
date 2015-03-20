
/**
 * Main class for Ex136, polymorphism and inheritance
 */

import people.Person;
import people.Professor;
import people.Student;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Student galen = new Student("Galen Scovell", "3.14 Pie Street", 3.5);
        Student ashley = new Student("Ashley Nelson", "Circumference Lane", 3.4);
        Professor nathan = new Professor("Nathan Tublitz", "Somewhere Italy", 5000);

        List<Person> people = new ArrayList<Person>();
        people.add(galen);
        people.add(ashley);
        people.add(nathan);

        printAll(people);
    }
}

/**
 * Phonebook class for ex94
 */

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> personList;

    public Phonebook() {
        this.personList = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.personList.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : this.personList) {
            System.out.println(person);
        }
    }

    public String search(String name) {
        String searchedNumber = "";
        for (Person person : this.personList) {
            if (person.getName() == name) {
                searchedNumber = person.getNumber();
            }
        }

        if (searchedNumber.isEmpty()) {
            return "Person not in phonebook.";
        } else {
            return searchedNumber;
        }
    }
}
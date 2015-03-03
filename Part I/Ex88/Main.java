
/**
 * Main entry for Ex88 working with objects in ArrayLists
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        String name = " ";
        String number = " ";
        String searchTerm = " ";
        
        while (!name.isEmpty()) {
            System.out.print("Student Name: ");
            name = reader.nextLine();
            if (!name.isEmpty()) {
                System.out.print("Student Number: ");
                number = reader.nextLine();
                studentList.add(new Student(name, number));
            }
        }

        System.out.println();
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println();

        System.out.print("Search Term: ");
        searchTerm = reader.nextLine();
        for (Student student : studentList) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}
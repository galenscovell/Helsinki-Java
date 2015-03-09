
// Asks for two names and two ages, then prints the names and 
// the two ages summed.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("\nFirst person's name: ");
        String personOneName = reader.nextLine();
        System.out.print("First person's age: ");
        int personOneAge = Integer.parseInt(reader.nextLine());

        System.out.print("\nSecond person's name: ");
        String personTwoName = reader.nextLine();
        System.out.print("Second person's age: ");
        int personTwoAge = Integer.parseInt(reader.nextLine());

        int totalAge = personOneAge + personTwoAge;

        System.out.println("\n" + personOneName + " and " + personTwoName + " are " + totalAge + " years old in total.\n");

    }
}
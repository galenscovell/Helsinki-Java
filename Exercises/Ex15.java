
// Asks for user age and prints if their at the age of majority (18>)

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? > ");
        int age = Integer.parseInt(reader.nextLine());

        if (age >= 18) {
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not yet reached the age of majority!");
        }
    }
}
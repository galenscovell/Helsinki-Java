
// Checks if age is reasonable (above 0 and less than 120)

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Age: ");
        int age = Integer.parseInt(reader.nextLine());

        if (age <= 0 || age > 120) {
            System.out.println("Age is impossible.");
        } else {
            System.out.println("Age is possible.");                              
        }
    }
}
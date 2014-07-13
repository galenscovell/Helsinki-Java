
// Prints all integers between 1 and a user-defined limit

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num = 0;
        System.out.print("Limit: ");
        int limit = Integer.parseInt(reader.nextLine());

        while (num < limit) {
            num++;
            System.out.println("Currently: " + num);
        }
    }
}
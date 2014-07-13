
// Prints all integers between user defined beginning and ending limits

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Begin Point: ");
        int begin = Integer.parseInt(reader.nextLine());

        System.out.print("End Point: ");
        int end = Integer.parseInt(reader.nextLine());
        begin--;

        if (begin < end) {
            while (begin < end) {
                begin++;
                System.out.println("Currently: " + begin);
            }
        } else {
            System.out.println("\nInvalid limits.");
        }
    }
}

// Calculates the sum of n1+n2+n3+...+nX, where n1 and nX are user-defined

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int loops = 0;

        System.out.print("Begin Point: ");
        int num = Integer.parseInt(reader.nextLine());

        System.out.print("End Point: ");
        int limit = Integer.parseInt(reader.nextLine());

        if (num < limit) {
            while (num <= limit) {
                sum += num;
                num++;
                loops++;
            }
            System.out.println("Sum: " + sum + "\nLoops: " + loops + "\n");
        } else {
            System.out.println("Invalid limits.\n");
        }
    }
}
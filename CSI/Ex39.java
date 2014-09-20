
import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Side size for square? > ");
        int stars = Integer.parseInt(reader.nextLine());

        printSquare(stars);
        System.out.println("\n");

    }

    public static void printSquare(int sideSize) {
        if (sideSize != 0) {
            printStars(sideSize);
        }

    }

    public static void printStars(int amount) {
        int count = 0;
        while (amount != 0) {
            System.out.print("*");
            amount--;
            count++;
        }
        System.out.println("");
        printSquare((count - 1));
    }

}

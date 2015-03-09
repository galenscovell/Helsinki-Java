
// Simple program that draws geometric shapes to the console
// with user-defined dimensions.


import java.util.Scanner;

public class Ex39 {

    public static void createStars(int amount) {
        System.out.print("  ");
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.print("\n");
    }


    public static void createSpace(int amount) {
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }


    public static void createSquare(int amount) {
        System.out.print("\n");
        int sidelength = amount;
        while (sidelength > 0) {
            createStars(amount);
            sidelength--;
        }
    }


    public static void createRect(int amount, Scanner reader) {
        System.out.print("\nSide length: ");
        int sidelength = Integer.parseInt(reader.nextLine());
        System.out.print("\n");
        while (sidelength > 0) {
            createStars(amount);
            sidelength--;
        }
    }


    public static void leftAlignedTri(int amount) {
        System.out.print("\n");
        int pieces = amount;
        while (pieces > 0) {
            createStars(pieces);
            pieces--;
        }
        while (pieces <= amount) {
            createStars(pieces);
            pieces++;
        }
    }


    public static void rightAlignedTri(int amount) {
        System.out.print("\n");
        int pieces = 1;
        while (pieces <= amount) {
            createSpace(amount - pieces);
            createStars(pieces);
            pieces++;
        }
        pieces--;
        System.out.print("\n");
        while (pieces > 0) {
            createSpace(amount - pieces);
            createStars(pieces);
            pieces--;
        }
    }


    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("\nStar amount: ");
        int stars = Integer.parseInt(reader.nextLine());
        createSquare(stars);
        leftAlignedTri(stars);
        rightAlignedTri(stars);
        createRect(stars, reader);
        System.out.print("\n");
    }

}
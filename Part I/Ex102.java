
/**
 * Main class for Ex102, a grade distribution creator.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Ex102 {

    public static void createDistribution(ArrayList<Integer> grades) {
        int[] letters = {0, 0, 0, 0, 0};
        double accepted = 0.0;
        double total = 0.0;
        
        for (int grade : grades) {
            if (90 <= grade && grade <= 100) {
                letters[0] += 1;
                accepted += 1;
            } else if (80 <= grade && grade <= 89) {
                letters[1] += 1;
                accepted += 1;
            } else if (70 <= grade && grade <= 79) {
                letters[2] += 1;
                accepted += 1;
            } else if (60 <= grade && grade <= 69) {
                letters[3] += 1;
            } else if (0 <= grade && grade <= 59) {
                letters[4] += 1;
            }
            total += 1;
        }
        double acceptancePercentage = 100 * (accepted / total);

        System.out.println("\nGrade distribution:");
        int current = 4;
        for (int letter : letters) {
            System.out.print("\n" + current + ": ");
            createBar(letter);
            current -= 1;
        }
        System.out.print("\nAcceptance percentage: ");
        System.out.format("%.2f", acceptancePercentage);
        System.out.print("%\n\n");

    }

    public static void createBar(int value) {
        while (value > 0) {
            System.out.print("[]");
            value -= 1;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int grade = 0;
        ArrayList<Integer> gradeList = new ArrayList<Integer>();
        System.out.println("Enter exam scores (-1 ends):");
        while (grade != -1) {
            grade = Integer.parseInt(reader.nextLine());
            if (grade != -1) {
                gradeList.add(grade);
            }
        }
        createDistribution(gradeList);
    }
}
package basicSyntaxConditionalStatementsAndLoops.moreExercise;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int biggetsNum = MIN_VALUE;
        int smallestNum = MAX_VALUE;
        int middleNum = 0;

        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num >= biggetsNum) {
                middleNum = biggetsNum;
                biggetsNum = num;
                }
            if (num <= smallestNum) {
                middleNum = smallestNum;
                smallestNum = num;
            }
            if (num > smallestNum && num < biggetsNum) {
                middleNum = num;
            }
        }
        System.out.println(biggetsNum);
        System.out.println(middleNum);
        System.out.println(smallestNum);
    }
}

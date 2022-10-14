package methods.moreExercises;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int br = numChecker(num1, num2, num3);

        if (br == -1) {
            System.out.println("zero");
        } else if (br % 2 != 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }

    public static int numChecker(int num1, int num2, int num3) {
        int minusCounter = 0;
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            return -1;
        } else {
            if (num1 < 0) {
                minusCounter++;
            }
            if (num2 < 0) {
                minusCounter++;
            }
            if (num3 < 0) {
                minusCounter++;
            }
            return minusCounter;
        }
    }
}

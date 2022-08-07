package NestedLoops.MoreExercises;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicalNum = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;

        int count = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count ++;
                if (i + j == magicalNum) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, i + j);
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", count, magicalNum);
        }

    }
}

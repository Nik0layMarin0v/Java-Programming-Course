package NestedLoops.Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;

        for (int i = 1111; i < 10000; i++) {
            int currentNum = i;

            for (int j = 0; j < 4; j++) {
                int digit = currentNum % 10;
                if (digit != 0 && n % digit == 0 ) {
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
                currentNum = currentNum / 10;
            }
            if (!isValid) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}

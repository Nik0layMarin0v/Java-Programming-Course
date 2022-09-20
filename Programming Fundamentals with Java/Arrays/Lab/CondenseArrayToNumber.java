package arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] condensed = new int[numArr.length - 1];
        int sum = 0;
        boolean condensedOrNot = true;
        for (int i = 0; i < numArr.length - 1; i++) {
            condensedOrNot = false;
            condensed = numArr;
            for (int j = 0; j < numArr.length - 1; j++) {
                condensed[j] = condensed[j] + condensed[j + 1];
            }
            numArr = condensed;
        }
        if (condensedOrNot) {
            System.out.printf("%d is already condensed to number", numArr[0]);
        } else {
            System.out.println(condensed[0]);
        }

    }
}

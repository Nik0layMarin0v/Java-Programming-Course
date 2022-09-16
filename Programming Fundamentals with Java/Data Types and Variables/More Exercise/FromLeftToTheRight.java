package dataTypesAndVariables.moreExercise;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] numbersArr = scanner.nextLine().split(" ");

            long leftNum = Long.parseLong(numbersArr[0]);
            long rightNum = Long.parseLong(numbersArr[1]);

            long specialNum = 0;
            if (leftNum > rightNum) {
                specialNum = Math.abs(leftNum);
            } else {
                specialNum = Math.abs(rightNum);
            }
            long sum = 0;
            while(specialNum > 0) {
                long currentNum = specialNum % 10;
                sum += currentNum;
                specialNum = specialNum / 10;
            }
            System.out.println(sum);
        }
    }
}

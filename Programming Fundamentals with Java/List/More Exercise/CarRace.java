package lists.moreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        double leftSum = 0;
        double rightSum = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            int leftNum = nums[i];
            int rightNum = nums[nums.length -1 - i];

            if (leftNum == 0) {
                leftSum = leftSum * 0.8;
            } else {
                leftSum += leftNum;
            }

            if (rightNum == 0) {
                rightSum = rightSum * 0.8;
            } else {
                rightSum += rightNum;
            }
        }

        if (rightSum > leftSum) {
            System.out.printf("The winner is left with total time: %.1f", leftSum);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightSum);
        }
    }
}

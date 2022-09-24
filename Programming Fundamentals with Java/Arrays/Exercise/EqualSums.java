package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean equality = false;
        for (int i = 1; i < nums.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            if (rightSum == leftSum && leftSum == nums[i]) {
                System.out.println(i);
                equality = true;
                break;
            }
        }
        if (nums.length == 1) {
            System.out.println(0);
        } else if (!equality) {
            System.out.println("no");
        }
    }
}

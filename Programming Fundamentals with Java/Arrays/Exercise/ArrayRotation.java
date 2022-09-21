package arrays.exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] currentArr = new String[nums.length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == 0) {
                    currentArr[currentArr.length - 1] = nums[0];
                } else {
                    currentArr[j - 1] = nums[j];
                }
            }
            nums = currentArr;
            currentArr = new String[nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] first = new int[n];
        int[] second = new int[n];
        for (int i = 0; i < n; i++) {
            int[] currentArr = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (i % 2 == 0) {
                first[i] = currentArr[0];
                second[i] = currentArr[1];
            } else {
                first[i] = currentArr[1];
                second[i] = currentArr[0];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(second[i] + " ");
        }
    }
}

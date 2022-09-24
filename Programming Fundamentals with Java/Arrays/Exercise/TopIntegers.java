package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] row = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < row.length; i++) {
            boolean bigger = false;
            for (int j = i; j < row.length; j++) {
                if (row[i] > row[j]) {
                    bigger = true;
                } else if(row[i] < row[j]) {
                    bigger = false;
                    break;
                }
            }
            if (bigger == true) {
                System.out.print(row[i] + " ");
            }
        }
        System.out.print(row[row.length - 1]);
    }
}

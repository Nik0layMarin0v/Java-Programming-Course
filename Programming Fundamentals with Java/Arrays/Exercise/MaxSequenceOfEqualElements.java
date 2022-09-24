package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int counter1 = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter1++;
                    if (j < arr.length - 1) {
                        if (arr[i] != arr[j + 1]) {
                            break;
                        }
                    }
                }
            }
            if (counter1 > counter) {
                counter = counter1;
                index = i;
            }
        }
        for (int i = index; i < index + counter; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

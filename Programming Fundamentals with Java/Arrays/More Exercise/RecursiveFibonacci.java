package arrays.moreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Integer[] fibonacci = new Integer[n];
        int result = 1;
        if (n > 2) {
            fibonacci[0] = 1;
            fibonacci[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            result = fibonacci[n - 1];
        }

        System.out.println(result);
    }
}

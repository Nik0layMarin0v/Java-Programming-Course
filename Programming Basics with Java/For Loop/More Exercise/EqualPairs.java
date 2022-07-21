package ForLoop.MoreExercises;

import java.util.Scanner;

import static java.lang.Integer.*;

public class EqualPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int maxSum = MIN_VALUE;
        int minSum = MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (num1 + num2 < minSum) {
                minSum = num1 + num2;
            }
            if (num1 + num2 > maxSum) {
                maxSum = num1 + num2;
            }
        }

        if (maxSum == minSum) {
            System.out.printf("Yes, value=%d", maxSum);
        } else {
            System.out.printf("No, maxdiff=%d", Math.abs(minSum - maxSum));
        }

    }
}

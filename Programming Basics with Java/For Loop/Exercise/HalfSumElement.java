package ForLoop.Exercise;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            sum = sum + currentNum;
            if (currentNum > max) {
                max = currentNum;
            }
        }

        sum = sum - max;
        if (sum == max) {
            System.out.printf("Yes%nSum = %d", max);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(max - sum));
        }

    }
}

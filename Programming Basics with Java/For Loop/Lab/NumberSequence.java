package ForLoop.Lab;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = MIN_VALUE;
        int min = MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum > max) {
                max = currentNum;
            }
            if (currentNum < min) {
                min = currentNum;
            }
        }

        System.out.printf("Max number: %d%nMin number: %d", max, min);

    }
}

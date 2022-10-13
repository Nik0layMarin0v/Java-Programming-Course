package methods.moreExercises;

import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.print(tribonacci(i) + " ");
        }
    }

    public static int tribonacci(int n) {
        if (n == 0 || n == -1) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }
}

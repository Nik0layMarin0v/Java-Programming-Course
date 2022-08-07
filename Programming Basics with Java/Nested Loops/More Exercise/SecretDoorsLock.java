package NestedLoops.MoreExercises;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (int i = 1; i <= n1; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= n2; j++) {
                    count = 0;
                    for (int k = 1; k <= j; k++) {
                        if (j % k == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        for (int k = 1; k <= n3; k++) {
                            if (k % 2 == 0) {
                                System.out.printf("%d %d %d%n", i, j, k);
                            }
                        }
                    }
                }
            }
        }
    }
}

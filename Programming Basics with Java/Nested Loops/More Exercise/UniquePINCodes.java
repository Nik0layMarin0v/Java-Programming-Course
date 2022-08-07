package NestedLoops.MoreExercises;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n1; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= n2; j++) {
                    int count = 0;
                    for (int k = 1; k <= n2; k++) {
                        if (j % k == 0) {
                            count ++;
                        }
                    }
                    if (count == 2) {
                        for (int l = 1; l <= n3; l++) {
                            if (l % 2 == 0) {
                                System.out.printf("%d %d %d%n", i, j, l);
                            }
                        }
                    }
                }
            }
        }
    }
}

package NestedLoops.MoreExercises;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                for (int k = start; k <= end; k++) {
                    for (int l = start; l <= end; l++) {
                        if (i > l) {
                            if ((i % 2 == 0 && l % 2 == 1) || (i % 2 == 1 && l % 2 == 0)) {
                                if ((j + k) % 2 == 0) {
                                    System.out.printf("%d%d%d%d ", i, j, k, l);
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}

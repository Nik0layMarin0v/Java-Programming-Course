package NestedLoops.MoreExercises;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int oneBGN = Integer.parseInt(scanner.nextLine());
        int twoBGN = Integer.parseInt(scanner.nextLine());
        int fiveBGN = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= oneBGN; i++) {
            for (int j = 0; j <= twoBGN; j++) {
                for (int k = 0; k <= fiveBGN; k++) {
                    if (i + 2 * j + 5 * k == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }

    }
}

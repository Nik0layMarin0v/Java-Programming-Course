package NestedLoops.MoreExercises;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstStart = Integer.parseInt(scanner.nextLine());
        int secondStart = Integer.parseInt(scanner.nextLine());
        int firstEnd = Integer.parseInt(scanner.nextLine()) + firstStart;
        int secondEnd = Integer.parseInt(scanner.nextLine()) + secondStart;

        for (int i = firstStart; i <=firstEnd; i++) {
            int count1 = 0;
            for (int j = 1; j <= firstEnd; j++) {
                if (i % j == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                for (int j = secondStart; j <= secondEnd; j++) {
                    int count2 = 0;
                    for (int k = 1; k <= secondEnd; k++) {
                        if (j % k == 0) {
                            count2++;
                        }
                    }
                    if (count2 == 2) {
                        System.out.println(i * 100 + j);
                    }
                }
            }
        }
        
    }
}

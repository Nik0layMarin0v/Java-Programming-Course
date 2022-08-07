package NestedLoops.MoreExercises;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int controlNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int password = 0;
        boolean foundPassword= false;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i < j) {
                    for (int k = 1; k < 10; k++) {
                        for (int l = 1; l < 10; l++) {
                            if (k > l && i * j + k * l == controlNum) {
                                counter++;
                                if (counter == 4) {
                                    foundPassword = true;
                                    password = i * 1000 + j * 100 + k * 10 + l;
                                }
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }
                    }
                }
            }
        }
        if (foundPassword) {
            System.out.printf("%nPassword: %d",password);
        } else {
            System.out.printf("%nNo!");
        }

    }
}

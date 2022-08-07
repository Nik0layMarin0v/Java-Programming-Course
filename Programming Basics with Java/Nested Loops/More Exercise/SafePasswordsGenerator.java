package NestedLoops.MoreExercises;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());

        char A = 35;
        char B = 64;
        boolean enoughPasswords = false;
        int counnt = 0;

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                counnt ++;
                System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                if (counnt == maxPasswords) {
                    enoughPasswords = true;
                    break;
                }
                A++;
                B++;
                if (A > 55) {
                    A = 35;
                } if (B > 96) {
                    B = 64;
                }
            }
            if (enoughPasswords) {
                break;
            }
        }

    }
}
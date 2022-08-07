package NestedLoops.MoreExercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char l1 = scanner.next().charAt(0);
        char l2 = scanner.next().charAt(0);
        char l3 = scanner.next().charAt(0);

        int count = 0;
        for (char a = l1; a <= l2; a++) {
            if (a != l3) {
                for (char b = l1; b <= l2 ; b++) {
                    if (b != l3) {
                        for (char c = l1; c <= l2; c++) {
                            if (c != l3) {
                                count ++;
                                System.out.printf("%c%c%c ", a, b, c);
                            }
                        }
                    }
                }
            }
        }

        System.out.print(count);

    }
}

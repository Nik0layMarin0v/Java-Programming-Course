package NestedLoops.MoreExercises;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String lastSector = scanner.nextLine();
        int rowsInFirstSector = Integer.parseInt(scanner.nextLine());
        int seatsInOddRow = Integer.parseInt(scanner.nextLine());

        int seatsInEvenRow = seatsInOddRow + 2;

        for (char c = 'A'; c <= lastSector.charAt(0); c++) {
            for (int i = 1; i <= rowsInFirstSector; i++) {
                if (i % 2 == 1) {
                    for (int j = 1; j <= seatsInOddRow; j++) {
                        System.out.printf("%c%d%d%n", c, i, j);
                    }
                } else {
                    for (int j = 1; j <= seatsInEvenRow; j++) {
                        System.out.printf("%c%d%d%n", c, i, j);
                    }
                }
            }
            rowsInFirstSector++;
        }

    }
}

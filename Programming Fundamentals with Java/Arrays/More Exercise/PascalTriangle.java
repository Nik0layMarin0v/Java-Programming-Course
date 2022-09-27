package arrays.moreExercise;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Integer[] oldRow = new Integer[1];
        for (int i = 1; i <= n; i++) {
            Integer[] newRow = new Integer[i];
            newRow[0] = 1;
            newRow[i - 1] = 1;
            if (i > 2) {
                for (int j = 1; j < i - 1; j++) {
                    newRow[j] = oldRow[j - 1] + oldRow[j];
                }
            }
            oldRow = newRow;
            for (int j = 0; j < newRow.length; j++) {
                System.out.print(newRow[j] + " ");
            }
            System.out.println();
        }



    }
}

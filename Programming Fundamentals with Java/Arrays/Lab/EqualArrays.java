package arrays.lab;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");
        String[] secondLine = scanner.nextLine().split(" ");

        int sum = 0;
        for (int i = 0; i < firstLine.length; i++) {
            int currentNum = Integer.parseInt(firstLine[i]);
            sum += currentNum;
            if (!firstLine[i].equals(secondLine[i])) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            } else if (i == firstLine.length - 1) {
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }
        }
    }
}

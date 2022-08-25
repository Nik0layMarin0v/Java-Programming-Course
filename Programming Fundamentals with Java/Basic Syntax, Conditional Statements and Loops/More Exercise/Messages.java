package basicSyntaxConditionalStatementsAndLoops.moreExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String number = scanner.nextLine();
            if (number.equals("0")) {
                System.out.print(" ");
                continue;
            }
            int digitLength = number.length();
            int num = Integer.parseInt(number);
            int mainDigit = num % 10;
            int offset = (mainDigit - 2) * 3;
            int letterIndex = offset + digitLength - 1 + 97;
            if (mainDigit >= 8) {
                letterIndex = offset + digitLength + 97;
            }
            char letter = (char) letterIndex;
            System.out.print(letter);
        }

    }
}

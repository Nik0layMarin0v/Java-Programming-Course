package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int firstNum = num;
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial = factorial * i;
            }
            sum += factorial;
            num = num / 10;
        }

        if (sum == firstNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

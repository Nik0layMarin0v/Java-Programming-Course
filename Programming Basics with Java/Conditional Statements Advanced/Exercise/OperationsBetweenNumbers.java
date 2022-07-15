package AdvancedConditionalStatements.Exercise;

import java.util.Scanner;
import java.util.logging.LoggingPermission;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String sign = scanner.nextLine();

        double result = 0.0;
        String evenOrOdd = "";
        switch (sign) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
        }

        if (result % 2 == 1) {
            evenOrOdd = "odd";
        } else {
            evenOrOdd = "even";
        }

        switch (sign) {
            case "+":
            case "-":
            case "*":
                System.out.printf("%d %s %d = %.0f - %s", num1, sign, num2, result, evenOrOdd);
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    System.out.printf("%d %s %d = %d", num1, sign, num2, num1 % num2);
                }
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    System.out.printf("%d %s %d = %.2f", num1, sign, num2, num1 * 1.0 / num2);
                }
                break;
        }
    }
}

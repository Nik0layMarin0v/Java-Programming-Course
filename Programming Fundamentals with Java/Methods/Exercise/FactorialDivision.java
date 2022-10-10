package methods.exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        long firstFactorial = factorialCalculating(num1);
        long secondFactorial = factorialCalculating(num2);
        double result = firstFactorial * 1.0 / secondFactorial;
        System.out.printf("%.2f", result);
    }

    public static long factorialCalculating(int a) {
        long result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
}

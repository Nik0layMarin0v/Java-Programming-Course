package dataTypesAndVariables.moreExercise;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= n; i++) {
            boolean primeOrNot = false;
            if (isPrime(i)) {
                primeOrNot = true;
            } else {
                primeOrNot = false;
            }
            System.out.printf("%d -> %b%n", i, primeOrNot);
        }


    }

    private static boolean isPrime(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }

        if (counter > 2) {
            return false;
        } else {
            return true;
        }
    }
}

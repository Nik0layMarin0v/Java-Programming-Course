package NestedLoops.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);
            int counter = 0;
            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    counter ++;
                }
            }
            if (counter <= 2) {
                primeSum += num;
            } else {
                nonPrimeSum += num;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);

    }
}

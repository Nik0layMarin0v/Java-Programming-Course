package arrays.lab;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < input.length; i++) {
            int currentNum = Integer.parseInt(input[i]);
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}

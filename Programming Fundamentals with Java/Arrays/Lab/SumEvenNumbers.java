package arrays.lab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int currentNum = Integer.parseInt(numbers[i]);
            if (currentNum % 2 == 0) {
                sum += currentNum;
            }
        }
        System.out.println(sum);
    }
}

package methods.lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(multiplyTheSums(num));
    }

    public static int getEvenSum(int n) {
        int sum = 0;
        while(n > 0) {
            int number = n % 10;
            if (number % 2 == 0) {
                sum += number;
            }
            n = n / 10;
        }
        return sum;
    }

    public static int getOddSum(int n) {
        int sum = 0;
        while(n > 0) {
            int number = n % 10;
            if (number % 2 != 0) {
                sum += number;
            }
            n = n / 10;
        }
        return sum;
    }

    public static int multiplyTheSums(int n) {
        int evenSum = getEvenSum(n);
        int oddSum = getOddSum(n);
        return evenSum * oddSum;
    }
}

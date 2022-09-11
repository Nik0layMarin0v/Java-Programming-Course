package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int number = Integer.parseInt(num);

        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}

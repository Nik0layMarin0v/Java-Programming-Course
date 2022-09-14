package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int days = 0;
        while (startingYield >= 100) {
            sum += startingYield - 26;
            startingYield -= 10;
            days++;
        }

        if (days > 0) {
            sum -= 26;
        }

        System.out.println(days);
        System.out.println(sum);
    }
}

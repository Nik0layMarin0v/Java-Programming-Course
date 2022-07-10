package FirstSteps.Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int timeAmount = Integer.parseInt(scanner.nextLine());
        double yearPercent = Double.parseDouble(scanner.nextLine());

        double sum = deposit + (timeAmount * ((deposit * yearPercent / 100) / 12));
        System.out.println(sum);

    }
}

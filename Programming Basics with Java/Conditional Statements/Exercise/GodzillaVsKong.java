package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double clothePrice = Double.parseDouble(scanner.nextLine());

        double decor = filmBudget * 0.10;

        double clothing = extras * clothePrice;
        if (extras > 150) {
            clothing = 0.9 * clothing;
        }

        double totalSum = decor + clothing;
        double diff = Math.abs(totalSum - filmBudget);

        if (filmBudget < totalSum){
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }

    }
}

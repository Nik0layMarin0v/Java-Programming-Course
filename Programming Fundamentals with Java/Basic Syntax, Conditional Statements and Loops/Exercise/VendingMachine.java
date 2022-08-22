package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();

        double sum = 0;
        while (!input1.equals("Start")) {
            double coins = Double.parseDouble(input1);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input1 = scanner.nextLine();
        }

        boolean validProduct = true;
        double price = 0;
        String input2 = scanner.nextLine();
        while (!input2.equals("End")) {
            if (input2.equals("Nuts")) {
                price = 2;
            } else if (input2.equals("Water")) {
                price = 0.7;
            } else if (input2.equals("Crisps")) {
                price = 1.5;
            } else if (input2.equals("Soda")) {
                price = 0.8;
            } else if (input2.equals("Coke")) {
                price = 1;
            } else {
                System.out.println("Invalid product");
                validProduct = false;
            }
            if (sum - price < 0) {
                System.out.println("Sorry, not enough money");
            } else if (validProduct) {
                System.out.printf("Purchased %s%n", input2);
                sum -= price;
            }
            input2 = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}

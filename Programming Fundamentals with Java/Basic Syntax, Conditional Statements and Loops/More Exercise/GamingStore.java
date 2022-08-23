package basicSyntaxConditionalStatementsAndLoops.moreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        double sum = 0;
        boolean end = true;
        while (!input.equals("Game Time")) {
            if (input.equals("OutFall 4")) {
                price = 39.99;
            } else if (input.equals("CS: OG")) {
                price = 15.99;
            } else if (input.equals("Zplinter Zell")) {
                price = 19.99;
            } else if (input.equals("Honored 2")) {
                price = 59.99;
            } else if (input.equals("RoverWatch")) {
                price = 29.99;
            } else if (input.equals("RoverWatch Origins Edition")) {
                price = 39.99;
            } else {
                System.out.println("Not Found");
                input = scanner.nextLine();
                continue;
            }
            if (sum + price <= currentBalance) {
                System.out.printf("Bought %s%n", input);
                sum += price;
                if (sum == currentBalance) {
                    System.out.println("Out of money!");
                    end = false;
                    break;
                }
            } else if (sum + price > currentBalance) {
                System.out.println("Too Expensive");
            }
            input = scanner.nextLine();
        }

        if (sum < currentBalance && end) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, currentBalance - sum);
        }
    }
}

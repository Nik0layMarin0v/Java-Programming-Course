package WhileLoop.MoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int requiredMoney = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;
        int cash = 0;
        int card = 0;
        int total = 0;
        int cashCounter = 0;
        int cardCounter = 0;
        boolean enoughMoney = false;

        while (!input.equals("End")) {
            int transaction = Integer.parseInt(input);
            count++;
            if (count % 2 == 1 && transaction <= 100) {
                System.out.println("Product sold!");
                cash += transaction;
                cashCounter++;
            } else if (count % 2 == 0 && transaction >= 10) {
                System.out.println("Product sold!");
                card += transaction;
                cardCounter++;
            } else if ((count % 2 == 1 && transaction > 100) || (count % 2 == 0 && transaction < 10)) {
                System.out.println("Error in transaction!");
            }
            total = card + cash;
            if (total >= requiredMoney) {
                enoughMoney = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (enoughMoney) {
            System.out.printf("Average CS: %.2f%n", 1.0 * cash / cashCounter);
            System.out.printf("Average CC: %.2f", 1.0 * card / cardCounter);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}

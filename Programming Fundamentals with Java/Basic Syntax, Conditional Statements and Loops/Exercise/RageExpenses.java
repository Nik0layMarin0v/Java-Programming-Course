package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = 0;
        int counter = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                expenses += headsetPrice + mousePrice + keyboardPrice;
                counter++;
            } else if (i % 2 == 0) {
                expenses += headsetPrice;
            } else if (i % 3 == 0) {
                expenses += mousePrice;
            }

            if (counter % 2 == 0 && counter > 0) {
                counter = 0;
                expenses += displayPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}

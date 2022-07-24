package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int days = 0;
        int spendDaysInARow = 0;
        boolean fail = false;

        while (tripPrice > availableMoney) {
            days ++;
            String status = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            if (status.equals("save")) {
                availableMoney = availableMoney + money;
                spendDaysInARow = 0;
            } else if (status.equals("spend")) {
                spendDaysInARow ++;
                if (money >= availableMoney) {
                    availableMoney = 0;
                } else {
                    availableMoney = availableMoney - money;
                }
            }

            if (spendDaysInARow == 5) {
                fail = true;
                break;
            }
        }

        if (fail) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }

    }
}

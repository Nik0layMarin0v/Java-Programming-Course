package ConditionalStatements.Exercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (num <= 100) {
            bonus = 5;
            double total = num + bonus;
        } else if (num > 1000) {
            bonus = 0.1 * num;

        } else {
            bonus = 0.2 * num;
        }

        double bonus2 = 0;
        if (num % 2 == 0) {
            bonus2 = bonus + 1;
        } else if (num % 5 == 0) {
            bonus2 = bonus + 2;
        } else {
            bonus2 = bonus;
        }
        System.out.println(bonus2);
        System.out.println(bonus2 + num);

    }
}

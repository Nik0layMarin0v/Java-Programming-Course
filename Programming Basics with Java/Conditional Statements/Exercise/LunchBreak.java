package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double leftTime = breakTime - ((breakTime / 4.0) + (breakTime / 8.0));
        double diff = Math.ceil(Math.abs(leftTime - duration));

        if (leftTime >= duration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, diff);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, diff);
        }

    }
}

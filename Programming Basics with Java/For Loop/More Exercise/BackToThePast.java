package ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double heritage = Double.parseDouble(scanner.nextLine());;
        int year = Integer.parseInt(scanner.nextLine());

        double money = 0;
        for (int i = 0; i <= year - 1800; i++) {
            if (i % 2 == 0) {
                money = money + 12000;
            } else {
                money = money + 12000 + 50 * (i + 18);
            }
        }

        double diff = Math.abs(money - heritage);
        if (heritage >= money) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }

    }
}

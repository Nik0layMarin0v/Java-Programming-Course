package ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble (scanner.nextLine());
        int puzzles = Integer.parseInt (scanner.nextLine());
        int dolls = Integer.parseInt (scanner.nextLine());
        int teddyBears = Integer.parseInt (scanner.nextLine());
        int minions = Integer.parseInt (scanner.nextLine());
        int trucks = Integer.parseInt (scanner.nextLine());

//          •	Пъзел - 2.60 лв.
//          •	Говореща кукла - 3 лв.
//          •	Плюшено мече - 4.10 лв.
//          •	Миньон - 8.20 лв.
//          •	Камионче - 2 лв.

        int count = puzzles + dolls + teddyBears + minions + trucks;
        double sum = (puzzles * 2.60) + (dolls * 3.0) + (teddyBears * 4.10) + (minions * 8.20) + (trucks * 2.0);

        if (count >= 50) {
            sum = 0.75 * sum;
        }

        sum = sum * 0.90;
        double diff = Math.abs(sum - tripPrice);

        if (sum >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}

package AdvancedConditionalStatements.MoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleNumber = Integer.parseInt(scanner.nextLine());

        double transport = 0;
        if (peopleNumber <= 4) {
            transport = budget * 0.75;
        } else if (peopleNumber <= 9) {
            transport = budget * 0.6;
        } else if (peopleNumber <= 24) {
            transport = budget * 0.5;
        } else if (peopleNumber <= 49) {
            transport = budget * 0.4;
        } else {
            transport = budget * 0.25;
        }

        double leftMoney = budget - transport;

        double neededMoney = 0;
        if (category.equals("VIP")) {
            neededMoney = peopleNumber * 499.99;
        } else if (category.equals("Normal")) {
            neededMoney = peopleNumber * 249.99;
        }

        double diff = Math.abs(neededMoney - leftMoney);
        if (leftMoney >= neededMoney) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }
}

package AdvancedConditionalStatements.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        switch (flowersType) {
            case "Roses":
                if (flowersCount > 80) {
                    totalPrice = flowersCount * 5 * 0.9;
                } else {
                    totalPrice = flowersCount * 5;
                }
                break;
            case "Dahlias":
                if (flowersCount > 90) {
                    totalPrice = flowersCount * 3.80 * 0.85;
                } else {
                    totalPrice = flowersCount * 3.80;
                }
                break;
            case "Tulips":
                if (flowersCount > 80) {
                    totalPrice = flowersCount * 2.80 * 0.85;
                } else {
                    totalPrice = flowersCount * 2.80;
                }
                break;
            case "Narcissus":
                if (flowersCount < 120) {
                    totalPrice = flowersCount * 3 * 1.15;
                } else {
                    totalPrice = flowersCount * 3;
                }
                break;
            case "Gladiolus":
                if (flowersCount < 80) {
                    totalPrice = flowersCount * 2.50 * 1.2;
                } else {
                    totalPrice = flowersCount * 2.50;
                }
                break;
        }

        double diff = Math.abs(totalPrice - budget);
        if (totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowersType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}

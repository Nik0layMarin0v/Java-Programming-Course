package AdvancedConditionalStatements.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rate = scanner.nextLine();

        double price = 0.0;
        switch (room) {
            case "room for one person":
                price = (days - 1) * 18.0;
                break;
            case "apartment":
                if (days < 10) {
                    price = (days - 1) * 25.00 * 0.7;
                } else if (days < 16) {
                    price = (days - 1) * 25.00 * 0.65;
                } else {
                    price = (days - 1) * 25.00 * 0.5;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = (days - 1) * 35.00 * 0.9;
                } else if (days < 16) {
                    price = (days - 1) * 35.00 * 0.85;
                } else {
                    price = (days - 1) * 35.00 * 0.8;
                }
                break;
        }

        if (rate.equals("positive")) {
            price = price * 1.25;
        } else if (rate.equals("negative")) {
            price = price * 0.9;
        }

        System.out.printf("%.2f", price);
    }
}

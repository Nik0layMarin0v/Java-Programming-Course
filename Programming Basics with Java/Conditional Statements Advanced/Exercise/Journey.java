package AdvancedConditionalStatements.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";
        double price = 0.0;

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    place = "Camp";
                    price = budget * 0.3;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    place = "Camp";
                    price = budget * 0.4;
                } else if (budget > 1000) {
                    destination = "Europe";
                    place = "Hotel";
                    price = budget * 0.9;
                }
                break;
            case "winter":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    place = "Hotel";
                    price = budget * 0.7;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    place = "Hotel";
                    price = budget * 0.8;
                } else if (budget > 1000) {
                    destination = "Europe";
                    place = "Hotel";
                    price = budget * 0.9;
                }
                break;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, price);
    }
}

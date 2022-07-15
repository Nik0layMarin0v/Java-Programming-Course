package AdvancedConditionalStatements.MoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String raceType = scanner.nextLine();

        double tax = 0;
        if (raceType.equals("trail")) {
            tax = juniors * 5.5 + seniors * 7;
        } else if (raceType.equals("cross-country")) {
            if (juniors + seniors >= 50) {
                tax = (juniors * 8 + seniors * 9.5) * 0.75;
            } else {
                tax = juniors * 8 + seniors * 9.5;
            }
        } else if (raceType.equals("downhill")) {
            tax = juniors * 12.25 + seniors * 13.75;
        } else if (raceType.equals("road")) {
            tax = juniors * 20 + seniors * 21.5;
        }

        double finalSum = tax * 0.95;
        System.out.printf("%.2f", finalSum);

    }
}

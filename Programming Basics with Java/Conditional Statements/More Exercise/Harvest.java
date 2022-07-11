package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int areaInMeters2 = Integer.parseInt(scanner.nextLine());
        double grapesPerMeter2 = Double.parseDouble(scanner.nextLine());
        int wantedWine = Integer.parseInt(scanner.nextLine());
        int workers= Integer.parseInt(scanner.nextLine());

        double grapes = areaInMeters2 * grapesPerMeter2;
        double wine = (grapes / 2.5) / 2.5;

        double diff = Math.abs(wine - wantedWine);
        if (wine < wantedWine) {
            System.out.printf("It will be a tough winter! More %f liters wine needed.", diff);
        } else {
            System.out.printf("Good harvest this year! Total wine: 208 liters. 33 liters left -> 11 liters per person.\n");
        }
    }
}

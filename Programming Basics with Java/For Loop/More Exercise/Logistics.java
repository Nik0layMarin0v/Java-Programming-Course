package ForLoop.MoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());

        int cargoInTones = 0;
        int microBus = 0;
        int truck = 0;
        int train = 0;

        for (int i = 0; i < times; i++) {
            int tones = Integer.parseInt(scanner.nextLine());

            if (tones <= 3) {
                microBus = microBus + tones;
                cargoInTones = cargoInTones + tones;
            } else if (tones <= 11) {
                truck = truck + tones;
                cargoInTones = cargoInTones + tones;
            } else {
                train = train + tones;
                cargoInTones = cargoInTones + tones;
            }

        }

        double averageCargo = 1.0 * (microBus * 200 + truck * 175 + train * 120) / cargoInTones;
        char percent = '%';

        System.out.printf("%.2f%n", averageCargo);
        System.out.printf("%.2f%c%n", microBus * 100.0 / cargoInTones, percent);
        System.out.printf("%.2f%c%n", truck * 100.0 / cargoInTones, percent);
        System.out.printf("%.2f%c", train * 100.0 / cargoInTones, percent);
    }
}

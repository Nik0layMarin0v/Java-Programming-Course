package ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double seconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double waterResistance = Math.floor(meters / 15) * 12.5;
        double totalSeconds = waterResistance + (meters * secondsPerMeter);

        double diff = Math.abs(seconds - totalSeconds);

            if (totalSeconds < seconds) {
                System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalSeconds);
        } else {
                System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
            }


    }
}

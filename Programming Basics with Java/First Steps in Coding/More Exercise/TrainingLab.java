package FirstSteps.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double widthInMeters = Double.parseDouble(scanner.nextLine());
        double heightInMeters = Double.parseDouble(scanner.nextLine());

        double cmHeight = heightInMeters * 100 - 100;
        double seatsInARow = Math.floor(cmHeight / 70);
        double cmWidth = widthInMeters * 100;
        double rows = Math.floor(cmWidth / 120);

        double seats = seatsInARow * rows - 3;

        System.out.printf("%.0f", seats);

    }
}

package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());

        int playTime = holidays * 127 + (365 - holidays)* 63;
        int diff = Math.abs(30000 - playTime);
        int hours = diff / 60;
        int minutes = diff % 60;

        if (playTime <= 30000) {
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play", hours, minutes);
        } else {
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play", hours, minutes);
        }
    }
}

package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int pointsAtTheBeginning = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int wins = 0;

        for (int i = 0; i < tournaments; i++) {
            String gameStatus = scanner.nextLine();

            switch (gameStatus) {
                case "W":
                    sum = sum + 2000;
                    wins = wins + 1;
                    break;
                case "F":
                    sum = sum + 1200;
                    break;
                case "SF":
                    sum = sum + 720;
                    break;
            }
        }

        char symbol = '%';
        System.out.printf("Final points: %d%n", sum + pointsAtTheBeginning);
        System.out.printf("Average points: %.0f%n", Math.floor(sum * 1.0 / tournaments));
        System.out.printf("%.2f%c", 100.0 * wins / tournaments, symbol);

    }
}

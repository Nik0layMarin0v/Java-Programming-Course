package ForLoop.MoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());

        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six= 0;
        double result = 0;

        for (int i = 0; i < moves; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > 50 ||number < 0) {
                result = result / 2;
                six = six + 1;
            } else if (number <= 9) {
                result = result + number * 0.2;
                one = one + 1;
            } else if (number <= 19) {
                result = result + number * 0.3;
                two = two + 1;
            } else if (number <= 29) {
                result = result + number * 0.4;
                three = three + 1;
            } else if (number <= 39) {
                result = result + 50;
                four = four + 1;
            } else {
                result = result + 100;
                five = five + 1;
            }
        }

        char percent = '%';
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%c%n", 1.0 * one * 100 / moves, percent);
        System.out.printf("From 10 to 19: %.2f%c%n", 1.0 * two * 100 / moves, percent);
        System.out.printf("From 20 to 29: %.2f%c%n", 1.0 * three * 100 / moves, percent);
        System.out.printf("From 30 to 39: %.2f%c%n", 1.0 * four * 100 / moves, percent);
        System.out.printf("From 40 to 50: %.2f%c%n", 1.0 * five * 100 / moves, percent);
        System.out.printf("Invalid numbers: %.2f%c%n", 1.0 * six * 100 / moves, percent);

    }
}
